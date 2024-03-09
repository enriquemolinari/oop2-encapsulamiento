package ar.unrn.telldontask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarritoCompras {
    private List<Producto> productos;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        Objects.nonNull(producto);
        this.productos.add(producto);
    }

    public List<Producto> getProductos() {
        return this.productos;
    }
}
