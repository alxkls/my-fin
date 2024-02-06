package com.alxkls.mfcore.client;

import com.alxkls.mfcore.map.MFTransaction;
import org.apache.catalina.LifecycleState;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@FeignClient(name = "mf-transactions", url="${application.config.mf-transactions-url}")
public interface MFTransactionClient {
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void saveTransaction(MFTransaction transaction);

    @GetMapping("/{user-id}")
    List<MFTransaction> getTransactionsByUserId(@PathVariable(name = "user-id") Long userId);

}
