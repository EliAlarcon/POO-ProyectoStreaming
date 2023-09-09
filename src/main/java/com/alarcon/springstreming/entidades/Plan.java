package com.alarcon.springstreming.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Plan {
    @Id
    private String id;
    private String nombre;
    private double valor;
}
