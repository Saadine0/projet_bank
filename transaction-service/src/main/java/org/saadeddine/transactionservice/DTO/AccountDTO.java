package org.saadeddine.transactionservice.DTO;

import lombok.Data;

@Data
public class AccountDTO {
    private Long id;
    private String numero;
    private String titulaire;
    private String devise;
    private float solde;
}