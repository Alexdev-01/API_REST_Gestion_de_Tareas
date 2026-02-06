
# 📋 API REST - Gestión de Tareas (Profesional)

API RESTful desarrollada con **Spring Boot** para la gestión de tareas (To-Do List), siguiendo una **arquitectura profesional en capas**.  
Permite crear, listar, actualizar, eliminar y cambiar el estado de tareas asociadas a usuarios mediante un **contrato de API estable basado en DTOs**.

La aplicación está diseñada para ser **mantenible, escalable y preparada para integrarse con un frontend**, aplicando buenas prácticas reales de desarrollo backend.

---

## 🚀 Tecnologías Utilizadas

### Backend
- **Java** - Lenguaje de programación principal  
- **Spring Boot** - Framework para desarrollo de aplicaciones Java  
- **Spring Web** - Creación de endpoints REST  
- **Spring Data JPA** - Capa de persistencia y acceso a datos  
- **Hibernate** - ORM (Object-Relational Mapping)  
- **Lombok** - Reducción de código boilerplate  
- **Bean Validation** - Validación de datos de entrada  

### Base de Datos
- **MySQL** - Sistema de gestión de base de datos relacional  

### Gestión de Proyecto
- **Maven** - Gestión de dependencias y construcción del proyecto  

---

## 📌 ¿Para Qué Sirve Esta API?

Esta API permite gestionar un sistema de tareas (To-Do List) de forma profesional, separando claramente la lógica de negocio, la persistencia y la capa web.

### Funcionalidades principales:

✅ **Crear tareas** asociadas a un usuario  
✅ **Listar todas las tareas** de un usuario específico  
✅ **Actualizar información** de una tarea existente  
✅ **Eliminar tareas** que ya no son necesarias  
✅ **Cambiar el estado** de las tareas (PENDIENTE, EN_PROGRESO, COMPLETADA)  

### Casos de uso:
- Aplicaciones de gestión de proyectos  
- Organizadores personales  
- Sistemas de seguimiento de actividades  
- Proyecto de portfolio backend profesional  

---

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una **arquitectura en capas (Layered Architecture)**, desacoplando la API de las entidades de dominio mediante el uso de DTOs.

📦 com.gestiontareas.todolist
│
├── 📁 controller/ → Capa de presentación (endpoints REST)
├── 📁 service/ → Lógica de negocio
├── 📁 repository/ → Acceso a datos (Spring Data JPA)
├── 📁 model/ → Entidades JPA (dominio)
├── 📁 dto/ → DTOs (Request / Response)
├── 📁 exception/ → Manejo de excepciones
└── 📁 config/ → Configuraciones


---

## 📡 Endpoints Disponibles

| Método HTTP | Endpoint | Descripción |
|------------|----------|-------------|
| `POST` | `/api/tareas` | Crear una nueva tarea |
| `GET` | `/api/tareas/usuario/{usuarioId}` | Listar tareas de un usuario |
| `PUT` | `/api/tareas/{id}` | Actualizar una tarea |
| `DELETE` | `/api/tareas/{id}` | Eliminar una tarea |
| `PATCH` | `/api/tareas/{id}/estado` | Cambiar el estado de una tarea |

---

## 🧠 Contrato de la API (DTOs)

La API no expone directamente las entidades JPA.  
Utiliza **DTOs** para garantizar un contrato estable y seguro.

### TareaRequestDTO
```json
{
  "titulo": "Completar documentación",
  "descripcion": "Escribir README",
  "usuarioId": 1
}

```
TareaResponseDTO
{
  "id": 1,
  "titulo": "Completar documentación",
  "descripcion": "Escribir README",
  "estado": "PENDIENTE",
  "fechaCreacion": "2026-02-04T14:30:00",
  "usuarioId": 1
}

---

##🛠️ Requisitos Previos

Java JDK 17 o superior
- MySQL
- Maven (opcional si se usa el wrapper)
- IDE recomendado: IntelliJ IDEA, Eclipse o Spring Tools
- Postman o herramienta similar para probar la API

---

⚙️ Configuración del Proyecto
Crear la base de datos

CREATE DATABASE gestion_tareas;


Ejecutar la aplicación
mvn spring-boot:run

La API estará disponible en:
http://localhost:8080


##📊 Modelo de Datos
###Entidad Tarea

- id
- titulo
- descripcion
- estado
- fechaCreacion
- usuario

###Entidad Usuario
- id
- nombre
- email


##👨‍💻 Autor

Alejandro C.
Proyecto de Portfolio – Spring Boot + MySQL

⭐ Si este proyecto te resulta útil, no dudes en darle una estrella en GitHub

