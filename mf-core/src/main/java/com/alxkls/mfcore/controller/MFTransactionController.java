package com.alxkls.mfcore.controller;


import com.alxkls.mfcore.map.MFTransaction;
import com.alxkls.mfcore.service.MFTransactionService;
import com.alxkls.mfcore.service.MFUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transaction")
public class MFTransactionController {
    private final MFTransactionService transactionService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveTransaction(@RequestBody MFTransaction transaction){
        transactionService.saveTransaction(transaction);
    }

    @GetMapping("/{user-id}")
    public ResponseEntity<List<MFTransaction>> getTransactionByUserId(@PathVariable(name="user-id") long userId){
        return ResponseEntity.ok(transactionService.getTransactionsByUserId(userId));
    }

    @GetMapping("/all")
    public ResponseEntity<List<MFTransaction>> getTransactionByUserId(){
        return ResponseEntity.ok(transactionService.getAllTransaction());
    }
}
