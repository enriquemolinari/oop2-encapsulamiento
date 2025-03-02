package ar.unrn.encap.mal;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombreUsuario;
    private String claveActual;
    private List<String> historial;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.claveActual = clave;
        this.historial = new ArrayList<>();
    }

    void cambioClave(String claveActual, String nuevaClave, String nuevaClaveRepetida) {
        if (!this.claveActual.equals(claveActual)) {
            throw new RuntimeException("No coincide con la actual...");
        }

        if (!nuevaClave.equals(nuevaClaveRepetida)) {
            throw new RuntimeException("No coinciden...");
        }

        this.historial.add(claveActual);
        this.claveActual = nuevaClave;
    }

    public boolean tenesClave(String unaClave) {
        return this.claveActual.equals(unaClave);
    }
}
