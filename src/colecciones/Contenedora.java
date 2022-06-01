package colecciones;


import java.util.HashMap;

import clases.Persona;
import interfaces.InterfazColecciones;

public class Contenedora<T extends Persona> implements InterfazColecciones<T> {

	HashMap<String,T> contenedoraGenerica; //lista de facturas,lista de clientes,lista vendedores
	
	
	
	public Contenedora() {
		super();
		this.contenedoraGenerica = new HashMap<>();
	}

	@Override
	public void agregarObjetoColeccion(T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarObjDeLaColeccion(T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrarElementoDeLaColeccion(T elemento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mostrarListas() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public void ordenarLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T retornarObjeto(T elemento) {
		// TODO Auto-generated method stub
		return null;
	}
}
