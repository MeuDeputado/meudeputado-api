package br.com.meudeputado.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by victorximenis on 10/06/17.
 */
@JacksonXmlRootElement(localName = "comissao")
public class Comissao {

    private String idOrgaoLegislativoCD;
    private String siglaComissao;
    private String nomeComissao;
    private String condicaoMembro;
    private String dataEntrada;
    private String dataSaida;

    public String getIdOrgaoLegislativoCD() {
        return idOrgaoLegislativoCD;
    }

    public void setIdOrgaoLegislativoCD(String idOrgaoLegislativoCD) {
        this.idOrgaoLegislativoCD = idOrgaoLegislativoCD;
    }

    public String getSiglaComissao() {
        return siglaComissao;
    }

    public void setSiglaComissao(String siglaComissao) {
        this.siglaComissao = siglaComissao;
    }

    public String getNomeComissao() {
        return nomeComissao;
    }

    public void setNomeComissao(String nomeComissao) {
        this.nomeComissao = nomeComissao;
    }

    public String getCondicaoMembro() {
        return condicaoMembro;
    }

    public void setCondicaoMembro(String condicaoMembro) {
        this.condicaoMembro = condicaoMembro;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
}
