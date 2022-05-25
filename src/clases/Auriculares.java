package clases;

public class Auriculares extends Producto {
	
	private boolean isInalambrico;
	private boolean isMicrofono;
	private int largoDelCable; //en metros;
	
	
	public Auriculares() {
		super();
		this.isInalambrico = false;
		this.isMicrofono = false;
		this.largoDelCable = 1;
	}
	
	
	
	public Auriculares(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, boolean isInalambrico,
			boolean isMicrofono, int largoDelCable) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.isInalambrico = isInalambrico;
		this.isMicrofono = isMicrofono;
		this.largoDelCable = largoDelCable;
	}



	public boolean isInalambrico() {
		return isInalambrico;
	}

	public boolean isMicrofono() {
		return isMicrofono;
	}

	public int getLargoDelCable() {
		return largoDelCable;
	}

	@Override
	public String toString() {
		return super.toString()+"Auriculares:  Inalambrico: " + isInalambrico() + ",Microfono: " + isMicrofono()
				+ ", LargoDelCable: " + getLargoDelCable() + "]";
	}
	
	
}
