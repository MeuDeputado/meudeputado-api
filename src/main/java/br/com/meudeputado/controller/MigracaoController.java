package br.com.meudeputado.controller;

import br.com.meudeputado.model.Deputado;
import br.com.meudeputado.model.Proposicao;
import br.com.meudeputado.repository.DeputadoRepository;
import br.com.meudeputado.repository.ProposicaoRepository;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.io.FileReader;

/**
 * Created by victorximenis on 10/06/17.
 */

@RestController
@RequestMapping("/migracao")
public class MigracaoController {

    @Autowired
    ServletContext context;

    @Autowired
    private DeputadoRepository deputadoRepository;

    @Autowired
    private ProposicaoRepository proposicaoRepository;

    @RequestMapping(method = RequestMethod.GET, value = "deputados")
    public void deputados() throws Exception {

        String csvFilePath = context.getRealPath("/reports/") + "deputados-detalhes.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFilePath));
        String[] nextLine;
        boolean isFirst = true;

        while ((nextLine = reader.readNext()) != null) {
            if (!isFirst) {

                Deputado deputado = new Deputado();
                deputado.setIdParlamentar(nextLine[6]);
                deputado.setIdeCadastro(nextLine[7]);
                deputado.setCodOrcamento(nextLine[1]);
                deputado.setMatricula(nextLine[8]);
                deputado.setCondicao(nextLine[2]);
                deputado.setNome(nextLine[9]);
                deputado.setNomeParlamentar(nextLine[10]);
                deputado.setEmail(nextLine[3]);
                deputado.setGabinete(nextLine[5]);
                deputado.setAnexo(nextLine[0]);
                deputado.setFone(nextLine[4]);
                deputado.setSexo(nextLine[12]);
                deputado.setPartido(nextLine[11]);
                deputado.setUf(nextLine[13]);
                deputado.setUrlFoto(nextLine[14]);

                deputadoRepository.save(deputado);
            } else {
                isFirst = false;
            }
        }

    }

    @RequestMapping(method = RequestMethod.GET, value = "proposicoes")
    public void list() throws Exception {

        String csvFilePath = context.getRealPath("/reports/") + "proposicoes.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFilePath));
        String[] nextLine;
        boolean isFirst = true;

        while ((nextLine = reader.readNext()) != null) {
            if (!isFirst) {

                Proposicao proposicao = new Proposicao();
                proposicao.setTipo(nextLine[0]);
                proposicao.setNumero(nextLine[1]);
                proposicao.setAno(nextLine[2]);
                proposicao.setNomeProposicao(nextLine[3]);
                proposicao.setIdProposicao(nextLine[4]);
                proposicao.setIdProposicaoPrincipal(nextLine[5]);
                proposicao.setNomeProposicaoOrigem(nextLine[6]);
                proposicao.setTipoProposicao(nextLine[7]);
                proposicao.setTema(nextLine[8]);
                proposicao.setEmenta(nextLine[9]);
                proposicao.setExplicacaoEmenta(nextLine[10]);

                Deputado deputado = deputadoRepository.findByIdeCadastro(nextLine[12]);
                proposicao.setAutor(deputado);

                proposicao.setDataApresentacao(nextLine[15]);
                proposicao.setRegimeTramitacao(nextLine[16]);
                proposicao.setDataUltimoDespacho(nextLine[17]);
                proposicao.setUltimoDespacho(nextLine[18]);
                proposicao.setApreciacao(nextLine[19]);
                proposicao.setIndexacao(nextLine[20]);
                proposicao.setSituacao(nextLine[21]);
                proposicao.setLinkInteiroTeor(nextLine[22]);
                proposicao.setApensadas(nextLine[23]);

                proposicaoRepository.save(proposicao);

            } else {
                isFirst = false;
            }
        }

    }

}
