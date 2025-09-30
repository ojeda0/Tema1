package operadores;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		double precioManzana = 2.35;
		double precioPera = 1.95;
		
		
		System.out.println("Introduce en kg la cantidad de manzanas vendidas en el primer semestre.");

		int Manzana1 = sc.nextInt();
		
		System.out.println("\nIntroduce en kg la cantidad de peras vendidas en el primer semestre.");

		int Pera1 = sc.nextInt();
		
		System.out.println("\nIntroduce en kg la cantidad de manzanas vendidas en el segundo semestre.");

		int Manzana2 = sc.nextInt();
		
		System.out.println("\nIntroduce en kg la cantidad de peras vendidas en el segundo semestre.");

		int Pera2 = sc.nextInt();
		
		
		System.out.printf("\nEn el primer semestre has vendido %d kg de manzanas y %d kg de peras.\n", Manzana1, Pera1);
		System.out.printf("En el segundo semestre has vendido %d kg de manzanas y %d kg de peras.\n", Manzana2, Pera2);
		System.out.printf("Los kilos totales vendidos son %d kg de manzanas y %d kg de peras.\n", Manzana1+Manzana2, Pera1+Pera2);
		System.out.printf("El kilo de manzanas está a %.2f € y el kilo de peras está a %.2f €.\n", precioManzana, precioPera);
		System.out.printf("\nTu beneficio anual es de %.2f €. \n", ((Manzana1+Manzana2)*precioManzana)+((Pera1+Pera2)*precioPera));
		
	}

}
