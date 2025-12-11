package org.saadeddine.compteservice;

import org.saadeddine.compteservice.entity.Account;
import org.saadeddine.compteservice.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.math.BigDecimal;

@SpringBootApplication
public class CompteServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(AccountRepository repository) {
        return args -> {
            if(repository.count() == 0) {
                Account a1 = new Account();
                a1.setNumero("ACC001");
                a1.setTitulaire("Saadeddine");
                a1.setDevise("MAD");
                a1.setSolde(1000);

                Account a2 = new Account();
                a2.setNumero("ACC002");
                a2.setTitulaire("zakaria");
                a2.setDevise("MAD");
                a2.setSolde(2000);

                Account a3 = new Account();
                a3.setNumero("ACC003");
                a3.setTitulaire("Fatima");
                a3.setDevise("EUR");
                a3.setSolde(1500);

                repository.save(a1);
                repository.save(a2);
                repository.save(a3);

            }
        };
    }
}

