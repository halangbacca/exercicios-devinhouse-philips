package br.senai.exercicios.services;

import br.senai.exercicios.models.Resposta;
import br.senai.exercicios.repositories.RespostaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespostaService {
    @Autowired
    private RespostaRepository repository;

    public void cadastra(Resposta resposta) {
        repository.save(resposta);
    }

    public Resposta lista(Long id) {
        return repository.findById(id).get();
    }

    public List<Resposta> lista() {
        return repository.findAll();
    }

    public List<Resposta> listaByPergunta(Long id) {
        return repository.getRespostasByIdPergunta(id);
    }

    public Resposta atualiza(Resposta respostaAtualizada, Long id) {
        Resposta resposta = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        resposta.setTexto(respostaAtualizada.getTexto());
        resposta.setIdPergunta(respostaAtualizada.getIdPergunta());

        return repository.save(resposta);
    }

    public void deleta(Long id) {
        repository.deleteById(id);
    }

}
