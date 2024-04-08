package br.com.senai.spring.service;

import br.com.senai.spring.model.Cliente;
import br.com.senai.spring.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerErrorException;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public boolean createClient(Cliente cliente) {
        try {
            return repository.createClient(cliente);
        } catch (Exception e) {
            throw new ServerErrorException("ClienteService", e);
        }
    }

    public List<Cliente> getClients() {
        return repository.getClients();
    }

    public Cliente getClientById(Integer id) {
        try {
            return repository.getClientById(id);
        } catch (Exception e) {
            throw new ServerErrorException("ClienteService", e);
        }
    }

    public boolean deleteClientById(Integer id) {
        return repository.deleteClientById(id);
    }

    public void updateClientById(Integer id, Cliente cliente) {
        repository.updateClientById(id, cliente);
    }

}
