package poo.ejercicio2;

public class Persona {

	// ATRIBUTOS
	String nombre;
	int edad;
	
	// ATRIBUTOS ESTÁTICOS
	static int contador = 0;
	static String ultimaPersona;
	
	// CONSTRUCTOR
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
		ultimaPersona = nombre;
	}
	
	static void mostrarTotalPersonas() {
		System.out.println(contador);
	}
}
