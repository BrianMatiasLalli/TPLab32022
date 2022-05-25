package clases;

public class Teclado extends Producto{
	
	private String tipo;
	private String formfactor;
	private String switcH;
	
	public Teclado() {
		super();
		this.tipo = "";
		this.formfactor = "";
		this.switcH = "";
	}
	
	
	public Teclado(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipo, String formfactor, String switcH) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipo = tipo;
		this.formfactor = formfactor;
		this.switcH = switcH;
	}


	public String getTipo() {
		return tipo;
	}


	public String getFormfactor() {
		return formfactor;
	}


	public String getSwitcH() {
		return switcH;
	}


	@Override
	public String toString() {
		return super.toString()+"Teclado:  Tipo: " + getTipo() + ", Form factor: " + getFormfactor() + ", Switch: "
				+ getSwitcH() + "]";
	}
	
	
}
