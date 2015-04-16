package tema8.ej01.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tema8.ej01.model.LibroDAO;
import tema8.ej01.model.bo.Libro;

@WebServlet("/tema8/ej01/MostrarTodosLibros")
public class MostrarTodosLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LibroDAO libroDAO=new LibroDAO();
		List<Libro> libros = libroDAO.getTodosLibros();
		request.setAttribute("libros", libros);
		request.getRequestDispatcher(
				"/tema8/ej01/mostrarLibros.jsp")
				.forward(request, response);
	}
}