package br.senai.exercicios.controllers;

import br.senai.exercicios.models.Pergunta;
import br.senai.exercicios.services.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {
    @Autowired
    private PerguntaService service;

    @GetMapping("/{id}")
    public Pergunta lista(@PathVariable Long id) {
        return service.lista(id);
    }

    @GetMapping
    public List<Pergunta> lista() {
        return service.lista();
    }

    @GetMapping("/quiz")
    public List<Pergunta> listaByQuiz(@RequestParam Long id){
        return service.listaByQuiz(id);
    }

    @PostMapping
    public void cadastra(@RequestBody Pergunta pergunta) {
        service.cadastra(pergunta);
    }

    @PutMapping("/{id}")
    public void atualiza(@PathVariable Long id, @RequestBody Pergunta pergunta) {
        service.atualiza(pergunta, id);
    }

    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Long id) {
        service.deleta(id);
    }

}
