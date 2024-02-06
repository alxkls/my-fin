package com.alxkls.mfcore.svc;


import com.alxkls.mfcore.client.MFTransactionClient;
import com.alxkls.mfcore.client.MFUserClient;
import com.alxkls.mfcore.map.MFTransaction;
import com.alxkls.mfcore.map.MFUser;
import com.alxkls.mfcore.map.MFUserTransactions;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoreService {

  private final MFUserClient userClient;
  private final MFTransactionClient transactionClient;

  public MFUserTransactions getUserTransactions(Long userId) {
    var user = userClient.findUser(userId);
    var transactions = transactionClient.getTransactionsByUserId(userId);

    return MFUserTransactions.builder()
        .name(user.getName())
        .currency(user.getCurrency())
        .startCapital(user.getStartCapital())
        .transactions(transactions)
        .build();
  }

  public void saveUser(MFUser user){
    userClient.saveUser(user);
  }
  public void saveTransaction(MFTransaction transaction){
    transactionClient.saveTransaction(transaction);
  }



}
