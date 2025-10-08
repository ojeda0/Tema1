package poo.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Mario", 20);
		System.out.println(persona1.nombre);
		
		Persona.mostrarTotalPersonas();
		Persona.mostrarUltimoNombre();
		Persona.mostrarUltimaPersona();
		
		
		
		Persona persona2 = new Persona("Abraham", 24);
		System.out.println(persona2.nombre);
		
		Persona.mostrarTotalPersonas();
		Persona.mostrarUltimoNombre();
		Persona.mostrarUltimaPersona();
	}

}