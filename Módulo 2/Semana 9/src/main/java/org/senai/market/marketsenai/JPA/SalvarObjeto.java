package org.senai.market.marketsenai.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.senai.market.marketsenai.daos.CategoriaDAO;
import org.senai.market.marketsenai.daos.ProdutoDAO;
import org.senai.market.marketsenai.models.Categoria;
import org.senai.market.marketsenai.models.Produto;

public class SalvarObjeto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Curso Python");
        produto.setDescricao("Curso da linguagem Pyhton");
        produto.setPreco(800);
        produto.setQtdEstoque(100);

        Categoria categoria = new Categoria();
        categoria.setNome("Cursos");

        produto.setCategoria(categoria);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("market");
        EntityManager em = factory.createEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);
        CategoriaDAO categoriaDAO = new CategoriaDAO(em);

        em.getTransaction().begin();

        categoriaDAO.cadastrar(categoria);
        produtoDAO.cadastrar(produto);

        em.getTransaction().commit();

        em.close();

    }
}