package colecciones;

import ProductosYServicios.Producto;
import ProductosYServicios.Servicio;


import java.util.ArrayList;

public class Carrito {
	
    private ArrayList<Producto> misProductos;
    private ArrayList<Servicio>misServicios;

    public Carrito() {
        this.misProductos=new ArrayList<>();
        this.misServicios=new ArrayList<>();
    }
    
    
    public String mostrarCarrito(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<misProductos.size();i++)
        {
            sb.append(misProductos.get(i).toString()+"\n");
        }
        for(int i=0;i<misServicios.size();i++)
        {
            sb.append(misServicios.get(i).toString()+"\n");
        }
        return sb.toString();
    }
    
    
    
}
