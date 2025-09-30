package operadores;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuántos años tienes?");
		
		int edad = sc.nextInt();
		
		
		String resultado = edad>=18 ? "Eres mayor de edad." : "Eres menor de edad.";
		
		System.out.printf("Tienes %d años. %s \n", edad, resultado);

	}

}
