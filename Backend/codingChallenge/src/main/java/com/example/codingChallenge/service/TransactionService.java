package com.example.codingChallenge.service;

import com.example.codingChallenge.model.Transaction;
import com.example.codingChallenge.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction addTransaction(Transaction transaction) {
        // Implement logic to add a transaction to the database
        return transactionRepository.save(transaction);
    }

    public Transaction getTransaction(Long id) {
        // Implement logic to add a transaction to the database
        return (transactionRepository.findById(id)).orElse(null);
    }


    public List<Transaction> getAllTransactions() {
        // Implement logic to retrieve all transactions from the database
        return transactionRepository.findAll();
    }

    public List<Transaction> getTransactionsByCustomer(Long customerId) {
        // Implement logic to retrieve transactions for a specific customer from the database
        return transactionRepository.findByCustomerId(customerId);
    }
}

