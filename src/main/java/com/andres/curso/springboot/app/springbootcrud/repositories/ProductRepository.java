package com.andres.curso.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.andres.curso.springboot.app.springbootcrud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

    // Desde el ProductServiceImpl hacemos uso de las operaciones basicas de un
    // crud, que salen de la interfaz CrudRepository que extiende hacia esta clase.
    boolean existsBySku(String sku);
}
