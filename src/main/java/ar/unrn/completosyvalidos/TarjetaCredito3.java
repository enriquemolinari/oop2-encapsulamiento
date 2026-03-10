package ar.unrn.completosyvalidos;

import java.time.MonthDay;

public class TarjetaCredito3 {
    private String numero;
    private String titular;
    private MonthDay fechaVencimiento;
    private String codigoSeguridad;

    public TarjetaCredito3(String numero, String titular, MonthDay fechaVencimiento, String codigoSeguridad) {
        verificarNumero(numero);
        verificarTitular(titular);
        verificarFechaVencimiento(fechaVencimiento);
        verificarCodigoSeguridad(codigoSeguridad);
        this.numero = numero;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    public boolean estaVencida() {
        MonthDay hoy = MonthDay.now();
        return fechaVencimiento.isBefore(hoy);
    }

    private void verificarNumero(String numero) {
        if (numero == null || numero.length() != 16) {
            throw new IllegalArgumentException("Número de tarjeta inválido");
        }
    }

    private void verificarTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("Titular de tarjeta inválido");
        }
    }

    private void verificarFechaVencimiento(MonthDay fechaVencimiento) {
        if (fechaVencimiento == null || fechaVencimiento.isBefore(MonthDay.now())) {
            throw new IllegalArgumentException("Fecha de vencimiento inválida");
        }
    }

    private void verificarCodigoSeguridad(String codigoSeguridad) {
        if (codigoSeguridad == null || codigoSeguridad.length() != 3) {
            throw new IllegalArgumentException("Código de seguridad inválido");
        }
    }
}
