package com.alxkls.mftransactions.map;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

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
    private String transactionType; //TODO : consider enum for this field
    private double transactionAmount;
    private Date transactionTime;
    private String typeOfService;
    private String serviceProvider;
}
