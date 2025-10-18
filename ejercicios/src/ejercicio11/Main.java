package ejercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce el valor de x1:");
		double x1 = sc.nextDouble();
		
		System.out.println("Introduce el valor de y1:");
		double y1 = sc.nextDouble();
		
		System.out.println("Introduce el valor de x2:");
		double x2 = sc.nextDouble();
		
		System.out.println("Introduce el valor de y2:");
		double y2 = sc.nextDouble();
		
		// CONSTRUCTOR
		DistanciaEntrePuntos distancia1 = new DistanciaEntrePuntos(x1, y1, x2, y2);
		
		// LLAMAMOS MÉTODO
		distancia1.mostrarDistancia();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}
