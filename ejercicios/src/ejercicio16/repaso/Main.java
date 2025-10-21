package ejercicio16.repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce el tiempo total en segundos:");
		int segundos = sc.nextInt();
		
		// LLAMAMOS CONSTRUCTOR
		TiempoCompleto tiempo1 = new TiempoCompleto(segundos);
		
		// LLAMAMOS MÉTODO
		tiempo1.mostrarHorasMinutosSegundos();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}