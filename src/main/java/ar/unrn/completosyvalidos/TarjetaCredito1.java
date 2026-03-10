package ar.unrn.completosyvalidos;

import java.time.MonthDay;

public class TarjetaCredito1 {
    private String numero;
    private String titular;
    private MonthDay fechaVencimiento;
    private String codigoSeguridad;

    public TarjetaCredito1() {
    }

    public boolean estaVencida() {
        MonthDay hoy = MonthDay.now();
        return fechaVencimiento.isBefore(hoy);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public MonthDay getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(MonthDay fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
}
