package fr.octosoft.rattrapage.services;

import fr.octosoft.rattrapage.daos.StoreDAO;
import fr.octosoft.rattrapage.entities.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class StoreService {

    public StoreService() {
    }

    @Autowired
    private StoreDAO storeDAO;

    @Autowired
    public StoreService(StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }

    // CRUD

    public void createStore(Store store) {
        storeDAO.save(store);
    }

    public Iterable<Store> listStores() {
        return storeDAO.findAll();
    }

    public Iterable<Store> listStore(Long id) {
        return storeDAO.findById(id).stream().collect(Collectors.toList());
    }

    public void deleteStore(Long id) {
        storeDAO.deleteById(id);
    }

    // OTHERS

    public Iterable<Store> findByCategory(String c) {
        return storeDAO.findStoreByCategory(c);
    }
}
