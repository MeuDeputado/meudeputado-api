package br.com.meudeputado.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by victorximenis on 10/06/17.
 */

@JacksonXmlRootElement(localName = "comissoes")
public class Comissoes {

    private String titular;
    private String suplente;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSuplente() {
        return suplente;
    }

    public void setSuplente(String suplente) {
        this.suplente = suplente;
    }
}
