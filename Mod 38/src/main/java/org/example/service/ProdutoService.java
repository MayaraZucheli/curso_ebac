package org.example.service;

import java.util.List;

import javax.inject.Inject;

import org.example.dao.IProdutoDAO;
import org.example.domain.Produto;
import org.example.service.generic.GenericService;

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
