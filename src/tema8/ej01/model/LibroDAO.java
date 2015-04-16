package tema8.ej01.model;

import java.util.List;

import org.hibernate.Transaction;

import tema8.ej01.model.bo.Libro;

public class LibroDAO extends DAObase {
	public void insertarLibro(Libro libro) {
		Transaction t = session.beginTransaction();
		session.save(libro);
		t.commit();
	}

	public List<Libro> getTodosLibros() {
		Transaction t = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Libro> listaLibros = session.createQuery("from Libro").list();
		t.commit();
		return listaLibros;
	}
	
	public void borrarLibroPorId(Long id) {
		Transaction t = session.beginTransaction();
		Libro libro=(Libro)session.load(Libro.class,id);
		session.delete(libro);
		t.commit();
	}

	public Libro recuperarLibroPorId(Long id) {
		Transaction t = session.beginTransaction();
		Libro libro=(Libro)session.load(Libro.class,id);
		t.commit();
		return libro;
	}

	public void guardar(Libro libro) {
		Transaction t = session.beginTransaction();
		session.merge(libro);
		t.commit();
	}
}

