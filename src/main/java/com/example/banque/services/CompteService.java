package com.example.banque.services;

import com.example.banque.model.Compte;

import java.util.Collection;

public interface CompteService {
    Compte Add(Compte c);
    void Delete(Long idc);
    Collection<Compte> FindAll();
}
