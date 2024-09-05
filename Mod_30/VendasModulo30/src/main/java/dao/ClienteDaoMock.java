package dao;

import java.util.Collection;

import domain.Cliente;
import exceptions.ExceptionDao;
import exceptions.ExceptionMaisDeUmRegistro;
import exceptions.ExceptionTable;
import exceptions.ExceptionTipoChaveNaoEncontrada;

public class ClienteDaoMock implements IClienteDAO {
	 
	public String salvar() {
		return null;
	}

	@Override
	public Boolean cadastrar(Cliente entity) throws ExceptionTipoChaveNaoEncontrada, ExceptionDao {
		return true;
	}

	@Override
	public void excluir(Long valor) throws ExceptionDao {

	}

	@Override
	public void alterar(Cliente entity) throws ExceptionTipoChaveNaoEncontrada, ExceptionDao {
a
	}

	@Override
	public Cliente consultar(Long valor) throws ExceptionMaisDeUmRegistro, ExceptionTable, ExceptionDao {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() throws ExceptionDao {
		return null;
	}
}
