package es.studium.testColegio;

public class TestColegio {
	
	public static void main(String[] args) {
			
	// CREACI�N DE OBJETOS
		// INSTANCIAR LOS objetos COLEGIO
		Colegio c1 = new Colegio(0, "Escuela de ingl�s",  "Reyes Cat�licos, 14");
		Colegio c2 = new Colegio(1, "Escuela de franc�s", "Crist�bal Col�n, 92");
		
		// INSTANCIAR LOS objetos ASIGNATURA
		Asignatura a1 = new Asignatura(0, "Ingl�s B1", 	400);
		Asignatura a2 = new Asignatura(1, "Ingl�s B2", 	600);
		Asignatura a3 = new Asignatura(2, "Franc�s A2", 350);
		Asignatura a4 = new Asignatura(3, "Franc�s B1", 450);
			
		// INSTANCIAR LOS objetos PERSONA
		// 						        Nombre, 			 Direcci�n, 				Colegio,  	Asignatura, Nota	
		Persona persona1 = new Persona("Ana Abel", 		 	"Paseo de Am�rica, 15", 	c1, 		a1,   		7.0);
		Persona persona2 = new Persona("Benito Bueno", 	 	"Reyes Cat�licos, 16", 		c1, 		a2,   		6.0);
		Persona persona3 = new Persona("Carmen Cano", 	    "Reyes Cat�licos, 2", 		c1, 		a1,   		5.0);
		Persona persona4 = new Persona("Esteban Escalera", 	"Isabel la Cat�lica, 28", 	c2, 		a3,   		9.0);
		Persona persona5 = new Persona("Francisco Farf�n", 	"Crist�bal Col�n, s/n", 	c2, 		a4,   		8.5);
		
			
	// CONSULTAS
		//Mostrar por pantalla las direcciones de todos los centros
		System.out.println( "Nombre centro: " + c1.getDireccion() );
		System.out.println( "Nombre centro: " + c2.getDireccion() + "\n");
		
		//Mostrar por pantalla: Direcci�n de centro matriculado, desde el Objeto Colegio
		System.out.println( "La direcci�n del centro en la que se matricula " + persona3.getNombre() + " es " + persona3.getColegio().getDireccion() + "\n" );
			
		//Mostrar por pantalla: nota de Benito en el B2, su asignatura
		System.out.println( "La nota de " + persona2.getNombre() + " en " + persona2.getAsigntaura().getNombre() + " es un " + persona2.getNota() );
	}
}