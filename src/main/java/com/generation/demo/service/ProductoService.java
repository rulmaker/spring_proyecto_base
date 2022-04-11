package com.generation.demo.service;

import java.util.List;

import com.generation.demo.model.Producto;

public interface ProductoService {

	Producto getProducto(Integer productoId);
	
	List<Producto> getProductos();
	
	Producto save(Producto producto);
	
	void delete(Integer productoId);
	
	Producto update(Producto producto);
}
