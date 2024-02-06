package com.alxkls.mfcore.map;

import lombok.*;

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
