package org.example.service;

import java.util.List;

import org.example.domain.Cliente;
import org.example.exceptions.DAOException;
import org.example.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

    List<Cliente> filtrarClientes(String query);

}