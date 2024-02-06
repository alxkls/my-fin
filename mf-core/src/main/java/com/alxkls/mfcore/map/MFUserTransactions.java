package com.alxkls.mfcore.map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
