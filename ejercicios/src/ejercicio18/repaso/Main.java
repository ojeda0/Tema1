package ejercicio18.repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS DATOS
		System.out.println("Introduce un número que quieras invertir:");
		int numero = sc.nextInt();
		
		// LLAMAMOS CONSTRUCTOR
		NumeroInvertido numero1 = new NumeroInvertido(numero);
		
		// LLAMAMOS MÉTODO
		numero1.invertirNumero();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}