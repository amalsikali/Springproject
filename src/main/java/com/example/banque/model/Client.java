package com.example.banque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Data //bech yjib getter w setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String cin;
    private Date naissance;
    private String email;
    private String telephone;
    private Long idbanque;
    @OneToMany(targetEntity = Compte.class,cascade= CascadeType.ALL)
    @JoinColumn(name="idclient", referencedColumnName = "id")
    private Collection<Compte> compte;

}
