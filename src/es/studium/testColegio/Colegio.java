package es.studium.testColegio;

public class Colegio {
		
	//Declarar Variables necesarias para cada Objeto "Colegio"
	private int id;
	private String nombre;
	private String direccion;
	
	// Constructor Vacío  y por Parámetros
	public Colegio() {
		this.id = 0;
		this.nombre = "";
		this.direccion = "";
	}
	public Colegio(int id, String nombre, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	// Todos los "getters" y "setters" de cada Atributo de la clase
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
