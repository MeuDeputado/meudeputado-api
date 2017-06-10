package br.com.meudeputado.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by victorximenis on 10/06/17.
 */

@JacksonXmlRootElement(localName = "deputado")
public class Deputado {

    private String ideCadastro;
    private String codOrcamento;
    private String condicao;
    private String matricula;
    private String idParlamentar;
    private String nome;
    private String nomeParlamentar;
    private String urlFoto;
    private String sexo;
    private String uf;
    private String partido;
    private String gabinete;
    private String anexo;
    private String fone;
    private String email;

    private Comissoes comissoes;


    public String getIdeCadastro() {
        return ideCadastro;
    }

    public void setIdeCadastro(String ideCadastro) {
        this.ideCadastro = ideCadastro;
    }

    public String getCodOrcamento() {
        return codOrcamento;
    }

    public void setCodOrcamento(String codOrcamento) {
        this.codOrcamento = codOrcamento;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdParlamentar() {
        return idParlamentar;
    }

    public void setIdParlamentar(String idParlamentar) {
        this.idParlamentar = idParlamentar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeParlamentar() {
        return nomeParlamentar;
    }

    public void setNomeParlamentar(String nomeParlamentar) {
        this.nomeParlamentar = nomeParlamentar;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Comissoes getComissoes() {
        return comissoes;
    }

    public void setComissoes(Comissoes comissoes) {
        this.comissoes = comissoes;
    }
}
