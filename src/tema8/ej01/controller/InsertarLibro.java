package tema8.ej01.controller;

import java.io.IOException;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tema8.ej01.model.LibroDAO;
import tema8.ej01.model.bo.Libro;

@WebServlet("/tema8/ej01/InsertarLibro")
public class InsertarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher(
				"/tema8/ej01/insertarLibro.jsp")
				.forward(req, resp);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String isbn = request.getParameter("isbn");
		String titulo = request.getParameter("titulo");
		String categoria = request.getParameter("categoria");

		Libro libro = new Libro(isbn, titulo, categoria);
		LibroDAO libroDAO = new LibroDAO();
		libroDAO.insertarLibro(libro);

		String baseURI = request.getContextPath();
		response.sendRedirect(baseURI + "/tema8/ej01/MostrarTodosLibros");
	}

}

