# Encapsulamiento

- ¿Cómo testeamos que ciertas excepciones sean lanzadas?
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

# Demeter Law

Original Paper (1988): [OOP:
An Objective Sense of Style](https://www2.ccs.neu.edu/research/demeter/papers/law-of-demeter/oopsla88-law-of-demeter.pdf)

- Restringe el conjunto de objetos al que le puedo enviar mensajes. Dado un Objeto *o* y un método de instancia *m*,
  solo se permite enviarle mensajes a:
    - Otros métodos definidos en *o*.
    - Objetos que recibe *m* por parámetro.
    - Colaboradores definidos como variables de instancia de *o*.
    - Otros objetos creados en *m*.
- Al igual que Tell don't Ask, es una técnica para tener buen encapsulamiento, para evitar objetos anémicos.
- Un ejemplo de
  aplicación: [The paperboy and the Wallet](https://www2.ccs.neu.edu/research/demeter/demeter-method/LawOfDemeter/paper-boy/demeter.pdf)
- Por los mismos autores del paper original en
  1989, [Assuring Good Style for Object Oriented Programs](http://www.cs.nccu.edu.tw/~chenk/ADS/LH89-law-of-demeter.pdf)
    - Es interesante leer la sección 6 Valid Violations: "The Law of Demeter is intended to act as a guideline not as an
      absolute restriction".