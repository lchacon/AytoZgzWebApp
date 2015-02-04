package es.open4job.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.open4job.modelo.dao.AparcamientoMotoDAO;
import es.open4job.modelo.vo.AparcamientoMotoVO;

/**
 * Servlet implementation class MiPrimerServlet
 */
public class MiSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public MiSessionServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*int id=0;
		HttpSession session=request.getSession();
		try{
			id = (Integer) session.getAttribute("aparcamiento");
		}catch(Exception e){
			
		}

		/*String driver = "oracle.jdbc.driver.OracleDriver";

		String host = "54.154.192.80";
		String puerto = "1521";
		String sid = "xe";

		String user = "test";
		String password = "test";

		String url = "jdbc:oracle:thin:" + user + "/" + password + "@" + host
				+ ":" + puerto + ":" + sid;
	
		// AparcamientoMoto
		AparcamientoMotoDAO aparcamientoMotoDAO = new AparcamientoMotoDAO(
				driver, url, user, password);
		// Detalles Aparcamiento Moto
		AparcamientoMotoVO motoDetalle = aparcamientoMotoDAO
				.getDetailAparcamientoMoto(id);
		request.setAttribute("aparcamiento", motoDetalle);*/
		request.getRequestDispatcher("SessionAparcamiento.jsp").forward(request,response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
