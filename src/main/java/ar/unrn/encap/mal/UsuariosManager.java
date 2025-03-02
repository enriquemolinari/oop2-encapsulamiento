package ar.unrn.encap.mal;

public class UsuariosManager {

    public void cambiarClave(Usuario u, String claveActual,
                             String nuevaClave, String nuevaClaveRepetida) {

        u.cambioClave(claveActual, nuevaClave, nuevaClaveRepetida);
    }

}
