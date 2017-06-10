package br.com.meudeputado.controller;

import br.com.meudeputado.model.Deputado;
import br.com.meudeputado.model.Proposicao;
import br.com.meudeputado.repository.DeputadoRepository;
import br.com.meudeputado.repository.ProposicaoRepository;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.io.FileReader;
import java.util.List;

/**
 * Created by victorximenis on 10/06/17.
 */

@RestController
@RequestMapping("/proposicoes")
public class ProposicoesController {

    @Autowired
    private ProposicaoRepository proposicaoRepository;

    private static final String API_URL = "http://www.camara.leg.br/SitCamaraWS/Deputados.asmx/";

    @RequestMapping(method = RequestMethod.GET)
    public List<Proposicao> list() throws Exception {
        List<Proposicao> proposicoes = (List<Proposicao>)proposicaoRepository.findAll();
        return proposicoes;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Proposicao get(@PathVariable Long id) {
        Proposicao proposicao = proposicaoRepository.findOne(id);
        return proposicao;
    }

}
