# Recomendaciones de Diseño

1. Honrar el encapsulamiento. Aplicar Tell Don't Ask.
   1.1 No crear getters y setters indiscriminadamente (Kent Beck's Getting And Setting Methods).
   1.2 Evitar setters (`cuentaBancaria.setSaldo(...)` vs `cuentaBancaria.retirar(...)`)
2. Objetos Completos (listos para ser usados ni bien se instancian) (Kent Beck's Constructor Method).
3. Objetos Válidos (validaciones de negocio en el constructor) (Kent Beck's Constructor Method)
4. Si necesitamos un getter, que no devuelva un objeto mutable (evitar prefijo _get_) (Kent Beck's Collection Accesor
   Method).
    - Ejemplo: carrito.getProductos();
5. Cambiar `if`s preguntando por el tipo de las clase por polimorfismo. (Martin Fowler's Replace Conditional with
   Polymorphism).

# Encapsulamiento

- Dos implementaciones no encapsuladas:
    - Usuario y UsuariosManager
    - Banco y CuentaBancaria
- Diseñar en objetos pensando primero en clases vs pensar primero en los mensajes (comportamiento) es un punto de
  inflexión en como diseñamos sistemas orientados a objetos. Cambiar la pregunta fundamental de diseño de "Sé que
  necesito esta clase, ¿qué debería hacer?" a "Necesito enviar este mensaje, ¿quién debería responder a él?” es el
  primer paso en esa dirección. (Sandi Metz)
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

