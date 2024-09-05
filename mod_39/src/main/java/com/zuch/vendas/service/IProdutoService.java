package com.zuch.vendas.service;

import java.util.List;

import com.zuch.vendas.domain.Produto;
import com.zuch.vendas.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}