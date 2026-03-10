package ar.unrn.completosyvalidos;

import java.time.YearMonth;

public class TarjetaCredito3 {
    static final String NUMERO_INVALIDO = "Número de tarjeta inválido";
    static final String TITULAR_DE_TARJETA_INVÁLIDO = "Titular de tarjeta inválido";
    private String numero;
    private String titular;
    private YearMonth fechaVencimiento;
    private String codigoSeguridad;

    public TarjetaCredito3(String numero, String titular, YearMonth fechaVencimiento, String codigoSeguridad) {
        verificarNumero(numero);
        verificarTitular(titular);
        verificarCodigoSeguridad(codigoSeguridad);
        this.numero = numero;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    public boolean estaVencida() {
        var hoy = YearMonth.now();
        return fechaVencimiento.isBefore(hoy);
    }

    private void verificarNumero(String numero) {
        if (numero == null || numero.length() != 16) {
            throw new IllegalArgumentException(NUMERO_INVALIDO);
        }
    }

    private void verificarTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException(TITULAR_DE_TARJETA_INVÁLIDO);
        }
    }
    
    private void verificarCodigoSeguridad(String codigoSeguridad) {
        if (codigoSeguridad == null || codigoSeguridad.length() != 3) {
            throw new IllegalArgumentException("Código de seguridad inválido");
        }
    }
}
