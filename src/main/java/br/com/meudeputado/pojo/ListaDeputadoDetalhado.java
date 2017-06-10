package br.com.meudeputado.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by victorximenis on 10/06/17.
 */
@JacksonXmlRootElement(localName = "Deputados")
public class ListaDeputadoDetalhado {

    @JacksonXmlProperty(localName = "Deputado")
    private DeputadoDetalhado deputado;

    public DeputadoDetalhado getDeputado() {
        return deputado;
    }

    public void setDeputado(DeputadoDetalhado deputado) {
        this.deputado = deputado;
    }
}
