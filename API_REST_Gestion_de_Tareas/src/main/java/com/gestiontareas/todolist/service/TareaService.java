package com.gestiontareas.todolist.service;

import java.util.List;

import com.gestiontareas.todolist.dto.TareaRequestDTO;
import com.gestiontareas.todolist.dto.TareaResponseDTO;
import com.gestiontareas.todolist.model.EstadoTarea;
import com.gestiontareas.todolist.model.Tarea;

public interface TareaService {
	//TareaResponseDTO crear(TareaRequestDTO dto);

	Tarea crearTarea(Tarea tarea);
	
	List<Tarea> listarTareasPorUsuario(Long usuarioId);
	
	Tarea actualizarTarea(Long id, Tarea tareaActualizada);
	
	void elimarTarea(Long id);
	
	Tarea cambiarEstado(Long id, EstadoTarea nuevoEstado);
	
}
