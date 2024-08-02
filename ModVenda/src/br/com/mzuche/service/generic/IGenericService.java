package br.com.mzuche.service.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.mzuche.domain.Persistente;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(E valor);

    void excluir(Long valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(E valor);


    T consultar(Long valor);

    public Collection<T> buscarTodos();

}