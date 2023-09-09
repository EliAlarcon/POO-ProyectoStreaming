package com.alarcon.springstreming.repositorios;

import com.alarcon.springstreming.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
