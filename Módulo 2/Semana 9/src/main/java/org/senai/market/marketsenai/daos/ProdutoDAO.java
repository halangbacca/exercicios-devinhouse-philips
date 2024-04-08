package org.senai.market.marketsenai.daos;
import jakarta.persistence.EntityManager;
import org.senai.market.marketsenai.models.Produto;

public class ProdutoDAO {
    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

}

