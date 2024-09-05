package com.zuch.vendas.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.zuch.vendas.dao.IProdutoDAO;
import com.zuch.vendas.domain.Produto;
import com.zuch.vendas.service.generic.GenericService;

import java.util.List;

@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    private IProdutoDAO produtoDao;

    @Inject
    public ProdutoService(IProdutoDAO produtoDao) {
        super(produtoDao);
        this.produtoDao = produtoDao;
    }

    @Override
    public List<Produto> filtrarProdutos(String query) {
        return produtoDao.filtrarProdutos(query);
    }

}
