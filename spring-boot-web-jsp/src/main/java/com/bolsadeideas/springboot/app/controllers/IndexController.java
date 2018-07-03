package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Value("${application.controller.titulo}")
    private String titulo;


    @GetMapping("/index")
    public String Index(Model model) {
        model.addAttribute("titulo", this.titulo);
        return "index";
    }

}
