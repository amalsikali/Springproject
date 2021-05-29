package com.example.banque.Controller;

import com.example.banque.model.Banque;
import com.example.banque.services.BanqueService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class BanqueController {
    @Autowired
    BanqueService banqueService;
    @PostMapping(path="/addbanque")
    String Addbanque(Banque b){
        this.banqueService.Add(b);
        return "redirect:/showbanques";
    }

    @GetMapping(path = "/addbanque")
    String showformbanque(Model model) {
        Banque banque=new Banque();
        model.addAttribute("banque",banque);
        return "addBanque";
    }

    @GetMapping(path = "/showbanques")
    String showbanques(Model model) {
        Collection<Banque> banques ;
        banques = this.banqueService.FindAll();
        model.addAttribute("banques",banques);
        return "showBanques";
    }

    @PostMapping(path="/deletebanque")
    String deletebanque(Long id){
        this.banqueService.Delete(id);
        return "redirect:/showbanques";
    }

    @GetMapping(path = "/deletebanque")
    String formdeletebanque(Model model) {
        Banque banque=new Banque();
        model.addAttribute("banque",banque);
        return "deleteBanque";
    }

}
