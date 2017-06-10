package br.com.meudeputado.enums;

/**
 * Created by victorximenis on 10/06/17.
 */
public enum ApiUrl {

    OBTER_DEPUTADOS("ObterDeputados"),
    OBTER_DETALHES_DEPUTADO("ObterDetalhesDeputado");

    private String descricao;

    private ApiUrl(String descricao) {
        this.descricao = descricao;
    }

}
