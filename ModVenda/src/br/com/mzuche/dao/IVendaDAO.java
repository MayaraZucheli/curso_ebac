package br.com.mzuche.dao;

import br.com.mzuche.dao.generic.IGenericDAO;
import br.com.mzuche.domain.Venda;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}