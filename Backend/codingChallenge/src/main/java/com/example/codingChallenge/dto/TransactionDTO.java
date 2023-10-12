package com.example.codingChallenge.dto;

import java.util.Date;

public record TransactionDTO(Long id, Long customerId, double amount, Date transactionDate) {
}

