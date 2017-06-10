package br.com.meudeputado.repository;

import br.com.meudeputado.model.Deputado;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by victorximenis on 10/06/17.
 */
public interface DeputadoRepository extends CrudRepository<Deputado, Long> {

    Deputado findByIdeCadastro(String ideCadastro);

}
