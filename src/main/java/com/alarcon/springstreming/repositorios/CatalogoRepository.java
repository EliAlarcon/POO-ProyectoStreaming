package com.alarcon.springstreming.repositorios;

import com.alarcon.springstreming.entidades.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Integer> {
}
