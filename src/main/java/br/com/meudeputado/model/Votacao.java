package br.com.meudeputado.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by victorximenis on 10/06/17.
 */
@Entity(name = "votacoes")
public class Votacao extends Model {

    private String tipo;
    private String numPro;
    private String ano;
    private String idVotacao;
    private String data;
    private String hora;
    private String sessao;
    private String nome;

    @ManyToOne
    private Deputado deputado;

    private Boolean voto;
    private Boolean orientacaoPartido;
    private Boolean orientacaoGoverno;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumPro() {
        return numPro;
    }

    public void setNumPro(String numPro) {
        this.numPro = numPro;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getIdVotacao() {
        return idVotacao;
    }

    public void setIdVotacao(String idVotacao) {
        this.idVotacao = idVotacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Deputado getDeputado() {
        return deputado;
    }

    public void setDeputado(Deputado deputado) {
        this.deputado = deputado;
    }

    public Boolean getVoto() {
        return voto;
    }

    public void setVoto(Boolean voto) {
        this.voto = voto;
    }

    public Boolean getOrientacaoPartido() {
        return orientacaoPartido;
    }

    public void setOrientacaoPartido(Boolean orientacaoPartido) {
        this.orientacaoPartido = orientacaoPartido;
    }

    public Boolean getOrientacaoGoverno() {
        return orientacaoGoverno;
    }

    public void setOrientacaoGoverno(Boolean orientacaoGoverno) {
        this.orientacaoGoverno = orientacaoGoverno;
    }
}
