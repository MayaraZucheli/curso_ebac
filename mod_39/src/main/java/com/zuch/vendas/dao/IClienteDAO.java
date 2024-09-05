package com.zuch.vendas.dao;

import java.util.List;

import com.zuch.vendas.dao.generic.IGenericDAO;
import com.zuch.vendas.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    List<Cliente> filtrarClientes(String query);

}
