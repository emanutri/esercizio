package it.prova.casaeditrice.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.casaeditrice.model.Libro;

@WebServlet("/ExecuteAddLibroServlet")
public class ExecuteAddLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteAddLibroServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String titoloParameter = request.getParameter("titolo");
		String genereParameter = request.getParameter("genere");
		String pagineParameter = request.getParameter("pagine");

		RequestDispatcher rd = null;
		
		Libro libro = new Libro(titoloParameter, genereParameter, Integer.parseInt(pagineParameter));
		
		if (titoloParameter != null && titoloParameter != "" && genereParameter != null && genereParameter != ""
				&& pagineParameter != null && pagineParameter != "") {
			
			ExecuteRicercaLibroServlet.libri.add(libro);
			rd = request.getRequestDispatcher("aggiunto.jsp");
		}else {
			rd = request.getRequestDispatcher("inserimentoErrato.jsp");
		}
		rd.forward(request, response);

	}

}
