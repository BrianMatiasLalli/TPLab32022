package ProductosYServicios;

public class WebCam extends Producto{
	
	private String resolucionMaximaDevideo;
	private String tipoDeLente;
	private String tipoDeResolucion;
	private boolean isMicrofono;
	

	public WebCam() {
		super();
		this.resolucionMaximaDevideo = "";
		this.tipoDeLente = "";
		this.tipoDeResolucion = "";
		this.isMicrofono = false;
	}
	
	public WebCam(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String resolucionMaximaDevideo, String tipoDeLente,
			String tipoDeResolucion, boolean isMicrofono) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.resolucionMaximaDevideo = resolucionMaximaDevideo;
		this.tipoDeLente = tipoDeLente;
		this.tipoDeResolucion = tipoDeResolucion;
		this.isMicrofono = isMicrofono;
	}

	public String getResolucionMaximaDevideo() {
		return resolucionMaximaDevideo;
	}

	public String getTipoDeLente() {
		return tipoDeLente;
	}

	public String getTipoDeResolucion() {
		return tipoDeResolucion;
	}

	public boolean isMicrofono() {
		return isMicrofono;
	}

	@Override
	public String toString() {
		return "WebCam Resolucion maxima de video: " + getResolucionMaximaDevideo() + ", Tipo de lente: "
				+ getTipoDeLente() + ", Tipo de resolucion: " + getTipoDeResolucion() + ", tiene microfono: "
				+ isMicrofono() + "]";
	}
	
	
}
