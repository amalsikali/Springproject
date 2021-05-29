package com.example.banque.Controller;

import com.example.banque.model.Banque;
import com.example.banque.model.Client;
import com.example.banque.model.Compte;
import com.example.banque.services.ClientService;
import com.example.banque.services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class CompteController {
    @Autowired
    CompteService compteService;
    @Autowired
    ClientService clientService;

    @PostMapping(path="/addcompte")
    String Addcompte(Compte c){
        this.compteService.Add(c);
        return "redirect:/showcomptes";
    }

    @GetMapping(path = "/addcompte")
    String showformbanque(Model model) {
        Compte compte= new Compte();
        model.addAttribute("compte",compte);
        Collection<Client> clients ;
        clients = this.clientService.FindAll();
        model.addAttribute("clients",clients);
        return "addCompte";
    }
    @GetMapping(path = "/showcomptes")
    String showcomptes(Model model) {
        Collection<Compte> comptes ;
        comptes = this.compteService.FindAll();
        model.addAttribute("comptes",comptes);
        return "showComptes";
    }

    @PostMapping(path="/deletecompte")
    String deletecompte(Long id){
        this.compteService.Delete(id);
        return "redirect:/showcomptes";
    }

    @GetMapping(path = "/deletecompte")
    String formdeletecompte(Model model) {
        Compte compte= new Compte();
        model.addAttribute("compte",compte);
        return "deleteCompte";
    }
}
