package tema8.ej01.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tema8.ej01.model.LibroDAO;
import tema8.ej01.model.bo.Libro;

/**
 * Servlet implementation class BorrarLibroPorId
 */
@WebServlet("/tema8/ej01/EditarLibroPorId")
public class EditarLibroPorId extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id=Long.parseLong(request.getParameter("id"));
		LibroDAO libroDAO=new LibroDAO();
		Libro libro=libroDAO.recuperarLibroPorId(id);
		request.setAttribute("libro", libro);
		
		request.getRequestDispatcher(
				"/tema8/ej01/editarLibro.jsp")
				.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Long id=Long.parseLong(req.getParameter("id"));
		String isbn=req.getParameter("isbn");
		String titulo=req.getParameter("titulo");
		String categoria=req.getParameter("categoria");
		Libro libro=new Libro(id,isbn,titulo,categoria);
		LibroDAO libroDAO=new LibroDAO();
		libroDAO.guardar(libro);
		resp.sendRedirect(req.getContextPath()+"/tema8/ej01/MostrarTodosLibros");
	}

}