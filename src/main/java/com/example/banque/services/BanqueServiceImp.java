package com.example.banque.services;

import com.example.banque.model.Banque;
import com.example.banque.repository.BanqueRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BanqueServiceImp implements BanqueService{
    @Autowired
    BanqueRep banqueRep;
    @Override
    public Banque Add(Banque b) {
        return this.banqueRep.save(b);
    }


    @Override
    public void Delete(Long idb) {
      this.banqueRep.deleteById(idb);
    }

    @Override
    public Collection<Banque> FindAll() {
        return this.banqueRep.findAll();
    }
}
