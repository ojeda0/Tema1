package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduzca la temperatura en grados Fahrenheit (ºF).");
		double fahrenheit = sc.nextDouble();
		
		// CONSTRUCTOR
		Temperatura temperatura1 = new Temperatura(fahrenheit);
		
		// MÉTODO DEL OBJETO CREADO
		temperatura1.mostrarCelsius();
		
		// CERRAR ESCÁNER
		sc.close();
	}

}
