package DataJson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;

public class TestDeserializeJSONEmpleado {
	public static void main(String[] args) throws IOException {
		String fileRoute = "E:/archivojson/Empleado.json";
		Reader reader = Files.newBufferedReader(Paths.get(fileRoute));
		
		Gson gson = new Gson();
		Map<?, ?> empleadoJson = gson.fromJson(reader, Map.class);
		System.out.println(empleadoJson);
		System.out.println("idempleado: " + empleadoJson.get("Codigo") 
				+ ", nombre: " + empleadoJson.get("Nombre Compuesto")
				+ ", apellido: " + empleadoJson.get("Apellidos Completos")
				+ ", email: " + empleadoJson.get("Email")
				+ ", dni: " + empleadoJson.get("Nro de Documento")
				+ ", telef: " + empleadoJson.get("Telefono/Celular"));

	}
}
