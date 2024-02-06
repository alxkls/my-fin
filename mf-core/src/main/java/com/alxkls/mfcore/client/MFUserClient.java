package com.alxkls.mfcore.client;

import com.alxkls.mfcore.map.MFUser;
import com.alxkls.mfcore.map.MFUserTransactions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@FeignClient(name = "mf-users", url="${application.config.mf-users-url}")
public interface MFUserClient {

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void saveUser(MFUser user);

    @GetMapping("{user-id}")
    MFUserTransactions findUser(@PathVariable(name="user-id") Long userId);
}
