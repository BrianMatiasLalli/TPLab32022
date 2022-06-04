package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import Facturacion.Factura;
import interfaces.I_Colecciones;

public class ContenedoraDeFacturas<K,T extends Factura> implements I_Colecciones<K,T>{
	
	private HashMap<K,T> listaFacturas;

	
	public ContenedoraDeFacturas() {
		this.listaFacturas = new HashMap<>();
	}


	@Override
	public void agregarObjetoColeccion(K clave, T elemento) {
		// TODO Auto-generated method stub
		listaFacturas.put(clave, elemento);
	}


	@Override
	public void eliminarObjDeLaColeccion(K clave) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String mostrarElementoDeLaColeccion(K elemento) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String listar() {
		// TODO Auto-generated method stub
		return null;
	}






	

	

	



	
}
