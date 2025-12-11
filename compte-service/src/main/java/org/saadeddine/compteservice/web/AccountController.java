package org.saadeddine.compteservice.web;

import lombok.RequiredArgsConstructor;
import org.saadeddine.compteservice.entity.Account;
import org.saadeddine.compteservice.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService service;

    @PostMapping("/{numero}/debit")
    public Account debit(@PathVariable String numero, @RequestParam float amount) {
        return service.debit(numero, amount);
    }

    @PostMapping("/{numero}/credit")
    public Account credit(@PathVariable String numero, @RequestParam float amount) {
        return service.credit(numero, amount);
    }
}