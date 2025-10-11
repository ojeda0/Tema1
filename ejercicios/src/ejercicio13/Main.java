package ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS LOS DATOS
		System.out.println("Vamos a intercambiar el valor de dos números.");
		
		System.out.println("Introduce el valor del número a:");
		int a = sc.nextInt();
		
		System.out.println("Introduce el valor del número b:");
		int b = sc.nextInt();
		
		// LLAMAR CONSTRUCTOR
		Intercambio intercambio1 = new Intercambio(a, b);
		
		// LLAMAR MÉTODO DEL OBJETO CONSTRUIDO POR EL CONSTRUCTOR
		intercambio1.intercambiar();
		
		// CERRAR ESCÁNER
		sc.close();
	}

}
