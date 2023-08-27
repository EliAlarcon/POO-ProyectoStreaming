package com.alarcon.springstreming.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
