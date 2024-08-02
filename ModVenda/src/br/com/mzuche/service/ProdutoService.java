package br.com.mzuche.service;

import br.com.mzuche.dao.IProdutoDAO;
import br.com.mzuche.domain.Produto;
import br.com.mzuche.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public Produto consultar(Long valor) {
        return null;
    }
}