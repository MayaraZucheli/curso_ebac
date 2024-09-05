
package br.com.zuch.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.zuch.dao.Persistente;
import br.com.zuch.exceptions.DAOException;
import br.com.zuch.exceptions.MaisDeUmRegistroException;
import br.com.zuch.exceptions.TableException;
import br.com.zuch.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericJapDAO <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

 
    public Collection<T> buscarTodos() throws DAOException;
}
