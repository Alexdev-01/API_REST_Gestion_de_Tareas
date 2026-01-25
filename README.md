# 📋 API REST - Gestión de Tareas

API RESTful desarrollada con **Spring Boot** para la gestión de tareas (To-Do List). Permite crear, listar, actualizar, eliminar y cambiar el estado de tareas asociadas a usuarios.

---

## 🚀 Tecnologías Utilizadas

### Backend
- **Java** - Lenguaje de programación principal
- **Spring Boot** - Framework para desarrollo de aplicaciones Java
- **Spring Web** - Para crear endpoints REST
- **Spring Data JPA** - Capa de persistencia y acceso a datos
- **Hibernate** - ORM (Object-Relational Mapping)
- **Lombok** - Reducción de código boilerplate
- **Bean Validation** - Validación de datos

### Base de Datos
- **MySQL** - Sistema de gestión de base de datos relacional

### Gestión de Proyecto
- **Maven** - Gestión de dependencias y construcción del proyecto

---

## 📌 ¿Para Qué Sirve Esta API?

Esta API permite gestionar un sistema de tareas (To-Do List) con las siguientes funcionalidades:

✅ **Crear tareas** con título, descripción y asociarlas a un usuario  
✅ **Listar todas las tareas** de un usuario específico  
✅ **Actualizar información** de una tarea existente  
✅ **Eliminar tareas** que ya no son necesarias  
✅ **Cambiar el estado** de las tareas (PENDIENTE, EN_PROGRESO, COMPLETADA)  

**Casos de uso:**
- Aplicaciones de gestión de proyectos
- Organizadores personales
- Sistemas de seguimiento de actividades
- Portfolio de desarrollo backend

---

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una **arquitectura en capas** (Layered Architecture):

```
📦 com.gestiontareas.todolist
│
├── 📁 controller/          → Capa de presentación (HTTP endpoints)
├── 📁 service/             → Capa de lógica de negocio
├── 📁 repository/          → Capa de acceso a datos (JPA)
├── 📁 model/               → Entidades de dominio (JPA entities)
├── 📁 dto/                 → Data Transfer Objects
├── 📁 exception/           → Manejo centralizado de excepciones
└── 📁 config/              → Configuraciones (Swagger)
```

---

## 📡 Endpoints Disponibles

| Método HTTP | Endpoint | Descripción |
|------------|----------|-------------|
| `POST` | `/api/tareas` | Crear una nueva tarea |
| `GET` | `/api/tareas/usuario/{usuarioID}` | Listar tareas de un usuario |
| `PUT` | `/api/tareas/{id}` | Actualizar una tarea completa |
| `DELETE` | `/api/tareas/{id}` | Eliminar una tarea |
| `PATCH` | `/api/tareas/{id}/estado` | Cambiar solo el estado de una tarea |

---

## 🛠️ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

### 1. **Java Development Kit (JDK)**
   - Descargar: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) o [OpenJDK](https://adoptium.net/)
   - Verificar instalación:
     ```bash
     java -version
     ```

### 2. **MySQL**
   - Descargar: [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
   - Verificar instalación:
     ```bash
     mysql --version
     ```

### 3. **Maven** (opcional si usas el wrapper incluido)
   - Descargar: [Apache Maven](https://maven.apache.org/download.cgi)
   - Verificar instalación:
     ```bash
     mvn -version
     ```

### 4. **IDE Recomendado**
   - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
   - [Eclipse](https://www.eclipse.org/downloads/)
   - [Spring Tools](https://spring.io/tools#eclipse)
   - [Visual Studio Code](https://code.visualstudio.com/) con extensiones de Java

### 5. **Postman** (para probar la API)
   - Descargar: [Postman](https://www.postman.com/downloads/)
   - Alternativa: [Thunder Client](https://www.thunderclient.com/) (extensión de VS Code)

---

## ⚙️ Configuración del Proyecto

### 1. **Clonar el repositorio**
```bash
git clone <URL_DEL_REPOSITORIO>
cd API_REST_Gestion_de_Tareas
```

### 2. **Configurar la Base de Datos**

#### Crear la base de datos en MySQL:
```sql
CREATE DATABASE gestion_tareas;
```

#### Ejecutar el script SQL incluido:
```bash
mysql -u root -p gestion_tareas < GESTION_TAREAS_BD.sql
```

#### Configurar las credenciales en `application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/gestion_tareas
    username: root          # ⚠️ Cambiar por tu usuario de MySQL
    password: tu_password   # ⚠️ Cambiar por tu contraseña
```

### 3. **Compilar el proyecto**
```bash
mvn clean install
```

### 4. **Ejecutar la aplicación**
```bash
mvn spring-boot:run
```

O desde tu IDE, ejecutar la clase principal:
```
ApiRestGestionTareasApplication.java
```

La aplicación estará disponible en: **http://localhost:8080**

---

## 🧪 Probar la API con Postman

### Importar Colección de Postman

Puedes probar los endpoints manualmente o importar esta colección:

### **1. Crear una Tarea**
```
POST http://localhost:8080/api/tareas
Content-Type: application/json

{
  "titulo": "Completar documentación",
  "descripcion": "Escribir el README del proyecto",
  "estado": "PENDIENTE",
  "usuario": {
    "id": 1
  }
}
```

### **2. Listar Tareas de un Usuario**
```
GET http://localhost:8080/api/tareas/usuario/1
```

### **3. Actualizar una Tarea**
```
PUT http://localhost:8080/api/tareas/1
Content-Type: application/json

{
  "titulo": "Completar documentación - Actualizado",
  "descripcion": "README terminado",
  "estado": "EN_PROGRESO"
}
```

### **4. Cambiar Estado de una Tarea**
```
PATCH http://localhost:8080/api/tareas/1/estado?estado=COMPLETADA
```

### **5. Eliminar una Tarea**
```
DELETE http://localhost:8080/api/tareas/1
```

---

## 📊 Modelo de Datos

### **Entidad Tarea**
```java
- id (Long)
- titulo (String)
- descripcion (String)
- estado (EstadoTarea: PENDIENTE, EN_PROGRESO, COMPLETADA)
- fechaCreacion (LocalDateTime)
- usuario (Usuario)
```

### **Entidad Usuario**
```java
- id (Long)
- nombre (String)
- email (String)
- tareas (List<Tarea>)
```

---

## 👨‍💻 Autor

**Alejandro C.**  
Proyecto Portfolio - Spring Boot + MySQL

---

## 🔗 Enlaces Útiles

- [Documentación Spring Boot](https://spring.io/projects/spring-boot)
- [Documentación Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Guía de MySQL](https://dev.mysql.com/doc/)
- [Lombok](https://projectlombok.org/)

---

⭐ Si este proyecto te fue útil, no olvides darle una estrella en GitHub
