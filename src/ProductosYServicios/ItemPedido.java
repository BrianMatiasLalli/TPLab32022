package ProductosYServicios;

public class ItemPedido {
    //private String descripcion; 
    private Producto pedido; 
    private double precioTotal;
    private int cantidad;
    
    
    public ItemPedido(Producto aCargar, int cantidad) {
        this.pedido= aCargar;
        this.precioTotal=cantidad*this.pedido.getPrecio();
        this.cantidad = cantidad;
    }
    
 
    
     public String descripcionPedido()
     {
     	return pedido.detallePedido();
     
     } 
     
    public double getPrecioTotal() 
    {
        return precioTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Item" + "\n" + descripcionPedido() +"\nCantidad=" + cantidad + "\nPrecio Total=" + precioTotal; //
    }
}
