package com.alxkls.mfcore.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MFTransaction {

    @Id
    private Long Id;

    private Long UserId;
    private MFTransactionType transactionType;
    private double transactionAmount;
    private LocalDateTime transactionTime;
    private String typeOfService;
    private String serviceProvider;
}
