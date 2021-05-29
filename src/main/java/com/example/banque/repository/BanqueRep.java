package com.example.banque.repository;

import com.example.banque.model.Banque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanqueRep extends JpaRepository<Banque,Long> {
}
