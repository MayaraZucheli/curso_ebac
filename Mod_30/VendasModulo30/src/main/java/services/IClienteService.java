package services;


import domain.Cliente;
import exceptions.ExceptionDao;
import exceptions.ExceptionTipoChaveNaoEncontrada;
import services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
	
	Cliente buscarPorCPF(Long cpf) throws ExceptionDao;
	
}
