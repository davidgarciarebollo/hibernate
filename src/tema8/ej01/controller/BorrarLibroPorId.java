package tema8.ej01.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tema8.ej01.model.LibroDAO;

/**
 * Servlet implementation class BorrarLibroPorId
 */
@WebServlet("/tema8/ej01/BorrarLibroPorId")
public class BorrarLibroPorId extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id=Long.parseLong(request.getParameter("id"));
		LibroDAO libroDAO=new LibroDAO();
		libroDAO.borrarLibroPorId(id);
		
		/*
		request.getRequestDispatcher(
				"/tema8/ej01/MostrarTodosLibros")
				.forward(request, response);
		*/
		response.sendRedirect(request.getContextPath()+"/tema8/ej01/MostrarTodosLibros");
	}

}
