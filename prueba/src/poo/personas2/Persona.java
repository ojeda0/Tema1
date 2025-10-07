package poo.personas2;

public class Persona {

	// Declaramos atributos: nombre , edad , estatura
	
	String nombre;
	int edad;
	double estatura;
	
	static String diaDeLaSemana = "Viernes";
	
	
	// Vamos a crear nuestro constructor de personas con los atributos correspondientes.

	Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	// Declaramos los métodos: saludar , 
	
	// Void no devuelve nada, no se puede reutilizar sus datos.
	
	void saludar(String nombre) {
		System.out.printf("¡Hola, %s! Soy %s. \n", nombre, this.nombre);
		System.out.printf("Estamos a %s. \n", diaDeLaSemana);
	}
	
	void presentarse() {
		System.out.printf("Mi nombre es %s, tengo %d años y mido %.2f metros. \n", nombre, edad, estatura);
	}
	
	void cumplirAnyos() {
		edad++;
	}
	
	void crecer(double incremento) {
		estatura = estatura + incremento;
	}
	
}