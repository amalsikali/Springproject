package com.example.banque.repository;

import com.example.banque.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRep extends JpaRepository<Compte,Long> {
}
