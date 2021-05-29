package com.example.banque.Controller;

import com.example.banque.model.Banque;
import com.example.banque.model.Client;
import com.example.banque.services.BanqueService;
import com.example.banque.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;


@Controller
public class ClientController {
    @Autowired
    ClientService clientservice;
    @Autowired
    BanqueService banqueService;

    @PostMapping(path="/addclient")
    String Addclient(Client c){
        this.clientservice.Add(c);
        return "redirect:/showclients";
    }

    @GetMapping(path = "/addclient")
    String showformclient(Model model) {
        Client client=new Client();
        model.addAttribute("client",client);
        Collection<Banque> banques ;
        banques = this.banqueService.FindAll();
        model.addAttribute("banques",banques);
        return "addClient";
    }
    @GetMapping(path = "/showclients")
    String showclients(Model model) {
        Collection<Client> clients ;
        clients = this.clientservice.FindAll();
        model.addAttribute("clients",clients);
        return "showClients";

    }

    @PostMapping(path="/deleteclient")
    String deleteclient(Long id){
        this.clientservice.Delete(id);
        return "redirect:/showclients";
    }

    @GetMapping(path = "/deleteclient")
    String formdeleteclient(Model model) {
        Client client=new Client();
        model.addAttribute("client",client);
        return "deleteClient";
    }


}
