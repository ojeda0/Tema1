package ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduzca la distancia entre los vehículos (Km):");
		double distancia = sc.nextDouble();
		
		System.out.println("Introduzca la velocidad del primer coche, el que ha salido antes (Km/h):");
		double velocidad1 = sc.nextDouble();
		
		System.out.println("Introduzca la velocidad del segundo coche, el que ha salido después (Km/h):");
		double velocidad2 = sc.nextDouble();
		
		// LLAMAMOS CONSTRUCTOR
		CruceVehiculos cruce1 = new CruceVehiculos(distancia, velocidad1, velocidad2);
		
		// LLAMAMOS MÉTODO
		cruce1.calcularTiempoAlcance();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}