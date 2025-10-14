package ejercicio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIR DATOS
		System.out.println("Introduce el valor de la primera nota:");
		double nota1 = sc.nextDouble();
		
		System.out.println("Introduce la media deseada:");
		double mediaDeseada = sc.nextDouble();
		
		// CONSTRUCTOR
		NotaExamenes primeraNota = new NotaExamenes(nota1, mediaDeseada);
		
		// LLAMAR MÉTODO DEL OBJETO CREADO POR EL CONSTRUCTOR
		primeraNota.calcularNotaNecesaria();
		
		// CERRAR ESCÁNER
		sc.close();
	}

}
