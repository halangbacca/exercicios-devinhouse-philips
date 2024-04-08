package br.senai.exercicios.controllers;

import br.senai.exercicios.models.Resposta;
import br.senai.exercicios.services.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {
    @Autowired
    private RespostaService service;

    @GetMapping("/{id}")
    public Resposta lista(@PathVariable Long id) {
        return service.lista(id);
    }

    @GetMapping
    public List<Resposta> lista() {
        return service.lista();
    }

    @GetMapping("/pergunta")
    public List<Resposta> listaByPergunta(@RequestParam Long id){
        return service.listaByPergunta(id);
    }

    @PostMapping
    public void cadastra(@RequestBody Resposta resposta) {
        service.cadastra(resposta);
    }

    @PutMapping("/{id}")
    public void atualiza(@PathVariable Long id, @RequestBody Resposta resposta) {
        service.atualiza(resposta, id);
    }

    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Long id) {
        service.deleta(id);
    }

}
