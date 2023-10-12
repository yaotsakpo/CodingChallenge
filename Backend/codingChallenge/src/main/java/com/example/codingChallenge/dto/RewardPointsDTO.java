package com.example.codingChallenge.dto;

public class RewardPointsDTO {
    private Long customerId;
    private Integer rewardPoints;

    public RewardPointsDTO(Long customerId, Integer rewardPoints) {
        this.customerId = customerId;
        this.rewardPoints = rewardPoints;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Integer getRewardPoints() {
        return rewardPoints;
    }
}
