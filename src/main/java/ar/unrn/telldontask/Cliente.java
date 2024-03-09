package ar.unrn.telldontask;

public class Cliente {

    public float calcularCosto(CarritoCompras carrito) {
        float total = 0;
        for (Producto producto : carrito.getProductos()) {
            total += producto.precio();
        }
        return total;
    }
}
