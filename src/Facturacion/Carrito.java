package Facturacion;

import ProductosYServicios.ItemPedido;
import ProductosYServicios.service;

import java.util.ArrayList;

public class Carrito {
	
    private ArrayList<ItemPedido> items;
    private ArrayList<service>misServicios;

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
            sb.append(misServicios.get(i).toString()+"\n");
        }
        return sb.toString();
    }
    
    public void agregar(ItemPedido nuevo){
        this.items.add(nuevo);
    }
    
    public void agregar(service nuevo){
        this.misServicios.add(nuevo);
    }
    
    public double calcularPrecioTotal() 
    {
    	double total=0;
    	
    	for(int i=0;i<items.size();i++) 
    	{
    		total=total+items.get(i).getPrecioTotal();
    	}
    	
    	for(int i=0;i<misServicios.size();i++) 
    	{
    		total=total+misServicios.get(i).getPrecio();
    	}
    	
    	return total;
    }

    public ArrayList<ItemPedido> getItems() {
        return items;
    }

    public ArrayList<service> getMisServicios() {
        return misServicios;
    }

    public int tamanioCarrito()
    {
    	return misServicios.size()+items.size();
    }
    
}
