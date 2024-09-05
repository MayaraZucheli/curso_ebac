package com.zuch.vendas.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.zuch.vendas.dao.IVendaDAO;
import com.zuch.vendas.domain.Venda;
import com.zuch.vendas.domain.Venda.Status;
import com.zuch.vendas.exceptions.DAOException;
import com.zuch.vendas.exceptions.TipoChaveNaoEncontradaException;
import com.zuch.vendas.service.generic.GenericService;

@Stateless
public class VendaService extends GenericService<Venda, Long> implements IVendaService {

    IVendaDAO dao;

    @Inject
    public VendaService(IVendaDAO dao) {
        super(dao);
        this.dao = dao;
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        dao.finalizarVenda(venda);
    }

    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        venda.setStatus(Status.CANCELADA);
        dao.cancelarVenda(venda);
    }

    @Override
    public Venda consultarComCollection(Long id) {
        return dao.consultarComCollection(id);
    }

    @Override
    public Venda cadastrar(Venda entity) throws TipoChaveNaoEncontradaException, DAOException {
        entity.setStatus(Status.INICIADA);
        return super.cadastrar(entity);
    }



}
