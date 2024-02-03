package com.alxkls.mfcore.map;

public enum MFCurrency {
    USD("usd"),
    GBP("gbp"),
    EUR("eur");
    String lablel;

    private MFCurrency(String label){
        this.lablel = label;
    }
}
