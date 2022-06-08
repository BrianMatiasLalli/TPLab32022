package ProductosYServicios;

import org.json.JSONObject;

public class Procesador extends Producto{
	
	private String socket;
	private int nucleos;
	private int hilos;
	private int frecuenciaTurbo;
	private int procesoDeFabricacion;
	private int tdp;
	private boolean isCooler;
	
	
	public Procesador() {
		super();
		this.socket = "";
		this.nucleos = 0;
		this.hilos = 0;
		this.frecuenciaTurbo = 0;
		this.procesoDeFabricacion = 0;
		this.tdp = 0;
		this.isCooler = false;
	}
	
	public Procesador(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String socket, int nucleos, int hilos,
			int frecuenciaTurbo, int procesoDeFabricacion, int tdp, boolean isCooler) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.socket = socket;
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.frecuenciaTurbo = frecuenciaTurbo;
		this.procesoDeFabricacion = procesoDeFabricacion;
		this.tdp = tdp;
		this.isCooler = isCooler;
	}

	public String getSocket() {
		return socket;
	}

	public int getNucleos() {
		return nucleos;
	}

	public int getHilos() {
		return hilos;
	}

	public int getFrecuenciaTurbo() {
		return frecuenciaTurbo;
	}

	public int getProcesoDeFabricacion() {
		return procesoDeFabricacion;
	}

	public int getTdp() {
		return tdp;
	}

	public boolean isCooler() {
		return isCooler;
	}

	@Override
	public String toString() {
		return super.toString()+"Procesador: Socket" + getSocket() + ", Nucleos" + getNucleos() + ", Hilos: "
				+ getHilos() + ", Frecuencia turbo: " + getFrecuenciaTurbo() + ", Proceso de fabricacion: "
				+ getProcesoDeFabricacion() + ", Tdp:" + getTdp() + ", tiene Cooler: " + isCooler() + "]";
	}

	@Override
	public JSONObject productoAJson() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
