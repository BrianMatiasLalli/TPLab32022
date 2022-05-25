package ProductosYServicios;

import clases.Cliente;

import java.util.Date;

public class Servicio {
    private String descripcion;//instalacionSO, Armado Pc, reparacion.
    private Date fechaEmision;
    private Cliente cliente;

    public Servicio(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.fechaEmision = new Date();
        this.cliente = cliente;
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

    @Override
    public String toString() {
        return "\nServicio" + "\nDescripcion=" + descripcion + "\nFecha de Emision=" + fechaEmision + "\nCliente=" + cliente;
    }




}
