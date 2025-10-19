package ejercicio17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce la hora de salida:");
		int horaSalida = sc.nextInt();
		
		System.out.println("Introduce el minuto de salida:");
		int minutoSalida = sc.nextInt();

		System.out.println("Introduce el segundo de salida:");
		int segundoSalida = sc.nextInt();
		
		System.out.println("Introduce el tiempo total del viaje en segundos:");
		int tiempoTotalSegundos = sc.nextInt();
		
		// LLAMAMOS CONSTRUCTOR
		ViajeCiclista viaje1 = new ViajeCiclista(horaSalida, minutoSalida, segundoSalida, tiempoTotalSegundos);
		
		// LLAMAMOS MÉTODO
		viaje1.mostrarHoraLlegada();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}