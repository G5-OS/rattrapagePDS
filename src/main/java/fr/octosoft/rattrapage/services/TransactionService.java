package fr.octosoft.rattrapage.services;

import fr.octosoft.rattrapage.daos.TransactionDAO;
import fr.octosoft.rattrapage.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    public TransactionService() {
    }

    @Autowired
    private TransactionDAO transactionDAO;

    @Autowired
    public TransactionService(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    // CRUD

    public void createTransaction(Transaction store) {
        transactionDAO.save(store);
    }

    public Iterable<Transaction> listTransactions() {
        return transactionDAO.findAll();
    }

    public Iterable<Transaction> listTransaction(Long id) {
        return transactionDAO.findById(id).stream().collect(Collectors.toList());
    }

    public void deleteTransaction(Long id) {
        transactionDAO.deleteById(id);
    }
}
