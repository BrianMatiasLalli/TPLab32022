package ProductosYServicios;

public class Computadora extends Producto {

	private String tipoPc;
	private String disco;
	private int ram;
	private String cpu;
	private String mother;
	private String fuente;
	private String gabinete;
	private String gpu;
	private String cooler;
	
	
	
	public Computadora() 
	{
		super();
		this.tipoPc = "";
		this.disco = "";
		this.ram = 1;
		this.cpu = "";
		this.mother = "";
		this.fuente = "";
		this.gabinete = "";
		this.gpu = "";
		this.cooler = "";
	}
	
	
	public Computadora(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipoPc, String disco, int ram,
			String cpu, String mother, String fuente, String gabinete, String gpu, String cooler) {
		
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipoPc = tipoPc;
		this.disco = disco;
		this.ram = ram;
		this.cpu = cpu;
		this.mother = mother;
		this.fuente = fuente;
		this.gabinete = gabinete;
		this.gpu = gpu;
		this.cooler = cooler;
	}


	public String getTipoPc() {
		return tipoPc;
	}


	public String getDisco() {
		return disco;
	}


	public int getRam() {
		return ram;
	}


	public String getCpu() {
		return cpu;
	}


	public String getMother() {
		return mother;
	}


	public String getFuente() {
		return fuente;
	}


	public String getGabinete() {
		return gabinete;
	}


	public String getGpu() {
		return gpu;
	}


	public String getCooler() {
		return cooler;
	}


	@Override
	public String toString() {
		return super.toString()+"Computadora: Tipo de Pc=" + tipoPc + ", disco:" + disco + ", ram: " + ram + ", cpu: " + cpu + ", mother: "
				+ mother + ", fuente: " + fuente + ", gabinete: " + gabinete + ", gpu: " + gpu + ", cooler: " + cooler
				+ ", tipo de Pc: " + getTipoPc() + ", Disco: " + getDisco() + ", Ram: " + getRam()
				+ ", CPU: " + getCpu() + ", Mother: " + getMother() + ", Fuente: " + getFuente()
				+ ", Gabinete: " + getGabinete() + ", GPU:" + getGpu() + ", Cooler: " + getCooler() + "]";
	}
	
	
}
