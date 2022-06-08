package jsonHerramientas;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
	
	public void JsonAJava(String archivoJSON) 
	{
		
		
		
	}
}
