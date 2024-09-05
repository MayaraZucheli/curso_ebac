package br.com.zuch;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.zuch.dao.IProdutoDao;
import br.com.zuch.dao.ProdutoDao;
import br.com.zuch.domain.Produto;

public class ProdutoTest {

	
	public ProdutoTest() {

	}
	
	@Test
	public void cadastrar() {

		Produto prod = new Produto();
		

		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}

}
