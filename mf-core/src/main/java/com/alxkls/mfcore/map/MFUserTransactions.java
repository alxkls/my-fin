package com.alxkls.mfcore.map;

import java.util.List;
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
public class MFUserTransactions {

  private String name;
  private double startCapital;
  private String currency;
  private List<MFTransaction> transactions;
}
