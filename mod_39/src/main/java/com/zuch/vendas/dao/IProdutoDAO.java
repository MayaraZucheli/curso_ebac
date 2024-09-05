package com.zuch.vendas.dao;

import java.util.List;

import com.zuch.vendas.dao.generic.IGenericDAO;
import com.zuch.vendas.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}
