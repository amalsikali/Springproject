package com.example.banque.services;

import com.example.banque.model.Client;

import java.util.Collection;

public interface ClientService {
    Client Add(Client c);
    void Delete(Long idc);
    Collection<Client> FindAll();
}
