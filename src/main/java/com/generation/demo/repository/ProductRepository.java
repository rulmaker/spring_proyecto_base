package com.generation.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.demo.model.Producto;



@Repository
public interface ProductRepository extends CrudRepository<Producto, Integer> {

}
