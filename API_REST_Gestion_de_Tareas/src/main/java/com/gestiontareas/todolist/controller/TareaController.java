package com.gestiontareas.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestiontareas.todolist.model.EstadoTarea;
import com.gestiontareas.todolist.model.Tarea;
import com.gestiontareas.todolist.service.TareaService;

import lombok.RequiredArgsConstructor;

/*Este Controller:
 * recibe HTTP
 * llama al service
 * devuelve respuesta*/


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
	
	// Método para listar todas las tareas de un usuario específico
	@GetMapping("/usuario/{usuarioID}")
	public List<Tarea> listaPorUsuario(@PathVariable Long usuarioID) {	// @PathVariable indica que el valor de la variable de ruta se mapea al parámetro usuarioID
		return tareaService.listarTareasPorUsuario(usuarioID);
	}
	
	// Método para actualizar una tarea existente
	@PutMapping("/{id}")
	public Tarea actualizar(@PathVariable  Long id, @RequestBody Tarea tarea) {	 // @PathVariable indica que el valor de la variable de ruta se mapea al parámetro id; @RequestBody indica que el cuerpo de la solicitud se mapea al objeto Tarea
		return tareaService.actualizarTarea(id, tarea);
	}
	
	// Método para eliminar una tarea por su ID
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {	// @PathVariable indica que el valor de la variable de ruta se mapea al parámetro id
		tareaService.elimarTarea(id);
	}
	
	// Método para cambiar el estado de una tarea
	@PatchMapping("/{id}/estado")
	public Tarea cambiarEstado(@PathVariable Long id, @RequestParam EstadoTarea estado) {	// @PathVariable indica que el valor de la variable de ruta se mapea al parámetro id; @RequestParam indica que el valor del parámetro de consulta se mapea al parámetro estado
		return tareaService.cambiarEstado(id, estado);
	}
	

}
