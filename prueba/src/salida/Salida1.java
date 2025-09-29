package salida;

public class Salida1 {

	public static void main(String[] args) {
		
		//Mostramos en pantalla con salto de línea incluido
		
		System.out.println("Hola");
		
		
		//Mostramos en pantalla sin salto de línea, tenemos que añadirlo al final con \n
		
		System.out.print("H");
		System.out.print("o");
		System.out.print("l");
		System.out.print("a");
		System.out.print("\n");
		
		
		/*
		 * PRINT F APUNTES
		 * 
		 * %s -> Texto
		 * %d -> Número entero
		 * %f -> Número con decimales
		 * %b -> True or false
		 */
		
		//Creamos las variables String (para añadir varios carácteres de texto).
		
		String nombre = "Abraham";
		String primerApellido = "Teba";
		String segundoApellido = "Ojeda";
		
		
		//Creamos la variable edad para que sea número.
		
		int edad = 24;
		
		
		//Mostramos en pantalla utilizando los carácteres especiales en esta sintaxis, por orden.
		
		System.out.printf("Hola, mi nombre es %s %s %s y tengo %d años \n", nombre, primerApellido, segundoApellido, edad);
		
		
		//Mostramos en pantalla limitando a 2 decimales, con %f y añadimos . y el número de decimales que queremos.

		System.out.printf("La cuenta es %.2f € \n", 32.56998989);

	}

}
