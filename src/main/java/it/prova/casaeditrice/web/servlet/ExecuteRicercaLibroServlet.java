package it.prova.casaeditrice.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.casaeditrice.model.Libro;

@WebServlet("/ExecuteRicercaLibroServlet")
public class ExecuteRicercaLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static List<Libro> libri = new ArrayList<>();

	public ExecuteRicercaLibroServlet() {
		super();
		Libro libro = new Libro("rosso", "rosa", 250);
		Libro libro1 = new Libro("geronimo stilton", "bambini", 200);
		Libro libro2 = new Libro("ululato", "horror", 400);
		Libro libro3 = new Libro("la pentola d'oro", "narrativa", 110);
		libri.add(libro);
		libri.add(libro1);
		libri.add(libro2);
		libri.add(libro3);
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
		request.setAttribute("libro_attribute", libro);

		if (titoloParameter != null && titoloParameter != "" && genereParameter != null && genereParameter != ""
				&& pagineParameter != null && pagineParameter != "" && libri.contains(libro)) {
			rd = request.getRequestDispatcher("trovato.jsp");
		} else {
			rd = request.getRequestDispatcher("libroNonTrovato.jsp");
		}

		rd.forward(request, response);
	}

}
