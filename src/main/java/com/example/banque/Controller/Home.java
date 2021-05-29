package com.example.banque.Controller;

import com.example.banque.model.Banque;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping(path = "/home")
    String home(){
        return "home";
    }
}
