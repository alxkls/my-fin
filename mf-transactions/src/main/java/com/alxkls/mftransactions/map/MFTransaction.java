package com.alxkls.mftransactions.map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
