package ProductosYServicios;

public class Almacenamiento extends Producto{
    
	
	private String tipoDeDisco;
	private int capacidad;
	
	public Almacenamiento() {
		super();
		this.tipoDeDisco = "";
		this.capacidad = 0;
	}
	
	public Almacenamiento(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion,int capacidad,String tipoDeDisco) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		
		this.tipoDeDisco = tipoDeDisco;
		this.capacidad = capacidad;
	}

	

	public String getTipoDeDisco() {
		return tipoDeDisco;
	}

	public int getCapacidad() {
		return capacidad;
	}

	@Override
	public String toString() {
		return super.toString()+"Almacenamiento:, Tipo de disco: " + getTipoDeDisco()
				+ ", Capacidad: " + getCapacidad() + "]";
	}
	
	
}
