package fr.octosoft.rattrapage.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String wording;
    private String promotionalMessage;
    private Date launchDate;
    private Date endDate;

    @OneToMany
    private List<Store> listStores;

    @OneToMany
    private List<Product> listProducts;

    @OneToMany
    private List<Client> listClients;

    public Campaign() {
    }

    public Campaign(String wording, String promotionalMessage, Date launchDate, Date endDate, List<Store> listStores, List<Product> listProducts, List<Client> listClients) {
        this.wording = wording;
        this.promotionalMessage = promotionalMessage;
        this.launchDate = launchDate;
        this.endDate = endDate;
        this.listStores = listStores;
        this.listProducts = listProducts;
        this.listClients = listClients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

    public String getPromotionalMessage() {
        return promotionalMessage;
    }

    public void setPromotionalMessage(String promotionalMessage) {
        this.promotionalMessage = promotionalMessage;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Store> getListStores() {
        return listStores;
    }

    public void setListStores(List<Store> listStores) {
        this.listStores = listStores;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public List<Client> getListClients() {
        return listClients;
    }

    public void setListClients(List<Client> listClients) {
        this.listClients = listClients;
    }
}
