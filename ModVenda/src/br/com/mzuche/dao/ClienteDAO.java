package br.com.mzuche.dao;

import br.com.mzuche.dao.generic.GenericDAO;
import br.com.mzuche.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEndereco(entity.getEndereco());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTelefone(entity.getTelefone());

    }

    @Override
    public void excluir(Long valor) {

    }
}