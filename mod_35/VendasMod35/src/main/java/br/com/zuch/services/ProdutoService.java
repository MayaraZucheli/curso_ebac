
package br.com.zuch.services;

import br.com.zuch.dao.IProdutoDAO;
import br.com.zuch.domain.Produto;
import br.com.zuch.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
