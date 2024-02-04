package com.alxkls.mfcore.map;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "MFTRANSACTIONS")
@Entity
public class MFTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Long UserId;
    private String transactionType;
    private double transactionAmount;
    private LocalDateTime transactionTime;
    private String typeOfService;
    private String serviceProvider;
}
