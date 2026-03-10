package ar.unrn.completosyvalidos;

import java.time.MonthDay;

public class TarjetaCredito2 {

    private String numero;
    private String titular;
    private MonthDay fechaVencimiento;
    private String codigoSeguridad;

    public TarjetaCredito2(String numero, String titular, MonthDay fechaVencimiento, String codigoSeguridad) {
        this.numero = numero;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    public boolean estaVencida() {
        MonthDay hoy = MonthDay.now();
        return fechaVencimiento.isBefore(hoy);
    }

}
