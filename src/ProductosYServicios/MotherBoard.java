package ProductosYServicios;

public class MotherBoard extends Producto{
	
	private String plataforma;
	private String socket;
	private String factor;
	private int cantidadDeSlotsDeMemoria;
	private int puertosSata;
	private String salidasDeVideo;
	private int cantidadDeSlotsM2;
	private int puertosUSB;
	
	public MotherBoard() {
		super();
		this.plataforma = "";
		this.socket = "";
		this.factor = "";
		this.cantidadDeSlotsDeMemoria = 0;
		this.puertosSata = 0;
		this.salidasDeVideo = "";
		this.cantidadDeSlotsM2 = 0;
		this.puertosUSB = 0;
	}
	
	public MotherBoard(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String plataforma, String socket,
			String factor, int cantidadDeSlotsDeMemoria, int puertosSata, String salidasDeVideo, int cantidadDeSlotsM2,
			int puertosUSB) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.plataforma = plataforma;
		this.socket = socket;
		this.factor = factor;
		this.cantidadDeSlotsDeMemoria = cantidadDeSlotsDeMemoria;
		this.puertosSata = puertosSata;
		this.salidasDeVideo = salidasDeVideo;
		this.cantidadDeSlotsM2 = cantidadDeSlotsM2;
		this.puertosUSB = puertosUSB;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public String getSocket() {
		return socket;
	}

	public String getFactor() {
		return factor;
	}

	public int getCantidadDeSlotsDeMemoria() {
		return cantidadDeSlotsDeMemoria;
	}

	public int getPuertosSata() {
		return puertosSata;
	}

	public String getSalidasDeVideo() {
		return salidasDeVideo;
	}

	public int getCantidadDeSlotsM2() {
		return cantidadDeSlotsM2;
	}

	public int getPuertosUSB() {
		return puertosUSB;
	}

	@Override
	public String toString() {
		return super.toString()+"MotherBoard:  Plataforma: " + getPlataforma() + ", Socket: " + getSocket() + ", Factor: "
				+ getFactor() + ", Cantidad de Slots de memoria: " + getCantidadDeSlotsDeMemoria()
				+ ", Puertos sata: " + getPuertosSata() + ", Salidas de video: " + getSalidasDeVideo()
				+ ", cantidad de SlotsM2: " + getCantidadDeSlotsM2() + ", PuertosUSB: " + getPuertosUSB() + "]";
	}
	
	
}
