package ProductosYServicios;

import org.json.JSONObject;

public class Parlante extends Producto{
	
	private String potencia;
	private String tipoDeConectores;
	private String alimentacion;
	
	
	public Parlante() {
		super();
		this.potencia = "";
		this.tipoDeConectores = "";
		this.alimentacion = "";
	}
	
	public Parlante(String codigo, String marca, String modelo, int stock, double precio, double peso,
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
		return super.toString()+"Parlantes Potencia: " + getPotencia() + ", Tipo de conectores: " + getTipoDeConectores()
				+ ", Alimentacion: " + getAlimentacion() + "]";
	}

	@Override
	public JSONObject productoAJson() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
