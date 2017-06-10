package br.com.meudeputado.controller;

import br.com.meudeputado.model.Deputado;
import br.com.meudeputado.repository.DeputadoRepository;
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
@RequestMapping("/deputados")
public class DeputadosController {

    @Autowired
    ServletContext context;

    @Autowired
    private DeputadoRepository deputadoRepository;

    private static final String API_URL = "http://www.camara.leg.br/SitCamaraWS/Deputados.asmx/";

    @RequestMapping(method = RequestMethod.GET)
    public List<Deputado> list() throws Exception {
        List<Deputado> deputados = (List<Deputado>)deputadoRepository.findAll();
        return deputados;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Deputado get(@PathVariable Long id) {
        Deputado deputado = deputadoRepository.findOne(id);
        return deputado;
    }

}
