package operadores;

import java.util.Scanner;

public class Relacionales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce un número:");
		
		int numero1 = sc.nextInt();
		
		
		System.out.println("Introduce otro número:");
		
		int numero2 = sc.nextInt();
		
		boolean mayor = (numero1>numero2);
		
		
		System.out.printf("¿%d es mayor que %d?: %b \n", numero1, numero2, mayor);

	}

}
