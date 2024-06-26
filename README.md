📋 API REST de Gestión de Usuarios para Proyecto de Licitaciones
Esta es una API REST desarrollada utilizando Spring, el framework de Java. La API implementa un CRUD completo (Crear, Leer, Actualizar y Borrar) para la gestión de usuarios de nuestro proyecto de licitaciones, con una base de datos MySQL.

🌟 Funcionalidades
🆕 Crear Usuario: Permite la creación de nuevos usuarios.
🔍 Leer Usuarios: Obtiene la información de los usuarios existentes.
✏️ Actualizar Usuario: Permite actualizar la información de un usuario específico.
🗑️ Eliminar Usuario: Permite borrar un usuario de la base de datos.
🛠️ Tecnologías Utilizadas
Spring Framework: Para el desarrollo de la API REST.
MySQL: Como base de datos para almacenar la información de los usuarios.
Hibernate: Para la gestión de la persistencia de datos.
Maven: Para la gestión de dependencias y el ciclo de vida del proyecto.
📋 Requisitos Previos
Java 8 o superior: Para ejecutar el proyecto.
MySQL: Base de datos MySQL instalada y configurada.
Maven: Para gestionar las dependencias del proyecto.



📄 Uso
Una vez que la aplicación esté en ejecución, podrás acceder a los endpoints de la API para gestionar los usuarios. Aquí tienes algunos ejemplos de los endpoints disponibles:

POST /user: Crear un nuevo usuario.
GET /user: Obtener la lista de usuarios.
GET /user/{id}: Obtener la información de un usuario específico.
PUT /user/{id}: Actualizar la información de un usuario específico.
DELETE /user/{id}: Eliminar un usuario.
📝 Documentación del Servicio de Usuario










🛠 Endpoints


📥 Crear Usuario (POST)
URL: http://localhost:8080/user

Body:
{
    "firstName": "BRILLIED",
    "lastName": "RODRIGUEZ",
    "email": "BRILLIED@gmail.com"
}

📋 Traer Todos los Usuarios (GET)
URL: http://localhost:8080/user

🔍 Traer un Usuario por ID (GET)
URL: http://localhost:8080/user/{id}

Ejemplo: http://localhost:8080/user/7

❌ Eliminar un Usuario (DELETE)
URL: http://localhost:8080/user/{id}

Ejemplo: http://localhost:8080/user/7

✏️ Editar un Usuario (PUT)
URL: http://localhost:8080/user/{id}

Ejemplo: http://localhost:8080/user/5

Body:
{
    "id": 5,
    "firstName": "ALEXANDER",
    "lastName": "Duarte",
    "email": "jhon@gmail.com"
}

