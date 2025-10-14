package ejercicio08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIR DATOS
		System.out.println("Introduzca el primer número:");
		double num1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		double num2 = sc.nextDouble();
		
		// CONSTRUCTOR
		DistanciaAbsoluta distancia1 = new DistanciaAbsoluta(num1, num2);
		
		// LLAMAMOS AL MÉTODO DEL OBJETO CREADO POR EL CONSTRUCTOR
		distancia1.mostrarDistancia();
		
		// CERRAR ESCÁNER
		sc.close();
	}

}
