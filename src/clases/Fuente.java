package clases;

public class Fuente extends Producto{
	private int watts;
	private String formato;
	private String certificacion;
	private boolean isModular;
	
	
	public Fuente() {
		super();
		this.watts = 0;
		this.formato = "";
		this.certificacion = "";
		this.isModular = false;
	}


	public Fuente(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, int watts, String formato, String certificacion,
			boolean isModular) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.watts = watts;
		this.formato = formato;
		this.certificacion = certificacion;
		this.isModular = isModular;
	}


	public int getWatts() {
		return watts;
	}


	public String getFormato() {
		return formato;
	}


	public String getCertificacion() {
		return certificacion;
	}


	public boolean isModular() {
		return isModular;
	}


	@Override
	public String toString() {
		return super.toString()+"Fuente tWatts: " + getWatts() + ", Formato: " + getFormato() + ", Certificacion: "
				+ getCertificacion() + ", Modular: " + isModular() + "]";
	}
	
	
	
}
