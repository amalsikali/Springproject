package com.example.banque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Banque")
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nom;
    @Column(unique = true)
    private String code;
    private String adresse;
    private int nbagence;
    @OneToMany(targetEntity = Client.class,cascade= CascadeType.ALL)
    @JoinColumn(name="idbanque", insertable = false,updatable = false)
    private Collection<Client> client ;

}
