package test.hibernate;

public class SubPojo {
	
	private Long id;
	private String nombre;
	public SubPojo() {
	}
	public SubPojo(String nombre) {
		this.nombre=nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
