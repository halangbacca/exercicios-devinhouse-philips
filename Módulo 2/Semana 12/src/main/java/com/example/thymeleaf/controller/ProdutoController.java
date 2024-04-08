package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Produto;
import com.example.thymeleaf.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping("/todos")
    public List<Produto> listarProdutos() {
        return service.listarProdutos();
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto) {
        return service.salvarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deletaProduto(@PathVariable Long id) {
        service.deletaProduto(id);
    }

    @PutMapping("/{id}")
    public Produto atualizaProduto(@RequestBody Produto produto, @PathVariable Long id) {
        return service.atualizaProduto(produto, id);
    }

}

