package operadores;

import java.util.Scanner;

public class Ejercicio4Logicos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce un número:");
		
		int numero = sc.nextInt();
		
		
		System.out.printf("Has introducido el número %d. ¿Es un número par? %b \n", numero, (numero%2==0));
		
	}

}
