package br.com.mzuche.dao.generic;
import java.io.Serializable;
import java.util.Collection;

import br.com.mzuche.domain.Persistente;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException;

    public void excluir(Long valor);

    void excluir(String valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(E valor);

    public Collection<T> buscarTodos();
}