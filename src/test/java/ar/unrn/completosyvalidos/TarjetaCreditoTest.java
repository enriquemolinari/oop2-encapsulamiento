package ar.unrn.completosyvalidos;

import org.junit.jupiter.api.Test;

import java.time.Year;
import java.time.YearMonth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TarjetaCreditoTest {

    @Test
    public void test01() {
        var tarjeta1 = new TarjetaCredito1();
        //que pasa si invoco este metodo?
        tarjeta1.estaVencida();
    }

    @Test
    public void test02() {
        var tarjeta1 = new TarjetaCredito2("1234567890123456",
                "Juan Perez",
                YearMonth.of(12, 31),
                "123");
        //puede no ser válida...
        tarjeta1.estaVencida();
    }

    @Test
    public void tarjetaNoAdmiteNumeroInvalido() {
        //como testeo TarjetaCredito3?
        var e = assertThrows(IllegalArgumentException.class, () -> {
            new TarjetaCredito3("12345678901234",
                    "Juan Perez",
                    YearMonth.of(Year.now().plusYears(1).getValue(), 12),
                    "123");
        });

        assertEquals(e.getMessage(), TarjetaCredito3.NUMERO_INVALIDO);
    }

    @Test
    public void tarjetaNoAdmiteTitularInvalido() {
        //como testeo TarjetaCredito3?
        var e = assertThrows(IllegalArgumentException.class, () -> {
            new TarjetaCredito3("1234567890123467",
                    "",
                    YearMonth.of(Year.now().plusYears(1).getValue(), 12),
                    "123");
        });

        assertEquals(e.getMessage(), TarjetaCredito3.TITULAR_DE_TARJETA_INVÁLIDO);
    }
}
