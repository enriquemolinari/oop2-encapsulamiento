# Encapsulamiento

- "Encapsular es ortorgar responsabilidades a los objetos correctamente". (Hernan Wilkinson)
    - https://www.youtube.com/watch?v=VEJa7xVfRj4 (Encapsulamiento HW - Nerdearla)
- Mostrar cuantas clases cambian al agregar nuevo requerimiento si no encapsulo
- Usuario no seria un objeto completo ni bien se instancia
- Refactoring. Encapsular:
    - "Move instance Method..."
    - Sacamos los setters, creamos constructor. Agrego método en UsuariosManager y delego en Usuario.
    - Sacamos los getters. Un objeto que encapsula una password **nunca** deberia tener un getter.
- Implementamos el nuevo requerimiento y lo testeamos.
- Aseguramos invariantes (invariante: condición que debe mantenerse verdadera)

# Tell Don't Ask

- No preguntas por su estado para hacer algo con el. Pedile que lo haga por vos !
- Básicamente es una técnica para tener buen encapsulamiento, para evitar objetos anémicos.

# Testing con Exceptions

- ¿Cómo testeamos que ciertas excepciones sean lanzadas?

