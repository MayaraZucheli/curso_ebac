package services;

import dao.IClienteDAO;
import exceptions.ExceptionDao;
import exceptions.ExceptionMaisDeUmRegistro;
import exceptions.ExceptionTable;
import services.generic.GenericService;
import domain.Cliente;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService{
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}
	
	public Cliente buscarPorCPF(Long cpf) throws ExceptionDao {
		try {
			return this.dao.consultar(cpf);
		} catch (ExceptionMaisDeUmRegistro | ExceptionTable e) {
			e.printStackTrace();
		}
		return null;
	}

}
