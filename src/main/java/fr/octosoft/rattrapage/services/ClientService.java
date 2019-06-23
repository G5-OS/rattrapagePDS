package fr.octosoft.rattrapage.services;

import fr.octosoft.rattrapage.daos.ClientDAO;
import fr.octosoft.rattrapage.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class ClientService {

    public ClientService() {
    }

    @Autowired
    private ClientDAO clientDAO;

    @Autowired
    public ClientService(ClientDAO clientDAO) { this.clientDAO = clientDAO; }

    // CRUD

    public void createClient(Client client) {
        clientDAO.save(client);
    }

    public Iterable<Client> listClients() {
        return clientDAO.findAll();
    }

    public Iterable<Client> listClient(Long id) {
        return clientDAO.findById(id).stream().collect(Collectors.toList());
    }

    public void deleteClient(Long id) {
        clientDAO.deleteById(id);
    }

    // OTHERS

    public Iterable<Client> findByProfil(String p) {
        return clientDAO.findClientByProfil(p);
    }

    public boolean existsByLogs(Client c) {
        return clientDAO.existsByMailAndPassword(c.getMail(),c.getPassword());
    }
}
