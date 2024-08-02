package br.com.mzuche.dao;

import br.com.mzuche.dao.generic.GenericDAO;
import br.com.mzuche.domain.Venda;
import br.com.mzuche.exceptions.TipoChaveNaoEncontradaException;

public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("Operação Inválida!");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        super.alterar(venda);
    }

}
