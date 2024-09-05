package com.zuch.vendas.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.zuch.vendas.dao.IClienteDAO;
import com.zuch.vendas.domain.Cliente;
import com.zuch.vendas.exceptions.DAOException;
import com.zuch.vendas.exceptions.MaisDeUmRegistroException;
import com.zuch.vendas.exceptions.TableException;
import com.zuch.vendas.service.generic.GenericService;

import java.util.List;

@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    @Inject
    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Cliente> filtrarClientes(String query) {
        return clienteDAO.filtrarClientes(query);
    }

}
