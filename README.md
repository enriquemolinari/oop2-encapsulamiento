# Encapsulamiento

- ¿Cómo testeamos que ciertas excepciones sean lanzadas?
- Mostrar cuantas clases cambian al agregar nuevo requerimiento si no encapsulo
- Usuario no seria un objeto completo ni bien se instancia
- Refactoring. Encapsular:
    - "Move instance Method..."
    - Sacamos los setters, creamos constructor. Agrego método en UsuariosManager y delego en Usuario.
    - Sacamos los getters. Un objeto que encapsula una password **nunca** deberia tener un getter.
- Implementamos el nuevo requerimiento y lo testeamos.
