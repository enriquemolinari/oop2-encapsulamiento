package ar.unrn.encap.bien;

public class Usuario {
    private String nombreUsuario;
    private String clave;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    boolean tieneLaClave(String posibleClave) {
        return this.clave.equals(posibleClave);
    }

    public void cambiarClave(String claveActual,
                             String nuevaClave, String nuevaClaveRepetida) {

        if (!this.clave.equals(claveActual)) {
            throw new RuntimeException("No coincide con la actual...");
        }

        if (!nuevaClave.equals(nuevaClaveRepetida)) {
            throw new RuntimeException("No coinciden...");
        }

        this.clave = nuevaClave;
    }
}
