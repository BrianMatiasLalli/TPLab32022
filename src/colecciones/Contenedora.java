package colecciones;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ProductosYServicios.Producto;
import clases.Persona;
import interfaces.I_Colecciones;

public class Contenedora<K,T extends Persona> implements I_Colecciones<K,T> {

	HashMap<K,T> contenedoraGenerica; //lista de facturas,lista de clientes,lista vendedores
	
	
	
	public Contenedora() {
		super();
		this.contenedoraGenerica = new HashMap<>();
	}

	@Override
	public void agregarObjetoColeccion(K clave,T elemento) {
		// TODO Auto-generated method stub
		contenedoraGenerica.put(clave,elemento);
	}

	@Override
	public void eliminarObjDeLaColeccion(K clave) {
		// TODO Auto-generated method stub
		contenedoraGenerica.remove(clave);
	}

	@Override
	public String mostrarElementoDeLaColeccion(K clave) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<K, T>> it = contenedoraGenerica.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<K, T> entry =  (Map.Entry<K,T>)it.next();
			if(clave.equals(entry.getKey())) {
			sb.append(entry.getValue().toString()+"\n");
				}
			}
		return sb.toString();
	}

	@Override
	public String listar() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<K,T>> it = contenedoraGenerica.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<K,T> entry =  (Map.Entry<K,T>)it.next();
			sb.append(entry.getValue().toString()+"\n");
		}
		return sb.toString();
	}
	
	public Iterator devolverIterator() 
	{
		return contenedoraGenerica.entrySet().iterator();
	}
	
}
