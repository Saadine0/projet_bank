package org.saadeddine.transactionservice.service;

import lombok.RequiredArgsConstructor;
import org.saadeddine.transactionservice.entity.Transaction;
import org.saadeddine.transactionservice.feign.AccountClient;
import org.saadeddine.transactionservice.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountClient accountClient;

    public Transaction transfer(String sender, String receiver, float amount) {
        // Debit sender
        accountClient.debit(sender, amount);

        // Credit receiver
        accountClient.credit(receiver, amount);

        // Save transaction
        Transaction transaction = new Transaction();
        transaction.setSenderAccount(sender);
        transaction.setReceiverAccount(receiver);
        transaction.setAmount(amount);

        return transactionRepository.save(transaction);
    }
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}