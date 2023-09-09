package com.alarcon.springstreming.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Usuario {
    @Id
    private String correo;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String contrasenia;

    @OneToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;
}
