package poo.ejercicio2;

public class Persona {

	// ATRIBUTOS
	String nombre;
	int edad;
	
	// ATRIBUTOS ESTÁTICOS
	static int contador = 0;
	static String ultimoNombre = "";
	static Persona ultimaPersona = null;
	
	// CONSTRUCTOR
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
		ultimoNombre = nombre;
		ultimaPersona = this;
	}
	
	// MÉTODOS ESTÁTICOS
	static void mostrarTotalPersonas() {
		System.out.println(contador);
	}
	
	static void mostrarUltimoNombre() {
		System.out.println(ultimoNombre);
	}
	
	static void mostrarUltimaPersona() {
		System.out.printf("Última persona creada: %s.\n"
						+ "Edad: %d años.\n", ultimaPersona.nombre, ultimaPersona.edad);
	}
}
