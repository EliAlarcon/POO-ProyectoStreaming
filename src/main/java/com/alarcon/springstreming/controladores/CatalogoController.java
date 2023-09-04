package com.alarcon.springstreming.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogoController {

    @GetMapping("/menuprincipal")
    public String menuPrincipal(){
        return "menuPrincipal";
    }
}
