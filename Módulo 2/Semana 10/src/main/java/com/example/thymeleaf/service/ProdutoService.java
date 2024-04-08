package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Produto;
import com.example.thymeleaf.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto findById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Produto> findAll() {
        return repository.findAll().stream().map(produto -> new Produto(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getDataLancamento(), produto.getValor())).collect(Collectors.toList());
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

    public void save(Produto produto) {
        repository.save(produto);
    }

}
