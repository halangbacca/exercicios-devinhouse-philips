package br.com.senai.spring.repository;

import br.com.senai.spring.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private static List<Cliente> clientList = new ArrayList<>();

    public List<Cliente> getClients() {
        return clientList;
    }

    public Cliente getClientById(Integer id) {
        return clientList.get(id);
    }

    public boolean createClient(Cliente cliente) {
        return clientList.add(cliente);
    }

    public boolean deleteClientById(Integer id) {
        return clientList.remove(getClientById(id));
    }

    public void updateClientById(Integer id, Cliente cliente) {
        clientList.get(id).setNome(cliente.getNome());
        clientList.get(id).setCpf(cliente.getCpf());
    }
}
