package com.alxkls.mfcore.controller;

import com.alxkls.mfcore.map.MFTransaction;
import com.alxkls.mfcore.map.MFUser;
import com.alxkls.mfcore.map.MFUserTransactions;
import com.alxkls.mfcore.svc.CoreService;
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
@RequestMapping("/api/v1/")
public class MFCoreController {

  private final CoreService coreService;

  @PostMapping("/save-tr")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void saveTransaction(@RequestBody MFTransaction transaction) {
    coreService.saveTransaction(transaction);
  }

  @PostMapping("/save-usr")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void saveUser(@RequestBody MFUser user) {
    coreService.saveUser(user);
  }
  @GetMapping("/user-trs/{user-id}")
  public ResponseEntity<MFUserTransactions> getUserTransactions(
      @PathVariable(name = "user-id") Long userId) {
    return ResponseEntity.ok(coreService.getUserTransactions(userId));
  }



}
