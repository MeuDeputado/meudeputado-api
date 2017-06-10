package br.com.meudeputado.controller;

import br.com.meudeputado.enums.ApiUrl;
import br.com.meudeputado.pojo.DeputadoDetalhado;
import br.com.meudeputado.pojo.ListaDeputadoDetalhado;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.meudeputado.pojo.Deputado;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by victorximenis on 10/06/17.
 */

@RestController
@RequestMapping("/deputados")
public class DeputadosController {

    private static final String API_URL = "http://www.camara.leg.br/SitCamaraWS/Deputados.asmx/";

    @RequestMapping(method = RequestMethod.GET)
    public List<Deputado> list() throws Exception {

        List<Deputado> deputadosList = new ArrayList<Deputado>();

        String genreXml = IOUtils.toString(new URL(API_URL + ApiUrl.OBTER_DEPUTADOS), "UTF-8");

        XmlMapper mapper = new XmlMapper();
        List<Deputado> deputados = mapper.readValue(genreXml,
                mapper.getTypeFactory().constructCollectionType(List.class, Deputado.class));

        return deputados;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ideCadastro}/{numLegislatura}")
    public DeputadoDetalhado get(@PathVariable String ideCadastro, @PathVariable String numLegislatura) throws Exception {

        if (ideCadastro != null && numLegislatura != null) {
            String genreXml = IOUtils.toString(new URL(API_URL + ApiUrl.OBTER_DETALHES_DEPUTADO + "?ideCadastro=" +
                    ideCadastro + "&numLegislatura=" + numLegislatura), "UTF-8");
            XmlMapper mapper = new XmlMapper();
            ListaDeputadoDetalhado listaDeputadoDetalhado = mapper.readValue(genreXml, ListaDeputadoDetalhado.class);
            return listaDeputadoDetalhado.getDeputado();
        }

        return null;

    }

}
