package fr.octosoft.rattrapage.daos;

import fr.octosoft.rattrapage.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDAO extends JpaRepository<Client, Long> {
    Iterable<Client> findClientByProfil(String profil);
    boolean existsByMailAndPassword(String mail, String password);
}
