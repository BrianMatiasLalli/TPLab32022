package excepciones;

public class IDIncorrectoExcepcion extends Exception {
	
	public IDIncorrectoExcepcion (String mensaje) 
	{
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
