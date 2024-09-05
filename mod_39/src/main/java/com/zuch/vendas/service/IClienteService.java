package com.zuch.vendas.service;

import java.util.List;

import com.zuch.vendas.domain.Cliente;
import com.zuch.vendas.exceptions.DAOException;
import com.zuch.vendas.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

    List<Cliente> filtrarClientes(String query);

}