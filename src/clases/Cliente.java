package clases;

import Facturacion.Factura;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable{
    //coleccion Arraylist de facturas
    private ArrayList<Factura> misCompras;
    
    public Cliente(String nombre, String apellido, String dni, String telefono, String direccion, String correo) {
        super(nombre, apellido, dni, telefono, direccion, correo);
        this.misCompras=new ArrayList<>();
    }
	public Cliente(){
	//vacio
	}

    
    public String listarCompras() 
    {
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0;i<misCompras.size();i++) 
    	{
    		sb.append(misCompras.get(i).toString()+"\n");
    	}
    	
    	return sb.toString();
    }
    
	@Override
	public String toString() {
		return "Cliente: "+super.toString();
	}
    
	
    
}
