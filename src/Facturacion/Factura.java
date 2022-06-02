package Facturacion;

import clases.Cliente;
import colecciones.Carrito;

import java.util.Date;

public class Factura {
    private int id;
    private Date fecha;
    private Cliente comprador;
    private Carrito listaDeProductos;
    private double precio;
    private String vendedor;//getNombre de vendedor
    public static int cantTotalFacturas=0;

    public Factura(int id, Date fecha, Cliente comprador, Carrito listaDeProductos, double precio, String vendedor) {
        nuevoID();
        this.fecha = fecha;
        this.comprador = comprador;
        this.listaDeProductos = listaDeProductos;
        this.precio = precio;
        this.vendedor = vendedor;
    }
    public void nuevoID(){
        this.id=cantTotalFacturas+1;
        cantTotalFacturas++;
    }

    @Override
    public String toString() {
        return "Tienda de Informatica\n"+"Factura numero:"+id+"\nFecha=" + fecha +
                "\nCliente:" + comprador.getApellido() + " "+ comprador.getNombre() +
                "\nProductos:" + listaDeProductos +"Vendedor:" + vendedor + "\nPrecio total:" + precio ;
    }
}
