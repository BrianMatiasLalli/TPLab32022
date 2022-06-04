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

    public Factura(Cliente comprador, Carrito listaDeProductos, String vendedor) {
        nuevoID();
        this.fecha = new Date();
        this.comprador = comprador;
        this.listaDeProductos = listaDeProductos;
        this.precio = listaDeProductos.calcularPrecioTotal();
        this.vendedor = vendedor;
    }
    
    public void nuevoID(){
        this.id=cantTotalFacturas+1;
        cantTotalFacturas++;
    }
    
    
    public int getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public Carrito getListaDeProductos() {
		return listaDeProductos;
	}

	public double getPrecio() {
		return precio;
	}

	public String getVendedor() {
		return vendedor;
	}

	public static int getCantTotalFacturas() {
		return cantTotalFacturas;
	}

	@Override
    public String toString() {
        return "Tienda de Informatica\n"+"Factura numero:"+id+"\nFecha=" + fecha +
                "\nCliente:" + comprador.getApellido() + " "+ comprador.getNombre() +
                "\nProductos:" + listaDeProductos.mostrarCarrito() +"\nVendedor:" + vendedor + "\n\nPrecio total:" + precio ;
    }
}
