package operadores;

import java.util.Scanner;

public class Numeroprimo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce un número:");
		
		int numero = sc.nextInt();
		
		
		System.out.printf("Has introducido el número %d. ¿Es un número primo? %b \n", numero, numero%numero==0 && numero%1==0);
		
	}

}
