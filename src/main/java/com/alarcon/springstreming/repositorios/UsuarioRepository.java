package com.alarcon.springstreming.repositorios;

import com.alarcon.springstreming.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
}
