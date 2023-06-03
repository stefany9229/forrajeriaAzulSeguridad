package com.example.dh.Iguazu.controller;

import com.example.dh.Iguazu.dto.ProductoProveedorDto;
import com.example.dh.Iguazu.model.Producto;
import com.example.dh.Iguazu.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    public ProductoRepository productoRepository;


    @GetMapping("/vendedor")
        public ResponseEntity<List<Producto>> getProductosVendedor(){
        List<Producto> productos = productoRepository.findAll();
        return ResponseEntity.ok().body(productos);
    }

    @GetMapping("/proveedor")

    public ResponseEntity<List<ProductoProveedorDto>> getProductosProveedor(){
        List<ProductoProveedorDto> productos = productoRepository.findAllExcludingWeight();
        return ResponseEntity.ok().body(productos);
    }


}
