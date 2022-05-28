package colecciones;

import java.util.HashMap;

import clases.Vendedor;
import interfaces.InterfazColecciones;

public class ListaDeVendedores<T> implements InterfazColecciones<T> {

	
	HashMap<Integer, Vendedor> empleados = new HashMap<>();
	
	@Override
	public  void agregarObjetoColeccion(T elemento) {
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

}
