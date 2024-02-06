package com.alxkls.mftransactions.service;

import com.alxkls.mftransactions.map.MFTransaction;
import com.alxkls.mftransactions.repository.MFTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MFTransactionService {
    private final MFTransactionRepository transactionRepository;

    public void saveTransaction(MFTransaction transaction){
        transactionRepository.save(transaction);
    }

    public List<MFTransaction> getTransactionsByUserId(long userId){
        return transactionRepository.findByUserId(userId);
    }

    public List<MFTransaction> getAllTransaction(){
        return transactionRepository.findAll();
    }
}
