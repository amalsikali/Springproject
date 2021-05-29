package com.example.banque.repository;

import com.example.banque.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRep extends JpaRepository<Client,Long> {
}
