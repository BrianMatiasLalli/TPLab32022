package ProductosYServicios;

import org.json.JSONObject;

public class Mouse extends Producto{

	private int cantidadDeBotones;
	private String switcH;
	private String sensor;
	private boolean isInalambrica;
	private int dpiMax;
	
	
	
	public Mouse() {
		super();
		this.cantidadDeBotones = 0;
		this.switcH = "";
		this.sensor = "";
		this.isInalambrica = false;
		this.dpiMax = 0;
	}
	
	public Mouse(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, int cantidadDeBotones, String switcH, String sensor,
			boolean isInalambrica, int dpiMax) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.cantidadDeBotones = cantidadDeBotones;
		this.switcH = switcH;
		this.sensor = sensor;
		this.isInalambrica = isInalambrica;
		this.dpiMax = dpiMax;
	}

	public int getCantidadDeBotones() {
		return cantidadDeBotones;
	}

	public String getSwitcH() {
		return switcH;
	}

	public String getSensor() {
		return sensor;
	}

	public boolean isInalambrica() {
		return isInalambrica;
	}

	public int getDpiMax() {
		return dpiMax;
	}

	@Override
	public String toString() {
		return super.toString()+"Mouse: Cantidad de botones: " + getCantidadDeBotones() + ", Switch: " + getSwitcH()
				+ ", Sensor: " + getSensor() + ", es inalambrico: " + isInalambrica() + ", DpiMax: "
				+ getDpiMax() + "]";
	}

	@Override
	public JSONObject productoAJson() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
