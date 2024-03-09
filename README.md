# Encapsulamiento

- ¿Cómo testeamos que ciertas excepciones sean lanzadas?
- Mostrar cuantas clases cambian al agregar nuevo requerimiento si no encapsulo
- Usuario no seria un objeto completo ni bien se instancia
- Refactoring. Encapsular:
    - "Move instance Method..."
    - Sacamos los setters, creamos constructor. Agrego método en UsuariosManager y delego en Usuario.
    - Sacamos los getters. Un objeto que encapsula una password **nunca** deberia tener un getter.
- Implementamos el nuevo requerimiento y lo testeamos.

# Tell Don't Ask

- No preguntas por su estado para hacer algo con el. Pedile que lo haga por vos !
- Básicamente es una técnica para tener buen encapsulamiento, para evitar objetos anémicos.

# Demeter Law

Original Paper: [OOP:
An Objective Sense of Style](https://www2.ccs.neu.edu/research/demeter/papers/law-of-demeter/oopsla88-law-of-demeter.pdf)

- Restringe el conjunto de objetos al que le puedo enviar mensajes. Dado un Objeto *o* y un método de instancia *m*,
  solo se permite enviarle mensajes a:
    - Otros métodos definidos en *o*.
    - Objetos que recibe *m* por parámetro.
    - Colaboradores definidos como variables de instancia de *o*.
    - Otros objetos creados en *m*.
- Al igual que Tell don't Ask, es una técnica para tener buen encapsulamiento, para evitar objetos anémicos.