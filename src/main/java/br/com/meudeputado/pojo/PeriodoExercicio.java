package br.com.meudeputado.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by victorximenis on 10/06/17.
 */

@JacksonXmlRootElement(localName = "periodoExercicio")
public class PeriodoExercicio {

    private String siglaUFRepresentacao;
    private String situacaoExercicio;
    private String dataInicio;
    private String dataFim;
    private String idCausaFimExercicio;
    private String descricaoCausaFimExercicio;
    private String idCadastroParlamentarAnterior;

    public String getSiglaUFRepresentacao() {
        return siglaUFRepresentacao;
    }

    public void setSiglaUFRepresentacao(String siglaUFRepresentacao) {
        this.siglaUFRepresentacao = siglaUFRepresentacao;
    }

    public String getSituacaoExercicio() {
        return situacaoExercicio;
    }

    public void setSituacaoExercicio(String situacaoExercicio) {
        this.situacaoExercicio = situacaoExercicio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getIdCausaFimExercicio() {
        return idCausaFimExercicio;
    }

    public void setIdCausaFimExercicio(String idCausaFimExercicio) {
        this.idCausaFimExercicio = idCausaFimExercicio;
    }

    public String getDescricaoCausaFimExercicio() {
        return descricaoCausaFimExercicio;
    }

    public void setDescricaoCausaFimExercicio(String descricaoCausaFimExercicio) {
        this.descricaoCausaFimExercicio = descricaoCausaFimExercicio;
    }

    public String getIdCadastroParlamentarAnterior() {
        return idCadastroParlamentarAnterior;
    }

    public void setIdCadastroParlamentarAnterior(String idCadastroParlamentarAnterior) {
        this.idCadastroParlamentarAnterior = idCadastroParlamentarAnterior;
    }
}
