package jsonHerramientas;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ProductosYServicios.Almacenamiento;
import ProductosYServicios.Auriculares;
import ProductosYServicios.Cooler;
import ProductosYServicios.Producto;
import colecciones.Catalogo;

public class StreamJSON {
private String nombre;
	
	public StreamJSON()
	{
		this.nombre="";
	}
	
	public String javaAJSON(Catalogo catalogo) 
	{
		
		JSONObject json=new JSONObject();
		
		Iterator it= catalogo.devolerIt();
		
		
		try {
			JSONArray catalogoJson_auriculares=new JSONArray();
			JSONArray catalogoJson_almacenamiento=new JSONArray();
			JSONArray catalogoJson_cooler=new JSONArray();
			json.put("Catalogo_Auriculares",catalogoJson_auriculares);
			json.put("Catalogo_Almacenamiento",catalogoJson_almacenamiento);
			json.put("Catalogo_Cooler",catalogoJson_cooler);
			Producto auxProducto;
			

			while(it.hasNext()) 
			{
				JSONObject auxJson= new JSONObject();
				Map.Entry<String, Producto> entry = (Entry<String,Producto>) it.next();
				auxProducto=entry.getValue();
				auxJson=auxProducto.productoAJson();
				
				if(auxProducto instanceof Auriculares) {
					catalogoJson_auriculares.put(auxJson);
				}
				
				if(auxProducto instanceof Almacenamiento) 
				{
					catalogoJson_almacenamiento.put(auxJson);
				}
				
				if(auxProducto instanceof Cooler) 
				{
					catalogoJson_cooler.put(auxJson);
				}
				
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json.toString();
	}
	
	public Catalogo JsonAJava(String archivoJSON) 
	{
		
		StringBuilder sb = new StringBuilder();
		Catalogo catalogo = new Catalogo();
		try {
			
			
			JSONObject jsonCatalogo = new JSONObject(archivoJSON);
			
			JSONArray array_Auriculares=jsonCatalogo.getJSONArray("Catalogo_Auriculares");
			JSONArray array_Almacenamiento=jsonCatalogo.getJSONArray("Catalogo_Almacenamiento");
			JSONArray array_Coolers=jsonCatalogo.getJSONArray("Catalogo_Cooler");
			
			for(int i=0;i<array_Auriculares.length();i++) 
			{
				Auriculares aCargar= new Auriculares();
				JSONObject productoJson=array_Auriculares.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setMicrofono(productoJson.getBoolean("Microfono"));
				aCargar.setInalambrico(productoJson.getBoolean("Inalambrico"));
				aCargar.setLargoDelCable(productoJson.getInt("Largo cable"));
				catalogo.agregar(aCargar);
				
			}
			

			for(int i=0;i<array_Almacenamiento.length();i++) 
			{
				Almacenamiento aCargar= new Almacenamiento();
				JSONObject productoJson=array_Almacenamiento.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setCapacidad(productoJson.getInt("Capacidad"));                   ;
				aCargar.setTipoDeDisco(productoJson.getString("Tipo de disco"));
				
				catalogo.agregar(aCargar);
				
			}
			
			for(int i=0;i<array_Coolers.length();i++) 
			{
				Cooler aCargar= new Cooler();
				JSONObject productoJson=array_Coolers.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setTipo(productoJson.getString("Tipo"));                   ;
				aCargar.setConsumo(productoJson.getInt("Consumo"));
				
				catalogo.agregar(aCargar);
				
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return catalogo;
	}
	
	
	/**esto es codigo viejo
	public String javaAJSON(Catalogo catalogo) 
	{
		
		JSONObject json=new JSONObject();
		
		Iterator it= catalogo.devolerIt();
		
		
		try {
			JSONArray catalogoJson=new JSONArray();
			
			json.put("Catalogo",catalogoJson);
			
			JSONObject auxJson= new JSONObject();
			Producto auxProducto;
			

			while(it.hasNext()) 
			{
				Map.Entry<String, Producto> entry = (Entry<String,Producto>) it.next();
				auxProducto=entry.getValue();
				auxJson=auxProducto.productoAJson();
				catalogoJson.put(auxJson);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	
	*/
}
