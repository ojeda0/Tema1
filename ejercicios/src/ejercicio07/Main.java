package ejercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce la nota del parcial 1:");
		double parcial1 = sc.nextDouble();
		
		System.out.println("Introduce la nota del parcial 2:");
		double parcial2 = sc.nextDouble();
		
		System.out.println("Introduce la nota del parcial 3:");
		double parcial3 = sc.nextDouble();
		
		System.out.println("Introduce la nota del examen final:");
		double examenFinal = sc.nextDouble();
		
		System.out.println("Introduce la nota del trabajo final:");
		double trabajoFinal = sc.nextDouble();
		
		// LLAMAMOS AL CONSTRUCTOR
		NotaAlgoritmos nota1 = new NotaAlgoritmos(parcial1, parcial2, parcial3, examenFinal, trabajoFinal);
		
		// LLAMAMOS AL OBJETO CREADO PARA EJECUTAR EL MÉTODO
		nota1.calcularNotaFinal();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}