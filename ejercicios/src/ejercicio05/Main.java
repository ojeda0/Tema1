package ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIR DATOS
		System.out.println("Introduzca el número de respuestas correctas:");
		int correctas = sc.nextInt();
		
		System.out.println("Introduzca el número de respuestas incorrectas:");
		int incorrectas = sc.nextInt();
		
		System.out.println("Introduzca el número de respuestas en blanco:");
		int blancas = sc.nextInt();
		
		// CONSTRUCTOR
		EvaluacionTest examen1 = new EvaluacionTest(correctas, incorrectas, blancas);
		
		// LLAMAMOS AL MÉTODO DEL OBJETO CREADO POR EL CONSRUCTOR
		examen1.calcularNotaFinal();
		
		// CERRAR ESCÁNER
		sc.close();
	}

}
