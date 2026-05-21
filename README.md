# Spring Boot RESTful CRUD API

Este proyecto es una API RESTful robusta y escalable construida con **Spring Boot**. Implementa las operaciones esenciales de un CRUD (Create, Read, Update, Delete) utilizando un diseño arquitectónico limpio y desacoplado, ideal como base para sistemas empresariales que requieren persistencia de datos eficiente.

---

## 🚀 Características Principales

- **Arquitectura Multicapa:** Separación estricta de responsabilidades (Controlador, Servicio, Repositorio, Entidad).
- **Operaciones RESTful Completas:** Endpoints estandarizados para la gestión integral de recursos.
- **Persistencia de Datos:** Integración con bases de datos relacionales mediante **Spring Data JPA** e Hibernate.
- **Manejo Global de Excepciones:** Respuestas HTTP limpias y semánticas ante errores comunes (ej. recursos no encontrados o datos inválidos).
- **Validación de Datos:** Uso de anotaciones de validación (`@Valid`, `@NotNull`, etc.) para asegurar la integridad de la información entrante.

---

## 🛠️ Stack Tecnológico

- **Lenguaje Core:** Java 17
- **Framework Principal:** Spring Boot 3.x
- **Persistencia:** Spring Data JPA & Hibernate
- **Base de Datos:** MySQL / PostgreSQL (Configurable)
- **Gestión de Dependencias:** Maven

---

## 🏗️ Arquitectura del Proyecto

```text
crud-springboot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/crud/springboot/
│   │   │       ├── controller/   # Endpoints REST
│   │   │       ├── service/      # Lógica de Negocio
│   │   │       ├── repository/   # Acceso a Datos (JPA)
│   │   │       ├── model/        # Entidades
│   │   │       ├── exception/    # Excepciones Globales
│   │   │       └── CrudApplication.java
│   │   └── resources/
│   │       └── application.properties
└── pom.xml
