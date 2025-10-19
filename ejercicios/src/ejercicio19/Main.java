package ejercicio19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduzca la cantidad de monedas de 2€:");
		int dosEuros = sc.nextInt();
		
		System.out.println("Introduzca la cantidad de monedas de 1€:");
		int unEuro = sc.nextInt();
		
		System.out.println("Introduzca la cantidad de monedas de 50 céntimos:");
		int cent50 = sc.nextInt();
		
		System.out.println("Introduzca la cantidad de monedas de 20 céntimos:");
		int cent20 = sc.nextInt();
		
		System.out.println("Introduzca la cantidad de monedas de 10 céntimos:");
		int cent10 = sc.nextInt();
		
		// LLAMAMOS CONSTRUCTOR
		Monedero monedero1 = new Monedero(dosEuros, unEuro, cent50, cent20, cent10);
		
		// LLAMAMOS MÉTODO
		monedero1.calcularTotalEuros();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}