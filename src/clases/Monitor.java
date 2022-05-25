package clases;

public class Monitor extends Producto {

	private String tipoDePanel;
	private boolean isCurvo;
	private String conexion;
	private String tipoDeFuente;
	private int pulgadas;
	private String resolucion;
	private String frecuencia;
	
	public Monitor() {
		super();
		this.tipoDePanel = "";
		this.isCurvo = false;
		this.conexion = "";
		this.tipoDeFuente = "";
		this.pulgadas = 18;
		this.resolucion = "";
		this.frecuencia = "";
	}
	
	public Monitor(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipoDePanel, boolean isCurvo, String conexion,
			String tipoDeFuente, int pulgadas, String resolucion, String frecuencia) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipoDePanel = tipoDePanel;
		this.isCurvo = isCurvo;
		this.conexion = conexion;
		this.tipoDeFuente = tipoDeFuente;
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
		this.frecuencia = frecuencia;
	}

	public String getTipoDePanel() {
		return tipoDePanel;
	}

	public boolean isCurvo() {
		return isCurvo;
	}

	public String getConexion() {
		return conexion;
	}

	public String getTipoDeFuente() {
		return tipoDeFuente;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	@Override
	public String toString() {
		return super.toString()+"Monitor: Tipo de panel: " + getTipoDePanel() + ", Curvo: " + isCurvo() + ", Conexion: "
				+ getConexion() + ", Tipo de fuente: " + getTipoDeFuente() + ", Pulgadas: " + getPulgadas()
				+ ", Resolucion: " + getResolucion() + ", Frecuencia: " + getFrecuencia() + "]";
	}
	
	
	
	
	
}
