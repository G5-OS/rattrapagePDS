package fr.octosoft.rattrapage.services;

import fr.octosoft.rattrapage.daos.ProductDAO;
import fr.octosoft.rattrapage.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class ProductService {

    public ProductService() {
    }

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    // CRUD

    public void createProduct(Product store) {
        productDAO.save(store);
    }

    public Iterable<Product> listProducts() {
        return productDAO.findAll();
    }

    public Iterable<Product> listProduct(Long id) {
        return productDAO.findById(id).stream().collect(Collectors.toList());
    }

    public void deleteProduct(Long id) {
        productDAO.deleteById(id);
    }

    // OTHERS

    public Iterable<Product> findByCategory(String c) {
        return productDAO.findProductByCategory(c);
    }
}

