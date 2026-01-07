package com.gestiontareas.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiontareas.todolist.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
