package org.saadeddine.compteservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numero;
    private String titulaire;
    private String devise;
    private float solde;
    private LocalDateTime createdAt = LocalDateTime.now();
}
