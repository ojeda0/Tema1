package poo.personas;

public class Main {

	public static void main(String[] args) {
		
		
		// Le damos instancia a un objeto en la clase persona.
		
		Persona persona1 = new Persona();
		
		persona1.nombre = "Laura";
		persona1.edad = 25;
		persona1.estatura = 1.60;
		
		System.out.println(persona1.nombre);
		
		
		// Podemos usar null para aplicar un valor que aún no se ha dado.
		
		Persona persona2 = null;
		
		System.out.println(persona2);
		
		
		// Le damos instancia a otro objeto en la clase persona.
		
		Persona persona3 = new Persona();
		
		persona3.nombre = "Manuel";
		persona3.edad = 30;
		persona3.estatura = 1.85;
		
		System.out.println(persona3.nombre);
		
		
		// Así aplicamos que los objetos realicen acciones.
		
		persona1.saludar();
		persona1.presentarse();
		persona3.saludar();
		persona3.presentarse();
		
	
		// Podemos hacer que cumplan años y ver si su edad aumenta. Lo mismo con el crecimiento.
		
		persona1.cumplirAnyos();
		persona3.cumplirAnyos();
		persona1.crecer(0.15);
		persona3.crecer(0.2);
		
		System.out.println(persona1.edad);
		System.out.println(persona1.estatura);
		System.out.println(persona3.edad);
		System.out.println(persona3.estatura);
	}

}
