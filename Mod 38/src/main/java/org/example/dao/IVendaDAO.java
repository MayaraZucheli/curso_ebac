package org.example.dao;


import org.example.dao.generic.IGenericDAO;
import org.example.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

    void finalizarVenda(Venda venda);

    void cancelarVenda(Venda venda);

    Venda consultarComCollection(Long id);

}
