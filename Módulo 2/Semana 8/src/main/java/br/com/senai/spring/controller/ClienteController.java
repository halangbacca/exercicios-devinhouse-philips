package br.com.senai.spring.controller;

import br.com.senai.spring.model.Cliente;
import br.com.senai.spring.service.ClienteService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@RestController
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> getClients() {
        return service.getClients();
    }

    @GetMapping("/{id}")
    public Cliente getClientById(@PathVariable Integer id) {
        return service.getClientById(id);
    }

    @PostMapping
    public boolean createClient(
            @RequestBody
            @Validated
            Cliente cliente) {
        return service.createClient(cliente);
    }

    @DeleteMapping("/{id}")
    public boolean deleteClientById(@PathVariable Integer id) {
        return service.deleteClientById(id);
    }

    @PutMapping("/{id}")
    public void updateClientById(
            @PathVariable Integer id,
            @RequestBody @Validated Cliente cliente) {
        service.updateClientById(id, cliente);
    }

}
