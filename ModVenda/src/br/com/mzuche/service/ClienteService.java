package br.com.mzuche.service;


import br.com.mzuche.dao.IClienteDAO;
import br.com.mzuche.domain.Cliente;
import br.com.mzuche.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {


    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }
}