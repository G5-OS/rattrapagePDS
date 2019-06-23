package fr.octosoft.rattrapage.daos;

import fr.octosoft.rattrapage.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDAO extends JpaRepository<Store, Long> {
    Iterable<Store> findStoreByCategory(String category);
}
