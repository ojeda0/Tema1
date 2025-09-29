package operadores;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce la primera nota");
		
		int primeraNota = sc.nextInt();
		
		
		System.out.println("Introduce la segunda nota");
		
		int segundaNota = sc.nextInt();
		
		double media = (primeraNota+segundaNota)/2.0;
		
		
		System.out.printf("Tu primera nota ha sido %d y tu segunda nota ha sido %d , tu media de nota es %.3f \n", primeraNota, segundaNota, media);
		
		System.out.println("Julio te quiero");
	}

}
