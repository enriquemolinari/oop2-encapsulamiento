package ar.unrn.encap.mal;

public class UsuariosManager {

    public void cambiarClave(Usuario aUser, String claveActual,
                             String nuevaClave, String nuevaClaveRepetida) {
        aUser.cambiarClave(claveActual, nuevaClave, nuevaClaveRepetida);
    }
}
