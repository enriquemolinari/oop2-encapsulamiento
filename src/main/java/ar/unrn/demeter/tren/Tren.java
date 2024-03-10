package ar.unrn.demeter.tren;

import java.util.List;

public class Tren {
    private List<Bagon> bagones;
    private int limiteOcupacion = 70;

    public void reservarAsiento(PedidoReserva pedido) {
        for (Bagon bagon : bagones) {
            // no respetamos la ley de demeter
            if (bagon.getAsientos().getPorcentajeRes() < limiteOcupacion) {
                pedido.reservarAsientoEn(bagon);
                return;
            }
        }
        pedido.noSeEncuentranAsientos();
    }
}
