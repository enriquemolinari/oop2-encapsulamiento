package ar.unrn.completosyvalidos;

import org.junit.jupiter.api.Test;

import java.time.Year;
import java.time.YearMonth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void test03() {
        //como testeo que estoy creando objetos validos ?

    }

    @Test
    public void test04() {
        //como testeo estaVencida() == true y estaVencida() == false?
        var t = new TarjetaCredito3("1234567890123456",
                "Juan Perez",
                YearMonth.of(2024, 12),
                "123");
        assertTrue(t.estaVencida());
    }

    @Test
    public void test05() {
        //como testeo estaVencida() == true y estaVencida() == false?
        var t = new TarjetaCredito3("1234567890123456",
                "Juan Perez",
                YearMonth.of(Year.now().plusYears(1).getValue(), 11),
                "123");
        assertFalse(t.estaVencida());
    }

}
