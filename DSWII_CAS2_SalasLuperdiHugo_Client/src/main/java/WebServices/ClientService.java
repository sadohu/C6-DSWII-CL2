package WebServices;

import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ClientService {
	
	public String bonoDiasProduccion(int day1, int day2, int day3, int day4, int day5, int day6) {
		Response response = null;
		Client client = ClientBuilder.newClient();
		String bono = null;
		String url = "http://localhost:8080/DSWII_CAS2_SalasLuperdiHugo_Server/App/Produccion/PorDias?"
				+ "day1=" + day1
				+ "&day2=" + day2
				+ "&day3=" + day3
				+ "&day4=" + day4
				+ "&day5=" + day5
				+ "&day6=" + day6;

		try {
			WebTarget webTarget = client.target(url);
			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
			response = invocationBuilder.get();

			if (response.getStatus() != 200)
				System.out.println("Error en la solicitud");
			else
				bono = response.readEntity(String.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (response != null)
				response.close();
		}

		return bono;
	}
}
