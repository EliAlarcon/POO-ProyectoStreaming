package com.alarcon.springstreming.controladores;

import com.alarcon.springstreming.entidades.Catalogo;
import com.alarcon.springstreming.entidades.Categoria;
import com.alarcon.springstreming.entidades.Genero;
import com.alarcon.springstreming.entidades.Usuario;
import com.alarcon.springstreming.repositorios.CatalogoRepository;
import com.alarcon.springstreming.repositorios.CategoriaRepository;
import com.alarcon.springstreming.repositorios.GeneroRepository;
import com.alarcon.springstreming.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CatalogoController {

    @Autowired
    CatalogoRepository catalogoRepository;

    @Autowired
    GeneroRepository generoRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    //READ
    @GetMapping("/menuprincipal")
    public String menuPrincipal(Model model){
        List<Catalogo> catalogos = catalogoRepository.findAll();
        model.addAttribute("catalogos", catalogos);

        List<Genero> generos = generoRepository.findAll();
        model.addAttribute("generos", generos);

        List<Categoria> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);

        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);

        return "catalogo/menuPrincipal";
    }

}
