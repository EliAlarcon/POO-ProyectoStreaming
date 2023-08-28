package com.alarcon.springstreming.controladores;

import com.alarcon.springstreming.repositorios.UsuarioRepository;
import com.alarcon.springstreming.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CatalogoController {

    @GetMapping("/menuprincipal")
    public String menuPrincipal(){
        return "menuPrincipal";
    }
}
