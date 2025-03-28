# Recomendaciones de Diseño

1. Objetos Completos (listos para ser usados ni bien se instancian) (Hernan Wilkinson).
2. Objetos Válidos (validaciones de negocio en el constructor) (Hernan Wilkinson)
3. No crear getters y setters indiscriminadamente.
4. Honrar el encapsulamiento. Aplicar Tell Don't Ask.
5. Si necesitamos un getter, que no devuelva un objeto mutable (evitar prefijo _get_).
    - Ejemplo: carrito.getProductos();
6. Evitar setters (`cuentaBancaria.setSaldo(...)` vs `cuentaBancaria.retirar(...)`)
7. Cambiar `if`s preguntando por el tipo de las clase por polimorfismo.

- Kent Beck XP's rules ([Kent Beck XP](https://martinfowler.com/bliki/BeckDesignRules.html)). En orden de prioridad:
    - tests siempre pasando
    - nombres que revelen intención
    - Sin código duplicado
    - Menor cantidad de elementos posible

# Encapsulamiento

- "Encapsular es ortorgar responsabilidades a los objetos correctamente". (Hernan Wilkinson)
    - https://www.youtube.com/watch?v=VEJa7xVfRj4 (Encapsulamiento HW - Nerdearla)
- Nuevo Requerimiento:
    - Historial de claves y no podes elegir una clave que ya hayas usado.
    - Mostrar cuantas clases cambian al agregar nuevo requerimiento si no encapsulo
- Refactoring. Encapsular:
    - "Move instance Method..."
    - Sacamos los setters, creamos constructor. Agrego método en UsuariosManager y delego en Usuario.
    - Sacamos los getters. Un objeto que encapsula una password **nunca** deberia tener un getter.
- Implementamos el nuevo requerimiento.
- Aseguramos invariantes (invariante: condición que debe mantenerse verdadera)

# Tell Don't Ask

- No preguntas por su estado para hacer algo con el. Pedile que lo haga por vos !
- Básicamente es una técnica para tener buen encapsulamiento, para evitar objetos anémicos.

# Testing con Exceptions

- ¿Cómo testeamos que ciertas excepciones sean lanzadas?

