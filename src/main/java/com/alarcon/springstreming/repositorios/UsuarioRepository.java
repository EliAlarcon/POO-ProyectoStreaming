package com.alarcon.springstreming.repositorios;

import com.alarcon.springstreming.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
}
