package WebServices;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProduccionControler
 */
public class ProduccionControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduccionControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/produccion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int day1 = Integer.parseInt(request.getParameter("day1"));
		int day2 = Integer.parseInt(request.getParameter("day2"));
		int day3 = Integer.parseInt(request.getParameter("day3"));
		int day4 = Integer.parseInt(request.getParameter("day4"));
		int day5 = Integer.parseInt(request.getParameter("day5"));
		int day6 = Integer.parseInt(request.getParameter("day6"));
		
		ClientService service = new ClientService();
		String bono = service.bonoDiasProduccion(day1, day2, day3, day4, day5, day6);
		int total = day1 + day2 + day3 + day4 + day5 + day6;
		request.setAttribute("total", String.valueOf(total));
		request.setAttribute("bono", bono);
		request.getRequestDispatcher("/produccion.jsp").forward(request, response);
	}

}
