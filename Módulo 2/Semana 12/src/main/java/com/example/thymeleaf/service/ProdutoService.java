package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Produto;
import com.example.thymeleaf.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public Produto salvarProduto(Produto produto) {
        return repository.save(produto);
    }

    public void deletaProduto(Long id) {
        repository.deleteById(id);
    }

    public Produto atualizaProduto(Produto produtoAtualizado, Long id) {
        Produto produto = repository.findById(id).orElseThrow(EntityNotFoundException::new);

        produto.setNome(produtoAtualizado.getNome());
        produto.setDescricao(produtoAtualizado.getDescricao());
        produto.setValor(produtoAtualizado.getValor());

        return repository.save(produto);
    }

}
