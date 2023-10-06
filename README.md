# Microservicio Coches

Este microservicio permite manejar operaciones CRUD para la entidad `Coches`.

## Endpoints

### Coches

- **Listar todos los coches**:  
  `GET /coche`

- **Obtener un coche por ID**:  
  `GET /coche/{id}`

- **Crear un nuevo coche**:  
  `POST /coche`  
  Body: JSON de Coches

- **Actualizar un coche**:  
  `PUT /coche`  
  Body: JSON de Coches

- **Eliminar un coche por ID**:  
  `DELETE /coche/{id}`

- **Buscar coches por marca**:  
  `GET /coche/marca/{marca}`

- **Buscar coches por modelo**:  
  `GET /coche/modelo/{modelo}`

## Dependencias

El microservicio utiliza Spring Boot con dependencias como Spring Web, JPA y otras relacionadas para facilitar la creación de servicios REST y la conexión con bases de datos.

## Instalación y Uso

1. Clone el repositorio.
2. Navegue al directorio del proyecto y ejecute `mvn install` para instalar las dependencias.
3. Ejecute `mvn spring-boot:run` para iniciar el servicio.
4. Utilice Postman o cualquier cliente HTTP para interactuar con los endpoints.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, haga un "fork" del repositorio y cree una Pull Request para cualquier mejora o corrección.

## Licencia

[MIT](LICENSE)

