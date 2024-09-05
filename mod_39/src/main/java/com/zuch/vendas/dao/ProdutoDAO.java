package com.zuch.vendas.dao;

import javax.persistence.TypedQuery;

import com.zuch.vendas.dao.IProdutoDAO;
import com.zuch.vendas.dao.generic.GenericDAO;
import com.zuch.vendas.domain.Produto;

import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super(Produto.class);
    }

    @Override
    public List<Produto> filtrarProdutos(String query) {
        TypedQuery<Produto> tpQuery =
                this.entityManager.createNamedQuery("Produto.findByNome", this.persistenteClass);
        tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
    }

}
