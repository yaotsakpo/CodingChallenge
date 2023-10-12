package com.example.codingChallenge.service;

import com.example.codingChallenge.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardPointsService {

    @Autowired
    private TransactionService transactionService;

    public int calculateRewardPoints(Long customerId) {
        List<Transaction> customerTransactions = transactionService.getTransactionsByCustomer(customerId);
        int totalRewardPoints = 0;

        for (Transaction transaction : customerTransactions) {
            totalRewardPoints += calculateRewardPointsForTransaction(transaction.getAmount());
        }

        return totalRewardPoints;
    }

    public int calculateRewardPointsForTransaction(double transactionAmount) {
        int points = 0;
        if (transactionAmount > 100) {
            points += 2 * (transactionAmount - 100);
            transactionAmount = 100;
        }
        if (transactionAmount > 50) {
            points += (int) (transactionAmount - 50);
        }
        return points;
    }


}

