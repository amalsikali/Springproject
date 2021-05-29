package com.example.banque.services;

import com.example.banque.model.Banque;

import java.util.Collection;

public interface BanqueService {
    Banque Add(Banque b);
    void Delete (Long idb);
    Collection<Banque> FindAll();
}
