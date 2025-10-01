package poo.personas;

public class Persona {

	// Declaramos atributos: nombre , edad , estatura
	
	String nombre;
	int edad;
	double estatura;
	
	
	// Declaramos los métodos: saludar , 
	
	// Void no devuelve nada, no se puede reutilizar sus datos.
	
	void saludar() {
		System.out.println("¡Hola!");
	}
	
	void presentarse() {
		System.out.printf("Mi nombre es %s, tengo %d años y mido %.2f metros. \n", nombre, edad, estatura);
	}
	
}