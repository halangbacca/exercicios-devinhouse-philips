package br.senai.exercicios.services;

import br.senai.exercicios.models.Quiz;
import br.senai.exercicios.repositories.QuizRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository repository;

    public void cadastra(Quiz quiz) {
        repository.save(quiz);
    }

    public Quiz lista(Long id) {
        return repository.findById(id).get();
    }

    public List<Quiz> lista() {
        return repository.findAll();
    }

    public Quiz atualiza(Quiz quizAtualizado, Long id) {
        Quiz quiz = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        quiz.setNome(quizAtualizado.getNome());
        quiz.setDescricao(quizAtualizado.getDescricao());

        return repository.save(quiz);
    }

    public void deleta(Long id) {
        repository.deleteById(id);
    }

}
