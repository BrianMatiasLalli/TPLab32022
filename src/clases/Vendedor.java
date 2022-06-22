package clases;

import java.io.Serializable;

public class Vendedor extends Persona implements Serializable{
    private String id;//puede ser las iniciales de nombre y apellido
    private String contrasenia;//alfanumerica;
    private double totalVentas;

    public Vendedor() {
        this.id = "0";
        this.contrasenia = "0";
        this.totalVentas=0;
    }
    public Vendedor(String nombre, String apellido, String dni, String telefono, String direccion, String correo, String id, String contrasenia) {
        super(nombre,apellido,dni,telefono,direccion,correo);
        this.id = id;
        this.contrasenia = contrasenia;
        this.totalVentas=0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getTotalVentas() {
        return totalVentas;
    }
    public void sumarVenta(double venta){
        this.totalVentas=totalVentas+venta;
    }

    @Override
    public String toString() {
        return "\nVendedor=" + "\nId= " + id + super.toString() + "Total de ventas acumuladas" + totalVentas;
    }
    
	@Override
    public void editarPersona(String dato, int opcion){
		if(opcion==1){
			setDireccion(dato);
		}
		else if(opcion==2){
			setTelefono(dato);
		}else{
			setCorreo(dato);
		}
	}
}
