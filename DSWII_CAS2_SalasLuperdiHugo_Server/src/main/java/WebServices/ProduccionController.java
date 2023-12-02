package WebServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Produccion")
public class ProduccionController {

	@GET
	@Path("/PorDias")
    @Produces(MediaType.APPLICATION_JSON)
    public Response result(
            @QueryParam("day1") int day1,
            @QueryParam("day2") int day2,
            @QueryParam("day3") int day3,
            @QueryParam("day4") int day4,
            @QueryParam("day5") int day5,
            @QueryParam("day6") int day6) {

        int total = day1 + day2 + day3 + day4 + day5 + day6;
        
        String bono = (total >= 100) ? "Tiene bono" : "No tiene bono";

        return Response.ok(bono).build();
    }
}
