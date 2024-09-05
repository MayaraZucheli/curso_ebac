package org.example.dao;

import java.util.List;

import org.example.dao.generic.IGenericDAO;
import org.example.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    List<Cliente> filtrarClientes(String query);

}