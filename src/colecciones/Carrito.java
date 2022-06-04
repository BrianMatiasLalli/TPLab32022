package colecciones;

import ProductosYServicios.ItemPedido;
import ProductosYServicios.Producto;
import ProductosYServicios.Servicio;


import java.util.ArrayList;

public class Carrito {
	
    private ArrayList<ItemPedido> items;
    private ArrayList<Servicio>misServicios;

    public Carrito() {
        this.items=new ArrayList<>();
        this.misServicios=new ArrayList<>();
    }
    
    
    public String mostrarCarrito(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<items.size();i++)
        {
            sb.append(items.get(i).toString()+"\n");
        }
        for(int i=0;i<misServicios.size();i++)
        {
            sb.append(misServicios.get(i).mostrarEnFactura()+"\n");
        }
        return sb.toString();
    }
    
    public void agregar(ItemPedido nuevo){
        this.items.add(nuevo);
    }
    
    public void agregar(Servicio nuevo){
        this.misServicios.add(nuevo);
    }
    
    

    
    
    
}
