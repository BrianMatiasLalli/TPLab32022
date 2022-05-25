package clases;

import ProductosYServicios.Servicio;

import java.util.LinkedList;

public class Taller {
    private LinkedList<Servicio> serviciosTomados;

    public Taller() {
        this.serviciosTomados = new LinkedList<>();
    }
}
