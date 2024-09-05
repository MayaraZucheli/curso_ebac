package br.com.zuch.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.zuch.dao.Persistente;
import br.com.zuch.dao.generic.IGenericDAO;
import br.com.zuch.exceptions.DAOException;
import br.com.zuch.exceptions.GenericException;
import br.com.zuch.exceptions.MaisDeUmRegistroException;
import br.com.zuch.exceptions.TableException;
import br.com.zuch.exceptions.TipoChaveNaoEncontradaException;

public abstract class GenericService<T extends Persistente, E extends Serializable> 
    implements IGenericService<T, E> {
    
    protected IGenericDAO<T,E> dao;
    
    public GenericService(IGenericDAO<T,E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) throws DAOException {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws DAOException {
        try {
            return this.dao.consultar(valor);
        } catch (MaisDeUmRegistroException | TableException e) {
            // Lançar uma exceção genérica com a mensagem e a causa do erro
            throw new GenericException("Erro ao consultar o registro", e);
        }
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }

}
