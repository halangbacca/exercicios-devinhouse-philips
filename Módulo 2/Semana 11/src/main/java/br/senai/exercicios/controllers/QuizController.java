package br.senai.exercicios.controllers;

import br.senai.exercicios.models.Quiz;
import br.senai.exercicios.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    private QuizService service;

    @GetMapping("/{id}")
    public Quiz lista(@PathVariable Long id) {
        return service.lista(id);
    }

    @GetMapping
    public List<Quiz> lista() {
        return service.lista();
    }

    @PostMapping
    public void cadastra(@RequestBody Quiz quiz) {
        service.cadastra(quiz);
    }

    @PutMapping("/{id}")
    public void atualiza(@PathVariable Long id, @RequestBody Quiz quiz) {
        service.atualiza(quiz, id);
    }

    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Long id) {
        service.deleta(id);
    }

}
