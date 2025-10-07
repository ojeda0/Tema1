package poo.personas;

public class Persona {

	// Declaramos atributos: nombre , edad , estatura
	
	String nombre;
	int edad;
	double estatura;
	
	static String diaDeLaSemana = "Viernes";
	
	
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