package fr.octosoft.rattrapage.daos;

import fr.octosoft.rattrapage.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {
    Iterable<Product> findProductByCategory(String category);
}
