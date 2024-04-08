package br.com.senai.spring.controller;

import br.com.senai.spring.model.Conta;
import br.com.senai.spring.service.ContaService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/conta")
@RestController
public class ContaController {
    private final ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Conta> getContas() {
        return service.getContas();
    }

    @GetMapping("/{id}")
    public Conta getContaById(@PathVariable Integer id) {
        return service.getContaById(id);
    }

    @PostMapping
    public boolean createConta(
            @RequestBody
            @Validated
            Conta conta) {
        return service.createClient(conta);
    }

    @DeleteMapping("/{id}")
    public boolean deleteContaById(@PathVariable Integer id) {
        return service.deleteContaById(id);
    }

    @PutMapping("/{id}")
    public void updateContaById(
            @PathVariable Integer id,
            @RequestBody @Validated Conta conta) {
        service.updateContaById(id, conta);
    }

    @PutMapping("/transfere")
    public void transfere(
            @RequestParam Integer remetenteId, @RequestParam Integer destinatarioId) {
        service.transfere(remetenteId, destinatarioId);
    }

}
