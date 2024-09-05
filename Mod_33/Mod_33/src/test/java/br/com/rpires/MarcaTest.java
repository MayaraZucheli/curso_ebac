package br.com.zuch;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.zuch.dao.IMarcaDao;
import br.com.zuch.dao.MarcaDao;
import br.com.zuch.domain.Marca;

public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrarMarca() {
        Marca marca = new Marca();
        marca.setNome("Marca Teste");
        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
