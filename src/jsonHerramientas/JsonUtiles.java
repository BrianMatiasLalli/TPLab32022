package jsonHerramientas;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonUtiles {
	public static void grabar(JSONObject array) {
		try {
			FileWriter file = new FileWriter("catalogo.json");
			file.write(array.toString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String leer() 
	{
		String contenido = "";
		try 
		{
			contenido = new String(Files.readAllBytes(Paths.get("catalogo.json")));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return contenido;
	}
}