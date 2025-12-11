package org.saadeddine.transactionservice.feign;

import org.saadeddine.transactionservice.DTO.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "account-service", url = "http://localhost:8084/api/accounts")
public interface AccountClient {

    @PostMapping("/{numero}/debit")
    AccountDTO debit(@PathVariable String numero, @RequestParam float amount);

    @PostMapping("/{numero}/credit")
    AccountDTO credit(@PathVariable String numero, @RequestParam float amount);
}