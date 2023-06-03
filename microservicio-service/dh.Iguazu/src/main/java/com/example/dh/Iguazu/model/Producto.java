package com.example.dh.Iguazu.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "productos")
@Entity
@Getter
@Setter
@AllArgsConstructor

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id_producto;

    @Column()
    private String nombre_prod;

    @Column()
    private Integer peso_prod;

    @Column()
    private Integer precio_prod;

    public Producto() {
    }
}