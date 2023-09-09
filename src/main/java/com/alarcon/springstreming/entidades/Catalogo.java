package com.alarcon.springstreming.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String director;
    private int anio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    @OneToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
