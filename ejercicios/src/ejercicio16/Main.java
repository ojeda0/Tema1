package ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);

		// PEDIMOS DATOS
		System.out.println("Introduzca la cantidad de segundos completa:");
		int segundos = sc.nextInt();
		
		// LLAMAMOS CONSTRUCTOR
		TiempoCompleto tiempo1 = new TiempoCompleto(segundos);
		
		// LLAMAMOS MÉTODO
		tiempo1.mostrarHorasMinutosSegundos();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}