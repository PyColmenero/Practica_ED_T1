package es.studium.testColegio;

public class Asignatura {
	
	//Declarar Variables necesarias para cada Objeto "Asignatura"
	private int id;
	private String nombre;
	private int horas;
	
	// Constructor Vacío y por Parámetros
	public Asignatura() {
		this.id = 0;
		this.nombre = "";
		this.horas = 0;
	}
	public Asignatura(int id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
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
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
}
