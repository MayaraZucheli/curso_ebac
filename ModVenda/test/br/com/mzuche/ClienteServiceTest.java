package br.com.mzuche;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.mzuche.dao.ClienteDAO;
import br.com.mzuche.dao.IClienteDAO;
import br.com.mzuche.domain.Cliente;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;
import br.com.mzuche.service.ClienteService;
import br.com.mzuche.service.IClienteService;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAO();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(333333333333L);
        cliente.setNome("Mayara");
        cliente.setCidade("São Paulo");
        cliente.setEndereco("Rua XXX");
        cliente.setEstado("SP");
        cliente.setNumero(00);
        cliente.setTelefone(900000000L);

    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Mayara");
        clienteService.alterar(cliente);
        Assert.assertEquals("Mayara", cliente.getNome());
    }
}