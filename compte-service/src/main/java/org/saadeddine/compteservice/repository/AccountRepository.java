package org.saadeddine.compteservice.repository;


import org.saadeddine.compteservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "accounts")
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByNumero(String numero);
}