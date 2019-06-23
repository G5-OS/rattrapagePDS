package fr.octosoft.rattrapage.entities;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String description;
    private int price;

    @OneToOne
    private Store storeConcerned;

    public Product() {
    }

    public Product(String name, String category, String description, int price, Store storeConcerned) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.storeConcerned = storeConcerned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Store getStoreConcerned() {
        return storeConcerned;
    }

    public void setStoreConcerned(Store storeConcerned) {
        this.storeConcerned = storeConcerned;
    }
}