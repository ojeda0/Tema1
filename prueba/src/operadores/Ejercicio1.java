package operadores;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos años tienes?");
		
		int edad = sc.nextInt();
		
		System.out.printf("Tienes %d años, el año que viene tendrás %d años \n", edad, ++edad);

	}

}
