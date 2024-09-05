package br.com.zuch.services;

import br.com.zuch.dao.IClienteDAO;
import br.com.zuch.domain.Cliente;
import br.com.zuch.exceptions.DAOException;
import br.com.zuch.exceptions.GenericException;
import br.com.zuch.exceptions.MaisDeUmRegistroException;
import br.com.zuch.exceptions.TableException;
import br.com.zuch.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // Lançar uma exceção genérica com a mensagem e a causa do erro
            throw new GenericException("Erro ao buscar cliente por CPF", e);
        }
    }

}
