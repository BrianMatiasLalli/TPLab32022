package ProductosYServicios;

public class PlacaDeVideo extends Producto{
	
	private String conectividad;
	private String consumo;
	private String tipoDeMemoria;
	private int capacidadDeMemoria;
	private boolean isbackPlate;
	
	
	public PlacaDeVideo() {
		super();
		this.conectividad = "";
		this.consumo = "";
		this.tipoDeMemoria = "";
		this.capacidadDeMemoria = 0;
		this.isbackPlate = false;
	}
	
	public PlacaDeVideo(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String conectividad, String consumo,
			String tipoDeMemoria, int capacidadDeMemoria, boolean isbackPlate) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.conectividad = conectividad;
		this.consumo = consumo;
		this.tipoDeMemoria = tipoDeMemoria;
		this.capacidadDeMemoria = capacidadDeMemoria;
		this.isbackPlate = isbackPlate;
	}

	public String getConectividad() {
		return conectividad;
	}

	public String getConsumo() {
		return consumo;
	}

	public String getTipoDeMemoria() {
		return tipoDeMemoria;
	}

	public int getCapacidadDeMemoria() {
		return capacidadDeMemoria;
	}

	public boolean isIsbackPlate() {
		return isbackPlate;
	}

	@Override
	public String toString() {
		return super.toString()+"PlacaDeVideo Conectividad: " + getConectividad() + ", Consumo: " + getConsumo()
				+ ", Tipo de memoria: " + getTipoDeMemoria() + ", Capacidad de memoria: " + getCapacidadDeMemoria()
				+ ", backPlate: " + isIsbackPlate() + "]";
	}
	
	
}
