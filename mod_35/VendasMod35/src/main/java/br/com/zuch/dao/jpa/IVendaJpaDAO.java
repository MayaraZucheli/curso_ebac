
package br.com.zuch.dao.jpa;

import br.com.zuch.dao.generic.jpa.IGenericJapDAO;
import br.com.zuch.domain.jpa.VendaJpa;
import br.com.zuch.exceptions.DAOException;
import br.com.zuch.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	

	public VendaJpa consultarComCollection(Long id);
}
