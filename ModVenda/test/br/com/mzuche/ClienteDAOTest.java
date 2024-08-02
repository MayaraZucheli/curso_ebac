package br.com.mzuche;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.mzuche.dao.ClienteDAO;
import br.com.mzuche.dao.IClienteDAO;
import br.com.mzuche.domain.Cliente;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDAO();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(333333333333L);
        cliente.setNome("Mayara");
        cliente.setCidade("São Paulo");
        cliente.setEndereco("Rua XXX");
        cliente.setEstado("SP");
        cliente.setNumero(0000);
        cliente.setTelefone(900000000L);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setCpf(00000000000L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);
    }


    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Mayara Z");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Mayara Z", cliente.getNome());
    }

    @Test
    public void buscarTodos() {
        Collection<Cliente> list = clienteDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);
    }
}