package br.com.zuch.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.zuch.domain.Produto;
import br.com.zuch.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDaoMock implements IProdutoDAO {

    private Map<String, Produto> produtos = new HashMap<>();

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        if (entity == null || entity.getCodigo() == null) {
            throw new TipoChaveNaoEncontradaException("Produto ou código não pode ser nulo");
        }
        produtos.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public void excluir(String valor) {
        if (valor == null || !produtos.containsKey(valor)) {
            throw new TipoChaveNaoEncontradaException("Produto com código " + valor + " não encontrado");
        }
        produtos.remove(valor);
    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        if (entity == null || entity.getCodigo() == null || !produtos.containsKey(entity.getCodigo())) {
            throw new TipoChaveNaoEncontradaException("Produto ou código não encontrado para alteração");
        }
        produtos.put(entity.getCodigo(), entity);
    }

    @Override
    public Produto consultar(String valor) {
        return produtos.get(valor);
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return new ArrayList<>(produtos.values());
    }
}

