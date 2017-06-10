package br.com.meudeputado.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by victorximenis on 10/06/17.
 */
@Entity(name = "deputados")
public class Deputado extends Model {

    // 6
    private String idParlamentar;

    // 7
    private String ideCadastro;

    // 1
    private String codOrcamento;

    // 8
    private String matricula;

    // 2
    private String condicao;

    // 9
    private String nome;

    // 10
    private String nomeParlamentar;

    // 3
    private String email;

    // 5
    private String gabinete;

    // 0
    private String anexo;

    // 4
    private String fone;

    // 12
    private String sexo;

    // 11
    private String partido;

    // 13
    private String uf;

    // 14
    private String urlFoto;

    @OneToMany(mappedBy = "autor")
    private List<Proposicao> proposicoes;

    public String getIdParlamentar() {
        return idParlamentar;
    }

    public void setIdParlamentar(String idParlamentar) {
        this.idParlamentar = idParlamentar;
    }

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @JsonIgnoreProperties(value = "autor")
    public List<Proposicao> getProposicoes() {
        return proposicoes;
    }

    public void setProposicoes(List<Proposicao> proposicoes) {
        this.proposicoes = proposicoes;
    }
}
