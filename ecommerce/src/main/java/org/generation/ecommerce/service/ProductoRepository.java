package org.generation.ecommerce.service;

import java.util.Optional;

import org.generation.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
                                                                   //nunca puede ser un dato primitivo! DEBE SER UN WHOPPER Long, Integer, etc. NO PUEDE SER UN int por ejemplo.    
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	Optional<Producto> findByNombre(String nombre);
	
}// interface ProductoRepository


