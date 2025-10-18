package com.poo.biblioteca.Controller;

import com.poo.biblioteca.Entity.Livro;
import com.poo.biblioteca.Service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController{
    private final LivroService service;

    public HomeController(LivroService service){
        this.service = service;
    }

    @GetMapping
    public String home(){
        return "index";
    }

}
