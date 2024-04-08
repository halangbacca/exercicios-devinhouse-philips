package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Produto;
import com.example.thymeleaf.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/formulario")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public String chamaFormularioDeCadastro(Produto produto, Model model) {
        return "formulario";
    }

//    @GetMapping
//    public String getProduto(Model model) {
//        model.addAttribute("nome", "Xiaomi Redmi Note 8 Pro");
//        model.addAttribute("descricao", "Smartphone intermediário premium");
//        model.addAttribute("dataLancamento", "2019");
//        model.addAttribute("valor", "R$ 2.000");
//
//        Produto produto = service.findById(1L);
//        produto.setNome("Xiaomi Redmi Note 8 Pro");
//        produto.setDescricao("Smartphone intermediário premium");
//        produto.setDataLancamento("2019");
//        produto.setValor(1800.00);
//
//        model.addAttribute("produto", produto);
//        return "lista_produtos";
//    }

    @GetMapping("/lista")
    public String listarProdutos(Model model) {

        List<Produto> produtos = service.findAll();

        model.addAttribute("produtos", produtos);

        return "lista_produtos";
    }

    @PostMapping
    public String postFormulario(@Validated Produto novoProduto, Model model) {
        Produto produto = new Produto();
        produto.setNome(novoProduto.getNome());
        produto.setDescricao(novoProduto.getDescricao());
        produto.setDataLancamento(novoProduto.getDataLancamento());
        produto.setValor(novoProduto.getValor());

        service.save(produto);

        return "redirect:formulario/lista";
    }

    @GetMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable("id") Long id, Model model) {
        service.deleteById(id);

        List<Produto> produtos = service.findAll();

        model.addAttribute("produtos", produtos);

        return "lista_produtos";
    }

    @GetMapping("/atualizar")
    public String chamaFormularioDeAtualizacao(Produto produto, Model model) {
        return "formulario_atualizar";
    }

    @PostMapping("/atualizar")
    public String atualizarProduto(Produto produtoAtualizado, Model model) {
        Produto produto = service.findById(produtoAtualizado.getId());

        produto.setNome(produtoAtualizado.getNome());
        produto.setDescricao(produtoAtualizado.getDescricao());
        produto.setDataLancamento(produtoAtualizado.getDataLancamento());
        produto.setValor(produtoAtualizado.getValor());

        service.save(produto);

        List<Produto> produtos = service.findAll();

        model.addAttribute("produtos", produtos);
        return "lista_produtos";
    }

}
