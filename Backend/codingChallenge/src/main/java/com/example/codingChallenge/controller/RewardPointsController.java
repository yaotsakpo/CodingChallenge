package com.example.codingChallenge.controller;

import com.example.codingChallenge.dto.RewardPointsDTO;
import com.example.codingChallenge.model.Transaction;
import com.example.codingChallenge.service.RewardPointsService;
import com.example.codingChallenge.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reward-points")
public class RewardPointsController {

    @Autowired
    private RewardPointsService rewardPointsService;

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{customerId}")
    public ResponseEntity<Integer> calculateRewardPoints(@PathVariable Long customerId) {
        int rewardPoints = rewardPointsService.calculateRewardPoints(customerId);
        System.out.println(rewardPoints);
        return ResponseEntity.ok(rewardPoints);
    }

    @GetMapping("/")
    public List<RewardPointsDTO> calculateRewardPointsForAllCustomers() {
        List<Transaction> allTransactions = transactionService.getAllTransactions();

        // Calculate reward points for all transactions
        Map<Long, Integer> rewardPointsMap = new HashMap<>();
        for (Transaction transaction : allTransactions) {
            Long customerId = transaction.getCustomerId();
            int rewardPoints = rewardPointsMap.getOrDefault(customerId, 0);
            rewardPoints += rewardPointsService.calculateRewardPointsForTransaction(transaction.getAmount());
            rewardPointsMap.put(customerId, rewardPoints);
        }

        // Convert the map into a list of RewardPointsDTO objects
        List<RewardPointsDTO> rewardPointsList = rewardPointsMap.entrySet().stream()
                .map(entry -> new RewardPointsDTO(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        return rewardPointsList;
    }
}
