package com.gestiontareas.todolist.service;

import org.springframework.stereotype.Service;

import com.gestiontareas.todolist.repository.TareaRepository;

import lombok.RequiredArgsConstructor;

@Service // Indica que esta clase es un servicio de Spring
@RequiredArgsConstructor // Genera un constructor con los campos finales
public class TareaServiceImpl implements TareaService {

	private final TareaRepository tareaRepository;

	

}
