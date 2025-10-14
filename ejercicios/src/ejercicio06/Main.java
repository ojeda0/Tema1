package ejercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIR DATOS
		System.out.println("Introduzca el importe total de su compra:");
		double total = sc.nextDouble();
		
		// CONSTRUCTOR
		Compra compra1 = new Compra(total);
		
		// LLAMAMOS AL MÉTODO DEL OBJETO CREADO POR EL CONSRUCTOR
		compra1.mostrarTotalConDescuento();
		
		// CERRAR ESCÁNER
		sc.close();
	}

}
