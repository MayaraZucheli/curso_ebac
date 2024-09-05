
package br.com.zuch.services;

import br.com.zuch.domain.Cliente;
import br.com.zuch.exceptions.DAOException;
import br.com.zuch.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {


	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
