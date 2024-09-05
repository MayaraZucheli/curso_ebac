
package br.com.zuch.dao;

import br.com.zuch.dao.generic.jpa.GenericJpaDAO;
import br.com.zuch.dao.jpa.IVendaJpaDAO;
import br.com.zuch.domain.jpa.VendaJpa;
import br.com.zuch.exceptions.DAOException;
import br.com.zuch.exceptions.TipoChaveNaoEncontradaException;


public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
