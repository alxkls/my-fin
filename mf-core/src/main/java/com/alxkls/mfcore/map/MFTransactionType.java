package com.alxkls.mfcore.map;

public enum MFTransactionType {
    IN("in"),
    OUT("out"),
    SAVING("savings");

    String label;

    private MFTransactionType(String label){
        this.label = label;
    }
}
