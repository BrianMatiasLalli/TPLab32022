package ProductosYServicios;

public class ItemPedido {
    private String descripcion;
    private double precioTotal;
    private int cantidad;

    public ItemPedido(Producto aCargar, int cantidad) {
        this.descripcion= aCargar.detallePedido();
        this.precioTotal=cantidad*aCargar.getPrecio();
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Item" + "\n" + descripcion +"Cantidad=" + cantidad + "Precio Total=" + precioTotal;
    }
}
