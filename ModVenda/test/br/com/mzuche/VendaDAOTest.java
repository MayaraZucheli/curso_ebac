package br.com.mzuche;

import org.junit.Before;
import org.junit.Test;

import br.com.mzuche.dao.*;
import br.com.mzuche.domain.Cliente;
import br.com.mzuche.domain.Produto;
import br.com.mzuche.domain.Venda;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;

import java.math.BigDecimal;
import java.time.Instant;

import static org.junit.Assert.*;

public class VendaDAOTest {

    private IVendaDAO vendaDao;

    private IClienteDAO clienteDao;

    private IProdutoDAO produtoDao;

    private Cliente cliente;

    private Produto produto;

    public VendaDAOTest() {
        vendaDao = new VendaDAO();
        clienteDao = new ClienteDAO();
        produtoDao = new ProdutoDAO();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        this.cliente = cadastrarCliente();
        this.produto = cadastrarProduto("1a", BigDecimal.TEN);
    }


    @Test
    public void pesquisar() throws TipoChaveNaoEncontradaException {
        Venda venda = criarVenda("1a");
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        Venda vendaConsultada = vendaDao.consultar(venda.getCodigo());
        assertNotNull(vendaConsultada);
        assertEquals(venda.getCodigo(), vendaConsultada.getCodigo());
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Venda venda = criarVenda("1b");
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(20)));
        assertTrue(venda.getStatus().equals(Venda.Status.INICIADA));
    }


    @Test
    public void cancelarVenda() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1c";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        venda.setStatus(Venda.Status.CANCELADA);
        vendaDao.alterar(venda);

        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        assertEquals(codigoVenda, vendaConsultada.getCodigo());
        assertEquals(Venda.Status.CANCELADA, vendaConsultada.getStatus());
    }

    @Test
    public void adicionarMaisProdutosDoMesmo() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1d";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        vendaConsultada.adicionarProduto(produto, 1);

        assertTrue(venda.getQuantidadeTotalProdutos() == 3);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(30)));
        assertTrue(venda.getStatus().equals(Venda.Status.INICIADA));
    }

    @Test
    public void adicionarMaisProdutosDiferentes() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1e";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        Produto prod = cadastrarProduto(codigoVenda, BigDecimal.valueOf(50));
        assertNotNull(prod);
        assertEquals(codigoVenda, prod.getCodigo());

        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        vendaConsultada.adicionarProduto(prod, 1);

        assertTrue(venda.getQuantidadeTotalProdutos() == 3);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(70)));
        assertTrue(venda.getStatus().equals(Venda.Status.INICIADA));
    }

    @Test
    public void salvarProdutoExistente() throws TipoChaveNaoEncontradaException {
        Venda venda = criarVenda("1f");
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);

        Boolean retorno1 = vendaDao.cadastrar(venda);
        assertFalse(retorno1);
        assertTrue(venda.getStatus().equals(Venda.Status.INICIADA));
    }

    @Test
    public void removerProduto() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1g";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        Produto prod = cadastrarProduto(codigoVenda, BigDecimal.valueOf(50));
        assertNotNull(prod);
        assertEquals(codigoVenda, prod.getCodigo());

        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        vendaConsultada.adicionarProduto(prod, 1);
        assertTrue(venda.getQuantidadeTotalProdutos() == 3);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(70)));


        vendaConsultada.removerProduto(prod, 1);
        assertTrue(venda.getQuantidadeTotalProdutos() == 2);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(20)));
        assertTrue(venda.getStatus().equals(Venda.Status.INICIADA));
    }

    @Test
    public void removerApenasUmProduto() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1h";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        Produto prod = cadastrarProduto(codigoVenda, BigDecimal.valueOf(50));
        assertNotNull(prod);
        assertEquals(codigoVenda, prod.getCodigo());

        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        vendaConsultada.adicionarProduto(prod, 1);
        assertTrue(venda.getQuantidadeTotalProdutos() == 3);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(70)));


        vendaConsultada.removerProduto(prod, 1);
        assertTrue(venda.getQuantidadeTotalProdutos() == 2);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(20)));
        assertTrue(venda.getStatus().equals(Venda.Status.INICIADA));
    }

    @Test
    public void removerTodosProdutos() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1i";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        Produto prod = cadastrarProduto(codigoVenda, BigDecimal.valueOf(40));
        assertNotNull(prod);
        assertEquals(codigoVenda, prod.getCodigo());

        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        vendaConsultada.adicionarProduto(prod, 1);
        assertTrue(venda.getQuantidadeTotalProdutos() == 3);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(80)));


        vendaConsultada.removerTodosProdutos();
        assertTrue(venda.getQuantidadeTotalProdutos() == 0);
        assertTrue(venda.getValorTotal().equals(BigDecimal.valueOf(0)));
        assertTrue(venda.getStatus().equals(Venda.Status.INICIADA));
    }

    @Test
    public void finalizarVenda() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1j";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        vendaDao.finalizarVenda(venda);

        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        assertEquals(venda.getCodigo(), vendaConsultada.getCodigo());
        assertEquals(venda.getStatus(), vendaConsultada.getStatus());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void tentarAdicionarProdutosVendaFinalizada() throws TipoChaveNaoEncontradaException {
        String codigoVenda = "1k";
        Venda venda = criarVenda(codigoVenda);
        Boolean retorno = vendaDao.cadastrar(venda);
        assertTrue(retorno);
        assertNotNull(venda);
        assertEquals(codigoVenda, venda.getCodigo());

        vendaDao.finalizarVenda(venda);
        Venda vendaConsultada = vendaDao.consultar(codigoVenda);
        assertEquals(venda.getCodigo(), vendaConsultada.getCodigo());
        assertEquals(venda.getStatus(), vendaConsultada.getStatus());

        vendaConsultada.adicionarProduto(this.produto, 1);

    }

    private Produto cadastrarProduto(String codigo, BigDecimal valor) throws TipoChaveNaoEncontradaException {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setDescricao("PC");
        produto.setNome("Macbook air ");
        produto.setValor(valor);
        produtoDao.cadastrar(produto);
        return produto;
    }

    private Cliente cadastrarCliente() throws TipoChaveNaoEncontradaException {
        Cliente cliente = new Cliente();
        cliente.setCpf(333333333333L);
        cliente.setNome("Mayara");
        cliente.setCidade("São Paulo");
        cliente.setEndereco("Rua XXX");
        cliente.setEstado("SP");
        cliente.setNumero(00);
        cliente.setTelefone(900000000L);
        clienteDao.cadastrar(cliente);
        return cliente;
    }

    private Venda criarVenda(String codigo) {
        Venda venda = new Venda();
        venda.setCodigo(codigo);
        venda.setDataVenda(Instant.now());
        venda.setCliente(this.cliente);
        venda.setStatus(Venda.Status.INICIADA);
        venda.adicionarProduto(this.produto, 4);
        return venda;
    }

}
