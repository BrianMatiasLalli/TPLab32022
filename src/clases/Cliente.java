package clases;

import Facturacion.Factura;

import java.util.ArrayList;

public class Cliente extends Persona {
    //coleccion Arraylist de facturas
    private ArrayList<Factura> misCompras;
    public Cliente(String nombre, String apellido, String dni, String telefono, String direccion, String correo) {
        super(nombre, apellido, dni, telefono, direccion, correo);
        this.misCompras=new ArrayList<>();
    }
}
