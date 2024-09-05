
package br.com.zuch.dao.jpa;

import br.com.zuch.dao.generic.jpa.GenericJpaDAO;
import br.com.zuch.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
