package ProductosYServicios;

public class MemoriaRam extends Producto{
	
	private int capacidad;
	private int frecuencia;
	private String tipo;
	private int cantidad;
	private String latencia;
	private float voltaje;
	private boolean isDisipador;
	
	
	public MemoriaRam() {
		super();
		this.capacidad = 0;
		this.frecuencia = 0;
		this.tipo = "";
		this.cantidad = 0;
		this.latencia = "";
		this.voltaje = 0;
		this.isDisipador = false;
	}
	
	public MemoriaRam(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, int capacidad, int frecuencia,
			String tipo, int cantidad, String latencia, float voltaje, boolean isDisipador) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.latencia = latencia;
		this.voltaje = voltaje;
		this.isDisipador = isDisipador;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getLatencia() {
		return latencia;
	}

	public float getVoltaje() {
		return voltaje;
	}

	public boolean isDisipador() {
		return isDisipador;
	}

	@Override
	public String toString() {
		return super.toString()+"MemoriaRam: Capacidad: " + getCapacidad() + ", Frecuencia: " + getFrecuencia() + ", Tipo: "
				+ getTipo() + ", Cantidad: " + getCantidad() + ", Latencia: " + getLatencia()
				+ ", Voltaje: " + getVoltaje() + ", Disipador: " + isDisipador() + "]";
	}
	
	
	
}