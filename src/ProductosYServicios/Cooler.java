package ProductosYServicios;

public class Cooler extends Producto{
	
	private String tipo;
	private int consumo;
	
	public Cooler() {
		super();
		this.tipo = "";
		this.consumo =0;
	}
	
	
	
	public Cooler(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipo, int consumo) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipo = tipo;
		this.consumo = consumo;
	}



	public String getTipo() {
		return tipo;
	}



	public int getConsumo() {
		return consumo;
	}



	@Override
	public String toString() {
		return super.toString()+"Cooler: Tipo:" + getTipo() + ",Consumo: " + getConsumo() + "]";
	}




	
	
}
