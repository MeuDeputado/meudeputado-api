package br.com.meudeputado.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by victorximenis on 10/06/17.
 */
@Entity(name = "proposicoes")
public class Proposicao extends Model {

    private String tipo;
    private String numero;
    private String ano;
    private String nomeProposicao;
    private String idProposicao;
    private String idProposicaoPrincipal;
    private String nomeProposicaoOrigem;
    private String tipoProposicao;

    @Column(length=10485760)
    private String tema;

    @Column(length=10485760)
    private String ementa;

    @Column(length=10485760)
    private String explicacaoEmenta;

    @ManyToOne
    private Deputado autor;

    private String dataApresentacao;
    private String regimeTramitacao;
    private String dataUltimoDespacho;

    @Column(length=10485760)
    private String ultimoDespacho;
    private String apreciacao;

    @Column(length=10485760)
    private String indexacao;
    private String situacao;
    private String linkInteiroTeor;
    private String apensadas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNomeProposicao() {
        return nomeProposicao;
    }

    public void setNomeProposicao(String nomeProposicao) {
        this.nomeProposicao = nomeProposicao;
    }

    public String getIdProposicao() {
        return idProposicao;
    }

    public void setIdProposicao(String idProposicao) {
        this.idProposicao = idProposicao;
    }

    public String getIdProposicaoPrincipal() {
        return idProposicaoPrincipal;
    }

    public void setIdProposicaoPrincipal(String idProposicaoPrincipal) {
        this.idProposicaoPrincipal = idProposicaoPrincipal;
    }

    public String getNomeProposicaoOrigem() {
        return nomeProposicaoOrigem;
    }

    public void setNomeProposicaoOrigem(String nomeProposicaoOrigem) {
        this.nomeProposicaoOrigem = nomeProposicaoOrigem;
    }

    public String getTipoProposicao() {
        return tipoProposicao;
    }

    public void setTipoProposicao(String tipoProposicao) {
        this.tipoProposicao = tipoProposicao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getExplicacaoEmenta() {
        return explicacaoEmenta;
    }

    public void setExplicacaoEmenta(String explicacaoEmenta) {
        this.explicacaoEmenta = explicacaoEmenta;
    }

    public Deputado getAutor() {
        return autor;
    }

    public void setAutor(Deputado autor) {
        this.autor = autor;
    }

    public String getDataApresentacao() {
        return dataApresentacao;
    }

    public void setDataApresentacao(String dataApresentacao) {
        this.dataApresentacao = dataApresentacao;
    }

    public String getRegimeTramitacao() {
        return regimeTramitacao;
    }

    public void setRegimeTramitacao(String regimeTramitacao) {
        this.regimeTramitacao = regimeTramitacao;
    }

    public String getDataUltimoDespacho() {
        return dataUltimoDespacho;
    }

    public void setDataUltimoDespacho(String dataUltimoDespacho) {
        this.dataUltimoDespacho = dataUltimoDespacho;
    }

    public String getUltimoDespacho() {
        return ultimoDespacho;
    }

    public void setUltimoDespacho(String ultimoDespacho) {
        this.ultimoDespacho = ultimoDespacho;
    }

    public String getApreciacao() {
        return apreciacao;
    }

    public void setApreciacao(String apreciacao) {
        this.apreciacao = apreciacao;
    }

    public String getIndexacao() {
        return indexacao;
    }

    public void setIndexacao(String indexacao) {
        this.indexacao = indexacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getLinkInteiroTeor() {
        return linkInteiroTeor;
    }

    public void setLinkInteiroTeor(String linkInteiroTeor) {
        this.linkInteiroTeor = linkInteiroTeor;
    }

    public String getApensadas() {
        return apensadas;
    }

    public void setApensadas(String apensadas) {
        this.apensadas = apensadas;
    }
}
