package poo.personas2;

public class Main {

	public static void main(String[] args) {
		
		
		// Le damos instancia a un objeto en la clase persona.
		
		Persona persona1 = new Persona("Laura", 25, 1.60);
		System.out.println(persona1.nombre);
		
		
		// Podemos usar null para aplicar un valor que aún no se ha dado.
		
		Persona persona2 = new Persona(null, 0, 0);
		System.out.println(persona2.nombre);
		
		
		// Le damos instancia a otro objeto en la clase persona.
		
		Persona persona3 = new Persona("Manuel", 30, 1.80);
		System.out.println(persona3.nombre);
		
		
		// Así aplicamos que los objetos realicen acciones.
		
		persona1.saludar("Mario");
		persona1.presentarse();
		persona3.saludar("Mario");
		persona3.presentarse();
		
	
		// Podemos hacer que cumplan años y ver si su edad aumenta. Lo mismo con el crecimiento.
		
		persona1.cumplirAnyos();
		persona3.cumplirAnyos();
		persona1.crecer(0.15);
		persona3.crecer(0.05);
		
		System.out.println(persona1.edad);
		System.out.println(persona1.estatura);
		System.out.println(persona3.edad);
		System.out.println(persona3.estatura);
		
		
		// Vamos a usar nuestro constructor para crear una persona mucho más rápido.
		
		Persona persona4 = new Persona("José Manuel", 42, 1.74);
		System.out.println(persona4.nombre);
	}

}
