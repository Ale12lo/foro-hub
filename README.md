# Base de Datos para la Gestión de Tópicos

Este proyecto describe la estructura de una base de datos destinada a gestionar tópicos en una plataforma de cursos. La base de datos está modelada para almacenar información sobre los usuarios, cursos y tópicos creados por los usuarios en relación con los cursos.

## Estructura de la Base de Datos

La base de datos consta de las siguientes tablas:

1. **Usuarios (usuarios)**: Almacena la información de los usuarios que crean tópicos.
2. **Cursos (cursos)**: Almacena información sobre los cursos disponibles en la plataforma.
3. **Tópicos (topicos)**: Almacena la información principal sobre los tópicos creados por los usuarios.

### Diagrama de Tablas

```plaintext
Usuarios
---------
- id_usuario (PK)
- nombre
- correo_electronico

Cursos
------
- id_curso (PK)
- nombre_curso

Tópicos
-------
- id_topico (PK)
- titulo
- mensaje
- fecha_creacion
- estado
- id_usuario (FK)
- id_curso (FK)
