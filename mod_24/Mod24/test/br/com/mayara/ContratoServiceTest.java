package br.com.mayara;

import br.com.mayara.dao.ContratoDao;
import br.com.mayara.dao.IContratoDao;
import br.com.mayara.dao.mocks.ContratoDaoMock;
import br.com.mayara.service.ContratoService;
import br.com.mayara.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retornoSalvar = service.salvar();
        Assert.assertEquals("Sucesso", retornoSalvar);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoSalvarBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retornoSalvar = service.salvar();
        Assert.assertEquals("Sucesso", retornoSalvar);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retornoExcluir = service.excluir();
        Assert.assertEquals("Sucesso", retornoExcluir);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retornoExcluir = service.excluir();
        Assert.assertEquals("Sucesso", retornoExcluir);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retornoAtualizar = service.atualizar();
        Assert.assertEquals("Sucesso", retornoAtualizar);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoAtualizarBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retornoAtualizar = service.atualizar();
        Assert.assertEquals("Sucesso", retornoAtualizar);
    }
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retornoBuscar = service.buscar();
        Assert.assertEquals("Sucesso", retornoBuscar);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoBuscarBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retornoBuscar = service.buscar();
        Assert.assertEquals("Sucesso", retornoBuscar);
    }
}