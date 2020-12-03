package es.studium.testColegio;

public class Persona {
	
	//Declarar Variables necesarias para cada Objeto "Persona"
	private String nombre;
	private String direccion;
	private double nota;
	// Guardar correspondientes Objetos externos
	// Para poder acceder a todos sus datos
	private Colegio colegio;
	private Asignatura asigntaura;
	
	
	// Constructor Vacío  y por Parámetros
	public Persona() {
		this.nombre = "";
		this.direccion = "";
		this.colegio = new Colegio();
		this.asigntaura = new Asignatura();
		this.nota = 0;
	}
	public Persona(String nombre, String direccion, Colegio colegio, Asignatura asigntaura, double nota) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.colegio = colegio;
		this.asigntaura = asigntaura;
		this.nota = nota;
	}
	
	
	
	// Todos los "getters" y "setters" de cada Atributo de la clase
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
	public Colegio getColegio() {
		return colegio;
	}
	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}
	public Asignatura getAsigntaura() {
		return asigntaura;
	}
	public void setAsigntaura(Asignatura asigntaura) {
		this.asigntaura = asigntaura;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}	
}
