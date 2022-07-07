package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO
// Plain old Java Object
@Entity    // conectarse a base de datos
@Table(name="producto") // aqui indicas la tabla a la que te conectas
public class Producto {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false) //indicas la columna id y sus valores nulo y unico 
	private Long id;
	private String nombre;
	private String descripcion;
	@Column(name="url_imagen")
	private String URL_Imagen;
	private double precio;
	
	public Producto(Long id, String nombre, String descripcion, String uRL_Imagen, double precio) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_Imagen = uRL_Imagen;
		this.precio = precio;
	}// constructor
	
	public Producto() {}//constructor
	
	public Long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getURL_Imagen() {
		return URL_Imagen;
	}
	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
