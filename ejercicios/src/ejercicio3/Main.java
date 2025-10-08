package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce el primer número:");
		double numero1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo número:");
		double numero2 = sc.nextDouble();
		
		// CONSTRUCTOR
		Calculadora operacion1 = new Calculadora(numero1, numero2);
		
		operacion1.calcularSumaRestaMultiplicacionDivision();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}

}
