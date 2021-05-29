package com.example.banque.services;

import com.example.banque.model.Client;
import com.example.banque.repository.ClientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClinetServiceImp implements ClientService{
    @Autowired //pour injecter
    ClientRep clientrep;
    @Override
    public Client Add(Client c) {
       return this.clientrep.save(c);}


    @Override
    public void Delete(Long idc) {
         this.clientrep.deleteById(idc);

    }

    @Override
    public Collection<Client> FindAll() {
        return this.clientrep.findAll();
    }
}
