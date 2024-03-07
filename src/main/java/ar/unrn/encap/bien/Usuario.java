package ar.unrn.encap.bien;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombreUsuario;
    private String claveActual;
    private List<String> historialClaves;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.claveActual = clave;
        this.historialClaves = new ArrayList<>();
    }

    boolean tieneLaClave(String posibleClave) {
        return this.claveActual.equals(posibleClave);
    }

    boolean tieneHistorialIgualA(List<String> posibleHistorial) {
        return this.historialClaves.equals(posibleHistorial);
    }

    public void cambiarClave(String claveActual,
                             String nuevaClave, String nuevaClaveRepetida) {

        if (!this.claveActual.equals(claveActual)) {
            throw new RuntimeException("No coincide con la actual...");
        }

        if (!nuevaClave.equals(nuevaClaveRepetida)) {
            throw new RuntimeException("No coinciden...");
        }

        this.historialClaves.add(this.claveActual);
        this.claveActual = nuevaClave;
    }
}
