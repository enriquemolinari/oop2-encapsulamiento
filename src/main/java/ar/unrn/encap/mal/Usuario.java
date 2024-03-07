package ar.unrn.encap.mal;

public class Usuario {
    private String nombreUsuario;
    private String clave;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void cambiarClave(String claveActual,
                             String nuevaClave, String nuevaClaveRepetida) {

        if (!getClave().equals(claveActual)) {
            throw new RuntimeException("No coincide con la actual...");
        }

        if (!nuevaClave.equals(nuevaClaveRepetida)) {
            throw new RuntimeException("No coinciden...");
        }

        this.clave = nuevaClave;
    }
}
