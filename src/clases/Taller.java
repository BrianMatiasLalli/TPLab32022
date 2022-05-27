package clases;

import ProductosYServicios.Servicio;

import java.util.LinkedList;

public class Taller {
    private LinkedList<Servicio> serviciosTomados;

    public Taller() {
        this.serviciosTomados = new LinkedList<>();
    }
    
	
	public void agregar(Servicio elemento) 
	{
		
		serviciosTomados.addLast(elemento);
		
	}
	
	public Servicio remover() 
	{
		
		return serviciosTomados.poll();
	}
	
	public Servicio primerElemento() 
	{
		return serviciosTomados.peekFirst();
	}
	
	public Servicio ultimoElemento() {
		return serviciosTomados.peekLast();
	}
	
	public String mostrar() 
	{
		StringBuilder sb= new StringBuilder();
		LinkedList<Servicio> aux= new LinkedList<>();
		
		while(!serviciosTomados.isEmpty()) 
		{
			aux.add(serviciosTomados.pollLast());
			sb.append(aux.peekLast() +"\n");
		}
		
		while(!aux.isEmpty()) 
		{
			serviciosTomados.add(aux.pollLast());
		}
		
		return sb.toString();
	}
}

