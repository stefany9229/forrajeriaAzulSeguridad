package com.example.dh.Iguazu.repository;

import com.example.dh.Iguazu.dto.ProductoProveedorDto;
import com.example.dh.Iguazu.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {


    @Query("select new com.example.dh.Iguazu.dto.ProductoProveedorDto(p.id_producto, p.nombre_prod, p.precio_prod) from Producto p")
    List<ProductoProveedorDto> findAllExcludingWeight();

}
