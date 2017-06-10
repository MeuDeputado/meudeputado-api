package br.com.meudeputado.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by victorximenis on 10/06/17.
 */
@JacksonXmlRootElement(localName = "itemHistoricoLider")
public class ItemHistoricoLider {

    private String idHistoricoLider;
    private String idCargoLideranca;
    private String descricaoCargoLideranca;
    private String numOrdemCargo;
    private String dataDesignacao;
    private String dataTermino;
    private String codigoUnidadeLideranca;
    private String siglaUnidadeLideranca;
    private String idBlocoPartido;

    public String getIdHistoricoLider() {
        return idHistoricoLider;
    }

    public void setIdHistoricoLider(String idHistoricoLider) {
        this.idHistoricoLider = idHistoricoLider;
    }

    public String getIdCargoLideranca() {
        return idCargoLideranca;
    }

    public void setIdCargoLideranca(String idCargoLideranca) {
        this.idCargoLideranca = idCargoLideranca;
    }

    public String getDescricaoCargoLideranca() {
        return descricaoCargoLideranca;
    }

    public void setDescricaoCargoLideranca(String descricaoCargoLideranca) {
        this.descricaoCargoLideranca = descricaoCargoLideranca;
    }

    public String getNumOrdemCargo() {
        return numOrdemCargo;
    }

    public void setNumOrdemCargo(String numOrdemCargo) {
        this.numOrdemCargo = numOrdemCargo;
    }

    public String getDataDesignacao() {
        return dataDesignacao;
    }

    public void setDataDesignacao(String dataDesignacao) {
        this.dataDesignacao = dataDesignacao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getCodigoUnidadeLideranca() {
        return codigoUnidadeLideranca;
    }

    public void setCodigoUnidadeLideranca(String codigoUnidadeLideranca) {
        this.codigoUnidadeLideranca = codigoUnidadeLideranca;
    }

    public String getSiglaUnidadeLideranca() {
        return siglaUnidadeLideranca;
    }

    public void setSiglaUnidadeLideranca(String siglaUnidadeLideranca) {
        this.siglaUnidadeLideranca = siglaUnidadeLideranca;
    }

    public String getIdBlocoPartido() {
        return idBlocoPartido;
    }

    public void setIdBlocoPartido(String idBlocoPartido) {
        this.idBlocoPartido = idBlocoPartido;
    }
}
