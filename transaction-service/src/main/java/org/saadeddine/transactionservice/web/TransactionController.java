package org.saadeddine.transactionservice.web;

import lombok.RequiredArgsConstructor;
import org.saadeddine.transactionservice.entity.Transaction;
import org.saadeddine.transactionservice.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @PostMapping("/transfer")
    public Transaction transfer(@RequestParam String sender,
                                @RequestParam String receiver,
                                @RequestParam float amount) {
        return service.transfer(sender, receiver, amount);
    }
    @GetMapping
    public List<Transaction> getAllTransactions() {
        return service.getAllTransactions();
    }
}

