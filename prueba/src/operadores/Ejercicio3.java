package operadores;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuántos años tienes?");
		
		int edad = sc.nextInt();
		
		boolean mayorEdad = (edad>=18);
		
		
		System.out.printf("Tienes %d años. ¿Eres mayor de edad?: %b", edad, mayorEdad);
		
		
		//También podemos escribirlo así y nos ahorramos el booleano.
		
		System.out.printf("Tienes %d años. ¿Eres mayor de edad?: %b", edad, edad>=18);
		
	}

}
