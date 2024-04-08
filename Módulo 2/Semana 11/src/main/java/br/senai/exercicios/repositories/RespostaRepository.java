package br.senai.exercicios.repositories;

import br.senai.exercicios.models.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Long> {
    List<Resposta> getRespostasByIdPergunta(Long id);
}
