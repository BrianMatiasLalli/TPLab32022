package ProductosYServicios;

public class Gabinete extends Producto {
	
	private String factorMother;
	private boolean isVentana;
	private int cantidadDeSlotsParaCooler;
	private int usbFrontal;
	private int alto;
	private int ancho;
	private int profundo;
	
	
	public Gabinete() {
		super();
		this.factorMother = "";
		this.isVentana = false;
		this.cantidadDeSlotsParaCooler = 0;
		this.usbFrontal = 0;
		this.alto = 0;
		this.ancho = 0;
		this.profundo = 0;
	}
	
	public Gabinete(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String facttorMother, boolean isVentana, int cantidadDeSlotsParaCooler, int usbFrontal, int alto, int ancho, int profundo) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.factorMother = facttorMother;
		this.isVentana = isVentana;
		this.cantidadDeSlotsParaCooler = cantidadDeSlotsParaCooler;
		this.usbFrontal = usbFrontal;
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
	}

	public String getFactorMother() {
		return factorMother;
	}

	public boolean isVentana() {
		return isVentana;
	}


	public int getCantidadDeSlotsParaCooler() {
		return cantidadDeSlotsParaCooler;
	}

	public int getUsbFrontal() {
		return usbFrontal;
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	public int getProfundo() {
		return profundo;
	}

	@Override
	public String toString() {
		return super.toString()+"Gabinete FactorMother: " + getFactorMother() + ", Ventana:" + isVentana() + ", Cantidad de Slots para cooler: " + getCantidadDeSlotsParaCooler()
				+ ", Usb Frontal: " + getUsbFrontal() + ", Alto: " + getAlto() + ", Ancho: " + getAncho()
				+ ", Profundo: " + getProfundo() + "]";
	}
	
	
	
}
