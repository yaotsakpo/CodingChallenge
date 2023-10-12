package com.example.codingChallenge.dto;

import java.util.Date;

public record TransactionDTO(Long customerId, double amount, Date transactionDate) {
}

