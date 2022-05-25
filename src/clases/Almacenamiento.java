package clases;

public class Almacenamiento extends Producto{
    
	private String tipoDeColeccion;
	private String tipoDeDisco;
	private int capacidad;
	
	public Almacenamiento() {
		super();
		this.tipoDeColeccion = "";
		this.tipoDeDisco = "";
		this.capacidad = 0;
	}
	
	public Almacenamiento(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipoDeColeccion,
			String tipoDeDisco, int capacidad) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipoDeColeccion = tipoDeColeccion;
		this.tipoDeDisco = tipoDeDisco;
		this.capacidad = capacidad;
	}

	public String getTipoDeColeccion() {
		return tipoDeColeccion;
	}

	public String getTipoDeDisco() {
		return tipoDeDisco;
	}

	public int getCapacidad() {
		return capacidad;
	}

	@Override
	public String toString() {
		return "Almacenamiento:Tipo de coleccion: " + getTipoDeColeccion() + ", Tipo de disco: " + getTipoDeDisco()
				+ ", Capacidad: " + getCapacidad() + "]";
	}
	
	
}
