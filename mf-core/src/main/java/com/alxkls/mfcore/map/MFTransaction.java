package com.alxkls.mfcore.map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


public record MFTransaction(
        Long userId,
        String transactionType,
        double transactionAmount,
        Date transactionTime,
        String typeOfService,
        String serviceProvider
        ) {
}
