package ar.unrn.encap.mal;

public class Usuario {
    private String nombreUsuario;
    private String clave;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void cambiarClave(String claveActual,
                             String nuevaClave, String nuevaClaveRepetida) {

        if (!getClave().equals(claveActual)) {
            throw new RuntimeException("No coincide con la actual...");
        }

        if (!nuevaClave.equals(nuevaClaveRepetida)) {
            throw new RuntimeException("No coinciden...");
        }

        setClave(nuevaClave);
    }
}
