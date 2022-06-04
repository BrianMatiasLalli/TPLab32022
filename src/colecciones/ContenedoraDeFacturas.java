package colecciones;

import java.util.ArrayList;

import Facturacion.Factura;
import interfaces.I_Colecciones;

public class ContenedoraDeFacturas<T extends Factura> implements I_Colecciones<T>{
	
	private ArrayList<T> listaFacturas;

	
	public ContenedoraDeFacturas() {
		this.listaFacturas = new ArrayList<>();
	}


	@Override
	public void agregarObjetoColeccion(T elemento) {
		// TODO Auto-generated method stub
		listaFacturas.add(elemento);
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
	public T retornarObjeto(T elemento) {
		// TODO Auto-generated method stub
		return null;
	}


	

	

	



	
}
