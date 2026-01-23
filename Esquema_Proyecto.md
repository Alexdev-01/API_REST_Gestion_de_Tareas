```text
📦 API REST Gestión de Tareas
│
├── 📄 pom.xml
├── 📄 GESTION_TAREAS_BD.sql
│
└── 📁 src/main/
    │
    ├── 📁 java/com/gestiontareas/todolist/
    │   │
    │   ├── 📄 ApiRestGestionTareasApplication.java (Clase principal - Entry Point)
    │   │
    │   ├── 📁 config/
    │   │   └── 📄 SwaggerConfig.java (Configuración de documentación API)
    │   │
    │   ├── 📁 controller/ (Capa de Presentación - HTTP Endpoints)
    │   │   └── 📄 TareaController.java
    │   │       ├── POST   /api/tareas
    │   │       ├── GET    /api/tareas/usuario/{usuarioID}
    │   │       ├── PUT    /api/tareas/{id}
    │   │       ├── DELETE /api/tareas/{id}
    │   │       └── PATCH  /api/tareas/{id}/estado
    │   │
    │   ├── 📁 dto/ (Data Transfer Objects)
    │   │   ├── 📄 TareaRequestDTO.java (Peticiones entrantes)
    │   │   └── 📄 TareaResponseDTO.java (Respuestas salientes)
    │   │
    │   ├── 📁 exception/ (Manejo de Errores)
    │   │   ├── 📄 GlobalExceptionHandler.java (Handler global)
    │   │   └── 📄 ResourceNotFoundException.java (Excepción personalizada)
    │   │
    │   ├── 📁 model/ (Capa de Dominio - Entidades JPA)
    │   │   ├── 📄 Tarea.java (Entidad principal)
    │   │   ├── 📄 Usuario.java (Entidad relacionada)
    │   │   └── 📄 EstadoTarea.java (Enum: PENDIENTE, EN_PROGRESO, COMPLETADA)
    │   │
    │   ├── 📁 repository/ (Capa de Persistencia - Spring Data JPA)
    │   │   ├── 📄 TareaRepository.java
    │   │   └── 📄 UsuarioRepository.java
    │   │
    │   └── 📁 service/ (Capa de Negocio - Lógica de aplicación)
    │       ├── 📄 TareaService.java (Interface)
    │       └── 📄 TareaServiceImpl.java (Implementación)
    │
    └── 📁 resources/
        └── 📄 application.yml (Configuración: BD MySQL, puerto, etc.)
