package ProductosYServicios;

public class Microfono extends Producto{
	
	private String tipoDePie;
	private String conexion;
	

	public Microfono() {
		super();
		this.tipoDePie = "";
		this.conexion = "";
	}
	public Microfono(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipoDePie, String conexion) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipoDePie = tipoDePie;
		this.conexion = conexion;
	}
	public String getTipoDePie() {
		return tipoDePie;
	}
	public String getConexion() {
		return conexion;
	}
	
	@Override
	public String toString() {
		return "Microfono Tipo de pie: " + getTipoDePie() + ", Conexion: " + getConexion() + "]";
	}
	
	
	
}
