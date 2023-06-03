package com.example.dh.Iguazu.dto;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ProductoProveedorDto {

    private Integer id_producto;
    private String nombre_prod;
    private Integer precio_prod;

    public ProductoProveedorDto() {
    }
}
