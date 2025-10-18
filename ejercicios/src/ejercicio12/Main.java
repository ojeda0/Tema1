package ejercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduzca un número:");
		double numero = sc.nextDouble();
		
		// LLAMAMOS CONSTRUCTOR
		Raices numero1 = new Raices(numero);
		
		// LLAMAMOS MÉTODO
		numero1.mostrarRaizCuadrada();
		numero1.mostrarRaizCubica();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}