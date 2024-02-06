package com.alxkls.mftransactions.controller;

import com.alxkls.mftransactions.map.MFTransaction;
import com.alxkls.mftransactions.service.MFTransactionService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transactions")
public class MFTransactionController {

  private final MFTransactionService transactionService;

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void saveTransaction(@RequestBody MFTransaction transaction) {
    transactionService.saveTransaction(transaction);
  }

  @GetMapping("/{user-id}")
  public ResponseEntity<List<MFTransaction>> getTransactionByUserId(
      @PathVariable(name = "user-id") long userId) {
    return ResponseEntity.ok(transactionService.getTransactionsByUserId(userId));
  }

  @GetMapping("/all")
  public ResponseEntity<List<MFTransaction>> getTransactionByUserId() {
    return ResponseEntity.ok(transactionService.getAllTransaction());
  }
}
