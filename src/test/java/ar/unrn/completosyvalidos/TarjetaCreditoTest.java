package ar.unrn.completosyvalidos;

import org.junit.jupiter.api.Test;

import java.time.MonthDay;

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
                MonthDay.of(12, 31),
                "123");
        //puede no ser válida...
        tarjeta1.estaVencida();
    }

    @Test
    public void test03() {
        //como testeo TarjetaCredito3?

        
    }
}
