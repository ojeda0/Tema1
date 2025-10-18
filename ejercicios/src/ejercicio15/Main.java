package ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduzca los minutos totales:");
		int minutos = sc.nextInt();
		
		// LLAMAMOS CONSTRUCTOR
		TiempoSimple tiempo1 = new TiempoSimple(minutos);
		
		// LLAMAMOS MÉTODO
		tiempo1.mostrarHorasMinutos();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}