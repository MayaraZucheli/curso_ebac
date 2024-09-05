package org.example.dao;

import java.util.List;

import org.example.dao.generic.IGenericDAO;
import org.example.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}