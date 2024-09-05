package br.com.zuch;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.zuch.dao.IAcessorioDao;
import br.com.zuch.dao.AcessorioDao;
import br.com.zuch.domain.Acessorio;

public class AcessorioTest {

    private IAcessorioDao acessorioDao;

    public AcessorioTest() {
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrarAcessorio() {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Acessorio Teste");
        acessorio = acessorioDao.cadastrar(acessorio);

        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
