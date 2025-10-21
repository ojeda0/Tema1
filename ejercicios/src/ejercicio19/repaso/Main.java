package ejercicio19.repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce la cantidad de monedas de 2€ que tengas:");
		int dosEuros = sc.nextInt();
		
		System.out.println("Introduce la cantidad de monedas de 1€ que tengas:");
		int unEuro = sc.nextInt();
		
		System.out.println("Introduce la cantidad de monedas de 50 céntimos que tengas:");
		int cent50 = sc.nextInt();
		
		System.out.println("Introduce la cantidad de monedas de 20 céntimos que tengas:");
		int cent20 = sc.nextInt();
		
		System.out.println("Introduce la cantidad de monedas de 10 céntimos que tengas:");
		int cent10 = sc.nextInt();
		
		// LLAMAMOS CONSTRUCTOR
		Monedero monedero1 = new Monedero(dosEuros, unEuro, cent50, cent20, cent10);
		
		// LLAMAMOS MÉTODO
		monedero1.calcularTotalEuros();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}