package org.example.service;


import org.example.dao.generic.IGenericDAO;
import org.example.domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

    public void finalizarVenda(Venda venda);

    public void cancelarVenda(Venda venda);

    public Venda consultarComCollection(Long id);

}