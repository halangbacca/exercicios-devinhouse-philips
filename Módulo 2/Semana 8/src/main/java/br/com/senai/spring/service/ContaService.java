package br.com.senai.spring.service;

import br.com.senai.spring.model.Conta;
import br.com.senai.spring.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    private final ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public boolean createClient(Conta conta) {
        return repository.createConta(conta);
    }

    public List<Conta> getContas() {
        return repository.getContas();
    }

    public Conta getContaById(Integer id) {
        return repository.getContaById(id);
    }

    public boolean deleteContaById(Integer id) {
        return repository.deleteContaById(id);
    }

    public void updateContaById(Integer id, Conta conta) {
        repository.updateContaById(id, conta);
    }

    public void transfere(Integer remetenteId, Integer destinatarioId) {
        repository.transfere(remetenteId, destinatarioId);
    }

}
