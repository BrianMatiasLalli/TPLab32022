package excepciones;

public class Contrase�aIncorrectaExcepcion extends Exception{

	public Contrase�aIncorrectaExcepcion (String mensaje) 
	{
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
