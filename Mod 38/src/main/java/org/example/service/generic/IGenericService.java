package org.example.service.generic;

import java.io.Serializable;
import java.util.Collection;

import org.example.domain.Persistente;
import org.example.exceptions.DAOException;
import org.example.exceptions.MaisDeUmRegistroException;
import org.example.exceptions.TableException;
import org.example.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService<T extends Persistente, E extends Serializable> {

   
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    
    public void excluir(T entity) throws DAOException;

    
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

  
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

   
    public Collection<T> buscarTodos() throws DAOException;

}
