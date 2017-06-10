package br.com.meudeputado.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * Created by victorximenis on 10/06/17.
 */
@JacksonXmlRootElement(localName = "Deputado")
public class DeputadoDetalhado {

    private String numLegislatura;
    private String email;
    private String nomeProfissao;
    private String dataNascimento;
    private String dataFalecimento;
    private String ufRepresentacaoAtual;
    private String situacaoNaLegislaturaAtual;
    private String ideCadastro;
    private String idParlamentarDeprecated;
    private String nomeParlamentarAtual;
    private String nomeCivil;
    private String sexo;

    private Partido partidoAtual;
    private Gabinete gabinete;

    List<Comissao> comissoes;

    private String cargosComissoes;

    List<PeriodoExercicio> periodosExercicio;

    private String historicoNomeParlamentar;
    private String filiacoesPartidarias;

    List<ItemHistoricoLider> historicoLider;

    public String getNumLegislatura() {
        return numLegislatura;
    }

    public void setNumLegislatura(String numLegislatura) {
        this.numLegislatura = numLegislatura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeProfissao() {
        return nomeProfissao;
    }

    public void setNomeProfissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataFalecimento() {
        return dataFalecimento;
    }

    public void setDataFalecimento(String dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }

    public String getUfRepresentacaoAtual() {
        return ufRepresentacaoAtual;
    }

    public void setUfRepresentacaoAtual(String ufRepresentacaoAtual) {
        this.ufRepresentacaoAtual = ufRepresentacaoAtual;
    }

    public String getSituacaoNaLegislaturaAtual() {
        return situacaoNaLegislaturaAtual;
    }

    public void setSituacaoNaLegislaturaAtual(String situacaoNaLegislaturaAtual) {
        this.situacaoNaLegislaturaAtual = situacaoNaLegislaturaAtual;
    }

    public String getIdeCadastro() {
        return ideCadastro;
    }

    public void setIdeCadastro(String ideCadastro) {
        this.ideCadastro = ideCadastro;
    }

    public String getIdParlamentarDeprecated() {
        return idParlamentarDeprecated;
    }

    public void setIdParlamentarDeprecated(String idParlamentarDeprecated) {
        this.idParlamentarDeprecated = idParlamentarDeprecated;
    }

    public String getNomeParlamentarAtual() {
        return nomeParlamentarAtual;
    }

    public void setNomeParlamentarAtual(String nomeParlamentarAtual) {
        this.nomeParlamentarAtual = nomeParlamentarAtual;
    }

    public String getNomeCivil() {
        return nomeCivil;
    }

    public void setNomeCivil(String nomeCivil) {
        this.nomeCivil = nomeCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Partido getPartidoAtual() {
        return partidoAtual;
    }

    public void setPartidoAtual(Partido partidoAtual) {
        this.partidoAtual = partidoAtual;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public List<Comissao> getComissoes() {
        return comissoes;
    }

    public void setComissoes(List<Comissao> comissoes) {
        this.comissoes = comissoes;
    }

    public String getCargosComissoes() {
        return cargosComissoes;
    }

    public void setCargosComissoes(String cargosComissoes) {
        this.cargosComissoes = cargosComissoes;
    }

    public List<PeriodoExercicio> getPeriodosExercicio() {
        return periodosExercicio;
    }

    public void setPeriodosExercicio(List<PeriodoExercicio> periodosExercicio) {
        this.periodosExercicio = periodosExercicio;
    }

    public String getHistoricoNomeParlamentar() {
        return historicoNomeParlamentar;
    }

    public void setHistoricoNomeParlamentar(String historicoNomeParlamentar) {
        this.historicoNomeParlamentar = historicoNomeParlamentar;
    }

    public String getFiliacoesPartidarias() {
        return filiacoesPartidarias;
    }

    public void setFiliacoesPartidarias(String filiacoesPartidarias) {
        this.filiacoesPartidarias = filiacoesPartidarias;
    }

    public List<ItemHistoricoLider> getHistoricoLider() {
        return historicoLider;
    }

    public void setHistoricoLider(List<ItemHistoricoLider> historicoLider) {
        this.historicoLider = historicoLider;
    }
}
