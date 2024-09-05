package org.example.service;

import java.util.List;

import org.example.domain.Produto;
import org.example.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}
