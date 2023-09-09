package com.alarcon.springstreming.controladores;

import com.alarcon.springstreming.entidades.Plan;
import com.alarcon.springstreming.repositorios.PlanRepository;
import com.alarcon.springstreming.repositorios.UsuarioRepository;
import com.alarcon.springstreming.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuarioController {

    //Para conectarnos con el repositorio
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PlanRepository planRepository;

    //CRUD - CREAR
    @GetMapping("/registro")
    public String registro(Model model) {
        model.addAttribute("usuario", new Usuario());

        List<Plan> planes = planRepository.findAll();
        model.addAttribute("planes", planes);

        return "usuario/formulario";
    }

    @PostMapping("/registro")
    public String crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/";
    }


}
