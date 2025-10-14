package ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIR DATOS
		System.out.println("Introduce la cantidad en megabytes:");
		double megabytes = sc.nextDouble();
		
		// CONSTRUCTOR
		Capacidad cantidad1 = new Capacidad(megabytes);
		
		// LLAMAMOS AL MÉTODO DEL OBJETO CREADO
		cantidad1.mostrarConversiones();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}

}
