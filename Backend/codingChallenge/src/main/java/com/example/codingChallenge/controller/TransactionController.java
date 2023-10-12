package com.example.codingChallenge.controller;

import com.example.codingChallenge.dto.TransactionDTO;
import com.example.codingChallenge.model.Transaction;
import com.example.codingChallenge.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/")
    public ResponseEntity<List<TransactionDTO>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAllTransactions();

        List<TransactionDTO> transactionDTOs = transactions.stream()
                .map(transaction -> new TransactionDTO(
                        transaction.getId(),
                        transaction.getCustomerId(),
                        transaction.getAmount(),
                        transaction.getTransactionDate()
                ))
                .collect(Collectors.toList());

        return ResponseEntity.ok(transactionDTOs);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<List<TransactionDTO>> getTransactionsByCustomer(@PathVariable Long customerId) {
        List<Transaction> transactions = transactionService.getTransactionsByCustomer(customerId);

        List<TransactionDTO> transactionDTOs = transactions.stream()
                .map(transaction -> new TransactionDTO(
                        transaction.getId(),
                        transaction.getCustomerId(),
                        transaction.getAmount(),
                        transaction.getTransactionDate()
                ))
                .collect(Collectors.toList());

        return ResponseEntity.ok(transactionDTOs);
    }
}
