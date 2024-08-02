package br.com.mzuche;

import org.junit.Before;
import org.junit.Test;

import br.com.mzuche.dao.IProdutoDAO;
import br.com.mzuche.dao.ProdutoDAO;
import br.com.mzuche.domain.Produto;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;

import org.junit.Assert;
import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ProdutoDAOTest {

    private IProdutoDAO produtoDao;

    private Produto produto;

    public ProdutoDAOTest() {
        produtoDao = new ProdutoDAO();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setCodigo("1a");
        produto.setDescricao("PC");
        produto.setNome("Notebook Dell");
        produto.setValor(BigDecimal.TEN);
        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisar() {
        Produto produto = this.produtoDao.consultar(this.produto.getCodigo());
        Assert.assertNotNull(produto);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        produto.setCodigo("1b");
        Boolean retorno = produtoDao.cadastrar(produto);
        assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoDao.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException {
        produto.setNome("TV");
        produtoDao.alterar(produto);

        Assert.assertEquals("TV", produto.getNome());
    }

    @Test
    public void buscarTodos() {
        Collection<Produto> list = produtoDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);
    }
}
