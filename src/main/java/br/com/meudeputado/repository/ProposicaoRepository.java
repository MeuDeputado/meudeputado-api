package br.com.meudeputado.repository;

import br.com.meudeputado.model.Proposicao;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by victorximenis on 10/06/17.
 */
public interface ProposicaoRepository extends CrudRepository<Proposicao, Long> {
}
