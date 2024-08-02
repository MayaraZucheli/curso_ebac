package br.com.mzuche;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.mzuche.dao.IProdutoDAO;
import br.com.mzuche.dao.ProdutoDAO;
import br.com.mzuche.domain.Produto;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;
import br.com.mzuche.service.IProdutoService;
import br.com.mzuche.service.ProdutoService;

import java.math.BigDecimal;

public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDAO();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("1c");
        produto.setDescricao("Dev");
        produto.setNome("iMac");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        produto.setNome("Mayara Zucheli");
        produtoService.alterar(produto);

        Assert.assertEquals("Mayara Zucheli", produto.getNome());
    }
}
