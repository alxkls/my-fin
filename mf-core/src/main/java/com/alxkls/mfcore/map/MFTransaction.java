package com.alxkls.mfcore.map;

import java.util.Date;


public record MFTransaction(
        Long userId,
        String transactionType,
        double transactionAmount,
        Date transactionTime,
        String typeOfService,
        String serviceProvider
        ) {}
