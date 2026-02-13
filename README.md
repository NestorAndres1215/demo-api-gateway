# Demo API Gateway

Este proyecto es un **ejemplo de arquitectura de microservicios** usando Spring Boot y Spring Cloud Gateway.  
Incluye:

- **User Service**: microservicio que gestiona usuarios y roles (en memoria, sin base de datos real).  
- **Product Service**: microservicio que gestiona productos (en memoria).  
- **API Gateway**: enruta las solicitudes hacia los microservicios y expone Swagger UI para todos los servicios.

---

## Tecnologías

- Java 17 / Spring Boot 3.x
- Spring Cloud Gateway
- Springdoc OpenAPI / Swagger UI
- Maven
- H2 Database (solo pruebas en memoria)

---

## Endpoints

### Gateway (`http://localhost:8080`)

### User Service (`http://localhost:8081`)

- `GET  /api/users` → Lista todos los usuarios  
- `POST /api/users` → Crea un nuevo usuario  
- `GET  /api/roles` → Lista todos los roles  
- `POST /api/roles` → Crea un nuevo rol

### Product Service (`http://localhost:8082`)

- `GET  /api/products` → Lista productos  
- `POST /api/products` → Crea un producto  

- **Usuarios:** `/api_gateway/api/users`  
- **Roles:** `/api_gateway/api/roles`  
- **Productos:** `/api_gateway/api/products`  
