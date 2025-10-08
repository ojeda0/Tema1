package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base del rectángulo:");
		
		double base = sc.nextDouble();
		
		System.out.println("Introduce la altura del rectángulo:");
		
		double altura = sc.nextDouble();
		
		Rectangulo rectangulo1 = new Rectangulo(base, altura);
		
		rectangulo1.calcularAreaPerimetro();
		

	}

}
