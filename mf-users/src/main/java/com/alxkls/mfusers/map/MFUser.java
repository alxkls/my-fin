package com.alxkls.mfusers.map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "MFUSERS")
public class MFUser {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;

  private String name;
  private double startCapital;
  private String currency;
}
