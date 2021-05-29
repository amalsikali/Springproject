package com.example.banque.services;

import com.example.banque.model.Compte;
import com.example.banque.repository.CompteRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CompteServiceImp implements CompteService{
    @Autowired
    CompteRep compteRep;
    @Override
    public Compte Add(Compte c) {
        return this.compteRep.save(c);
    }


    @Override
    public void Delete(Long idc) {
        this.compteRep.deleteById(idc);

    }

    @Override
    public Collection<Compte> FindAll() {
        return this.compteRep.findAll();
    }
}
