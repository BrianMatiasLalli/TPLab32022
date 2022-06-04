package colecciones;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ProductosYServicios.Producto;
import clases.Persona;
import interfaces.I_Colecciones;

public class Contenedora<T extends Persona> implements I_Colecciones<T> {

	HashMap<String,T> contenedoraGenerica; //lista de facturas,lista de clientes,lista vendedores
	
	
	
	public Contenedora() {
		super();
		this.contenedoraGenerica = new HashMap<>();
	}

	@Override
	public void agregarObjetoColeccion(T elemento) {
		// TODO Auto-generated method stub
		contenedoraGenerica.put(elemento.getDni(),elemento);
	}

	@Override
	public void eliminarObjDeLaColeccion(T elemento) {
		// TODO Auto-generated method stub
		contenedoraGenerica.remove(elemento.getDni());
	}

	@Override
	public String mostrarElementoDeLaColeccion(T elemento) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, T>> it = contenedoraGenerica.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, T> entry =  (Map.Entry<String,T>)it.next();
			sb.append(entry.getKey()+" / "+ entry.getValue().toString()+"\n");
		}
		return sb.toString();
	}

	@Override
	public String mostrarListas() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public T retornarObjeto(T elemento) {
		// TODO Auto-generated method stub
		return null;
	}
}
