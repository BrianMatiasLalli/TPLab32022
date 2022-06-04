package interfaces;

public interface I_Colecciones<T> {

	public void agregarObjetoColeccion(T elemento);
	
	public void eliminarObjDeLaColeccion(T elemento);
	
	public String mostrarElementoDeLaColeccion(T elemento);
	
	public String mostrarListas();
	
	public T retornarObjeto(T elemento) ;
	
}
