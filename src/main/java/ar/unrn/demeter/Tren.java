package ar.unrn.demeter;

import java.util.List;

public class Tren {
    private List<Bagon> bagones;
    private int limiteOcupacion = 70;

    public void reservarAsiento(PedidoReserva pedido) {
        for (Bagon bagon : bagones) {
            if (bagon.getAsientos().getPorcentajeRes() < limiteOcupacion) {
                pedido.reservarAsientoEn(bagon);
                return;
            }
        }
        pedido.noSeEncuentranAsientos();
    }
}
