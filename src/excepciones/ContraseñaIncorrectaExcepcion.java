package excepciones;

public class ContraseñaIncorrectaExcepcion extends Exception{

	public ContraseñaIncorrectaExcepcion (String mensaje) 
	{
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
