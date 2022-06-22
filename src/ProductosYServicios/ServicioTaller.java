package ProductosYServicios;

import clases.Cliente;

import java.io.Serializable;
import java.util.Date;

public class ServicioTaller implements Serializable{
	
    private String descripcion;//instalacionSO, Armado Pc, reparacion.
    private Date fechaEmision;
    private Cliente cliente;
    private double precio;


    public ServicioTaller(String descripcion, Cliente cliente, double precio) {
        this.descripcion = descripcion;
        this.fechaEmision = new Date();
        this.cliente = cliente;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public enum nuevaDescripcion{
        armado_de_Pc,instalacion_SO,Reparacion;
    }
    
    
    public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String mostrarEnFactura() 
    {
    	return "\nServicio" + "\nDescripcion=" + descripcion+ "\nPrecio: " + precio;
    }
    
    @Override
    public String toString() {
        return "\nServicio" + "\nDescripcion=" + descripcion + "\nFecha de Emision=" + fechaEmision + "\nCliente=" + cliente;
    }



}
