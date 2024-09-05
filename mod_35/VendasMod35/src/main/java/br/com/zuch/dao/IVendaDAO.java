
package br.com.zuch.dao;

import br.com.zuch.dao.generic.IGenericDAO;
import br.com.zuch.domain.Venda;
import br.com.zuch.exceptions.DAOException;
import br.com.zuch.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
