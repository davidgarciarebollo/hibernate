package tema8.ej01.model.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Libro {

	// ===========================================
	// ATRIBUTOS
	// ===========================================
	private Long id;

	private String isbn;
	private String titulo;
	private String categoria;

	// ===========================================
	// CONSTRUCTORES
	// ===========================================
	public Libro() {
	}

	public Libro(String isbn, String titulo, String categoria) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.categoria = categoria;
	}

	public Libro(Long id, String isbn, String titulo, String categoria) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.categoria = categoria;
	}

	// ===========================================
	// GETTERS y SETTERS
	// ===========================================
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	// ===========================================
	// OTROS
	// ===========================================
	@Override
	public String toString() {
		return "(" + id + ")" + isbn + "/" + titulo + "/" + categoria;
	}

	@Override
	public boolean equals(Object otro) {
		return (otro instanceof Libro ? ((Libro) otro).getId() == id : false);
	}
}
