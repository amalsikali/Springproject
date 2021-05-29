package com.example.banque.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String numcompte;
    private Date datecreation;
    private String type;
    private Double solde;
    private Long idclient;

}
