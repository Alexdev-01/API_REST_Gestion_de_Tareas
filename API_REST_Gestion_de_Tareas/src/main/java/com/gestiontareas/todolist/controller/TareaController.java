package com.gestiontareas.todolist.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiontareas.todolist.model.Tarea;
import com.gestiontareas.todolist.service.TareaService;

@RestController	// Indica que esta clase es un controlador REST de Spring
@RequestMapping("/api/tareas")	// Define la ruta base para las solicitudes de este controlador
@RequiredArgsConstructor	// Genera un constructor con los campos finales
public class TareaController {
	
	private final TareaService tareaService;
	
	// Método para crear una nueva tarea
	@PostMapping
	public Tarea  crearTarea(@RequestBody Tarea tarea) {	// @RequestBody indica que el cuerpo de la solicitud se mapea al objeto Tarea
		return tareaService.crearTarea(tarea);
	}
	
	
	

}
