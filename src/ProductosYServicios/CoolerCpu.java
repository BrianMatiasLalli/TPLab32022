package ProductosYServicios;

public class CoolerCpu extends Cooler{
	
	private int tdp;
	private String tipoDeDisipacion;
	private String socketCompatible;
	
	
	public CoolerCpu(int tdp, String tipoDeDisipacion, String socketCompatible) {
		super();
		this.tdp = 0;
		this.tipoDeDisipacion = "";
		this.socketCompatible = "";
	}


	public CoolerCpu(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipo, int consumo, int tdp,
			String tipoDeDisipacion, String socketCompatible) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion, tipo, consumo);
		this.tdp = tdp;
		this.tipoDeDisipacion = tipoDeDisipacion;
		this.socketCompatible = socketCompatible;
	}


	public int getTdp() {
		return tdp;
	}


	public String getTipoDeDisipacion() {
		return tipoDeDisipacion;
	}


	public String getSocketCompatible() {
		return socketCompatible;
	}


	@Override
	public String toString() {
		return super.toString()+"CoolerCpu: Tdp:" + getTdp() + ", Tipo de disipacion: " + getTipoDeDisipacion()
				+ ", Socket compatible:" + getSocketCompatible() + "]";
	}
	
	
	
}
