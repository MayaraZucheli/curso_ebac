
package br.com.zuch.dao.jpa;

import br.com.zuch.dao.generic.jpa.GenericJpaDAO;
import br.com.zuch.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
