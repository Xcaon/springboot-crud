package com.andres.curso.springboot.app.springbootcrud.services;

import java.util.List;
import java.util.Optional;

import com.andres.curso.springboot.app.springbootcrud.entities.Product;

public interface ProductService {

    // La razon de la interfaz es de separar el “contrato” (qué métodos existen y
    // qué hacen a nivel conceptual) de
    // la implementación (cómo lo haces).
    
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);
    
    Optional<Product> update(Long id, Product product);

    Optional<Product> delete(Long id);

    boolean existsBySku(String sku);


}
