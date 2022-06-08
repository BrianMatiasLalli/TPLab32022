package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class PlacaDeVideo extends Producto{
	
	private String conectividad;
	private String consumo;
	private String tipoDeMemoria;
	private int capacidadDeMemoria;
	private boolean isbackPlate;
	
	
	public PlacaDeVideo() {
		super();
		this.conectividad = "";
		this.consumo = "";
		this.tipoDeMemoria = "";
		this.capacidadDeMemoria = 0;
		this.isbackPlate = false;
	}
	
	public PlacaDeVideo(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String conectividad, String consumo,
			String tipoDeMemoria, int capacidadDeMemoria, boolean isbackPlate) {
		super(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.conectividad = conectividad;
		this.consumo = consumo;
		this.tipoDeMemoria = tipoDeMemoria;
		this.capacidadDeMemoria = capacidadDeMemoria;
		this.isbackPlate = isbackPlate;
	}

	public String getConectividad() {
		return conectividad;
	}

	public String getConsumo() {
		return consumo;
	}

	public String getTipoDeMemoria() {
		return tipoDeMemoria;
	}

	public int getCapacidadDeMemoria() {
		return capacidadDeMemoria;
	}

	public boolean isBackPlate() {
		return isbackPlate;
	}

	@Override
	public String toString() {
		return super.toString()+"PlacaDeVideo Conectividad: " + getConectividad() + ", Consumo: " + getConsumo()
				+ ", Tipo de memoria: " + getTipoDeMemoria() + ", Capacidad de memoria: " + getCapacidadDeMemoria()
				+ ", backPlate: " + isBackPlate() + "]";
	}

	@Override
	public JSONObject productoAJson() {

		JSONObject retorno = new JSONObject();

		try {
			retorno.put("codigo",getCodigo());
			retorno.put("marca",getMarca());
			retorno.put("modelo",getModelo());
			retorno.put("stock",getStock());
			retorno.put("precio",getPrecio());
			retorno.put("peso",getPeso());
			retorno.put("paisOrigen",getPaisOrigen());
			retorno.put("rgb",isRgb());
			retorno.put("color",getColor());
			retorno.put("descripcion",getDescripcion());
			retorno.put("Conectividad",getConectividad());
			retorno.put("Consumo",getConsumo());
			retorno.put("Tipo Memoria VRam", getTipoDeMemoria());
			retorno.put("Capacidad memoria VRam", getCapacidadDeMemoria());
			retorno.put("Backplate", isBackPlate());
		}
		catch (
				JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
}
