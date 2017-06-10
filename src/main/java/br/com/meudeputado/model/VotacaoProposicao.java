package br.com.meudeputado.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by victorximenis on 10/06/17.
 */
@XmlRootElement(namespace = "proposicao")
public class VotacaoProposicao {

    private String sigla;
    private String numero;

}
