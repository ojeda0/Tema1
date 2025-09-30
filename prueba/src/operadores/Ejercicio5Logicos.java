package operadores;

import java.util.Scanner;

public class Ejercicio5Logicos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuántos años tienes?");
		
		int edad = sc.nextInt();
		

		System.out.printf("Tienes %d años. ¿Te encuentras en edad laboral? %b \n", edad, edad>=16 && edad<67);
		
	}

}
