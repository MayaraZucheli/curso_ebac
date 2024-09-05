package br.com.zuch.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.zuch.domain.Cliente;
import br.com.zuch.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDaoMock implements IClienteDAO {

    private Map<Long, Cliente> clientes = new HashMap<>();

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        if (entity == null || entity.getCpf() == null) {
            throw new TipoChaveNaoEncontradaException("Cliente ou CPF não pode ser nulo");
        }
        clientes.put(entity.getCpf(), entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
        if (valor == null || !clientes.containsKey(valor)) {
            throw new TipoChaveNaoEncontradaException("Cliente com CPF " + valor + " não encontrado");
        }
        clientes.remove(valor);
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
        if (entity == null || entity.getCpf() == null || !clientes.containsKey(entity.getCpf())) {
            throw new TipoChaveNaoEncontradaException("Cliente ou CPF não encontrado para alteração");
        }
        clientes.put(entity.getCpf(), entity);
    }

    @Override
    public Cliente consultar(Long valor) {
        return clientes.get(valor);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return new ArrayList<>(clientes.values());
    }
}
