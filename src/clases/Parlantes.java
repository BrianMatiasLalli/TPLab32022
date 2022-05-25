package clases;

public class Parlantes extends Producto{
	
	private String potencia;
	private String tipoDeConectores;
	private String alimentacion;
	
	
	public Parlantes() {
		super();
		this.potencia = "";
		this.tipoDeConectores = "";
		this.alimentacion = "";
	}
	
	public Parlantes(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String potencia, String tipoDeConectores,
			String alimentacion) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.potencia = potencia;
		this.tipoDeConectores = tipoDeConectores;
		this.alimentacion = alimentacion;
	}

	public String getPotencia() {
		return potencia;
	}

	public String getTipoDeConectores() {
		return tipoDeConectores;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	@Override
	public String toString() {
		return "Parlantes Potencia: " + getPotencia() + ", Tipo de conectores: " + getTipoDeConectores()
				+ ", Alimentacion: " + getAlimentacion() + "]";
	}
	
	
}
