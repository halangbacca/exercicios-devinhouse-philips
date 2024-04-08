package org.senai.market.marketsenai.daos;
import jakarta.persistence.EntityManager;
import org.senai.market.marketsenai.models.Categoria;

public class CategoriaDAO {
    private EntityManager em;

    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }

}