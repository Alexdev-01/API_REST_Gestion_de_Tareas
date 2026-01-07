package com.gestiontareas.todolist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	// Indica que esta clase es una entidad de JPA
@Table(name = "usuarios") // Especifica el nombre de la tabla en la base de datos
@Getter	// Genera automáticamente los métodos getter para los campos
@Setter	// Genera automáticamente los métodos setter para los campos
@NoArgsConstructor	// Genera automáticamente un constructor sin argumentos
@AllArgsConstructor	// Genera automáticamente un constructor con todos los argumentos
public class Usuario {
	
	@Id	// Indica que este campo es la clave primaria de la entidad
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que el valor del ID se genera automáticamente
	private Long id;
	
	@Column(nullable =false)	// Especifica que esta columna no puede ser nula
	private String nombre;
	
	@Column(nullable = false, unique = true)	// Especifica que esta columna no puede ser nula y debe ser única
	private String email;

}
