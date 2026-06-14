

# Sistema de Gestión de Mascotas 🐾

API REST desarrollada con Spring Boot para la administración de mascotas, adoptantes y vacunas.

## 📋 Descripción

Este proyecto permite gestionar la información de mascotas, adoptantes y registros de vacunación mediante servicios RESTful.

### Funcionalidades

- Gestión de mascotas
- Gestión de adoptantes
- Registro de vacunas
- Consulta de historial de vacunación

## 🛠️ Tecnologías Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Oracle Database
- Maven
- Lombok
- Swagger/OpenAPI

## 📂 Estructura del Proyecto

```
src/
├── controller/
├── service/
├── repository/
├── model/
├── dto/
├── exception/
```

## ⚙️ Requisitos Previos

Antes de ejecutar el proyecto asegúrate de tener instalado:

- JDK 21 o superior
- Maven 3.9+
- Oracle Database
- Git

## 🚀 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/CesarBurgos/PruebaTecnicaSpringBoot.git
```

### 2. Entrar al proyecto

```bash
cd repositorio
```

### 3. Configurar la conexión a la base de datos

Editar el archivo:

```properties
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
spring.datasource.username=usuario
spring.datasource.password=password
```

### 4. Ejecutar el proyecto

```bash
mvn spring-boot:run
```

O generar el JAR:

```bash
mvn clean package
```

```bash
java -jar target/proyecto.jar
```

## 📖 Endpoints Principales
https://ed-cesar-burgos-8898624.postman.co/workspace/Personal-Workspace~539ac8c5-2dfc-48ce-b645-719c6e96cb4f/collection/55125712-2cf984ef-262b-445f-ba24-55e2cedc9a5d?action=share&creator=55125712
