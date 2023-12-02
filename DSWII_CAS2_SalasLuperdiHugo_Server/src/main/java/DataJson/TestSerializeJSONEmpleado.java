package DataJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestSerializeJSONEmpleado {

	public static void main(String[] args) throws FileNotFoundException {
		Empleado empleado = new Empleado();
		empleado.setIdempleado(100);
		empleado.setNombre("Luis Alberto");
		empleado.setApellido("Perez Gomez");
		empleado.setEmail("luisalberto@gmail.com");
		empleado.setDni("10352248");
		empleado.setTelef("10354878");
		
		// Primera forma de serialziacion
		Gson empleadoGson = new Gson();
		String dataJson = empleadoGson.toJson(empleado);
		System.out.println(dataJson);
		
		// Segunda forma de serializacion
		Gson empleadoGsonBuilder = new GsonBuilder().setPrettyPrinting().create();
		String dataJsonBuilder = empleadoGsonBuilder.toJson(empleado);
		System.out.println(dataJsonBuilder);

		// Almacenar el json
		File jsonFile = new File("E:/archivojson/Empleado.json");
		PrintWriter writer = new PrintWriter(jsonFile);
		writer.write(dataJsonBuilder);
		writer.close();
	}

}
