package org.saadeddine.compteservice.service;


import lombok.RequiredArgsConstructor;
import org.saadeddine.compteservice.entity.Account;
import org.saadeddine.compteservice.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository repository;

    public Account debit(String numero, float amount) {
        Account account = repository.findByNumero(numero)
                .orElseThrow(() -> new RuntimeException("Compte non trouve"));


        if (account.getSolde() < amount) {
            throw new RuntimeException("Solde inssufissant");
        }

        account.setSolde(account.getSolde() - amount);
        return repository.save(account);
    }

    public Account credit(String numero, float amount) {
        Account account = repository.findByNumero(numero)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setSolde(account.getSolde() + amount);
        return repository.save(account);
    }
}
