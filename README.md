# API_REST_Gestion_de_Tareas
API REST para gestión de tareas es un servicio web basado en el estilo arquitectónico REST que utiliza métodos HTTP (GET, POST, PUT, DELETE) para crear, leer, actualizar y eliminar tareas (CRUD). 


com.alex.todolist
```
 ├── controller: Maneja HTTP (API REST)
 │    └── TareaController.java
 │
 ├── service: Contiene la lógica de negocio
 │    ├── TareaService.java
 │    └── impl
 │         └── TareaServiceImpl.java
 │
 ├── repository: Acceso a base de datos
 │    └── TareaRepository.java
 │
 ├── model: Entidades JPA y enums
 │    ├── Tarea.java
 │    ├── Usuario.java
 │    └── EstadoTarea.java
 │
 ├── dto: Objetos para entrada y salida
 │    ├── TareaRequestDTO.java
 │    └── TareaResponseDTO.java
 │
 ├── exception: Manejo de errores
 │    ├── ResourceNotFoundException.java
 │    └── GlobalExceptionHandler.java
 │
 ├── config: Configuración
 │    └── SwaggerConfig.java
 │
 └── ApiRestGestionTareasApplication.java

