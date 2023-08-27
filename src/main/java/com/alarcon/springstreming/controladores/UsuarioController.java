package com.alarcon.springstreming.controladores;

import com.alarcon.springstreming.repositorios.UsuarioRepository;
import com.alarcon.springstreming.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/registro")
    public String registro(Model model){
        model.addAttribute("usuario", new Usuario());
        return "formulario";
    }

    @PostMapping("/registro")
    public String crear(Usuario usuario){
        usuarioRepository.save(usuario);
        return "redirect:/";
    }
}
