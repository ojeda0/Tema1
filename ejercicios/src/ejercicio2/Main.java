package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce el cateto A del triángulo rectángulo:");
		double catetoA = sc.nextDouble();
		
		System.out.println("Introduce el cateto B del triángulo rectángulo:");
		double catetoB = sc.nextDouble();
		
		// LLAMAMOS AL CONSTRUCTOR Y AL OBJETO CREADO PARA REALIZAR EL MÉTODO.
		TrianguloRectangulo triangulorectangulo1 = new TrianguloRectangulo(catetoA, catetoB);
		triangulorectangulo1.calcularHipotenusa();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}

}
