package ejercicio18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		// PEDIMOS EL NÚMERO
		System.out.println("Introduce un número de dos cifras que quieras invertir:");
		int numero = sc.nextInt();
		
		// LLAMAMOS AL CONSTRUCTOR
		NumeroInvertido numero1 = new NumeroInvertido(numero);
		
		// LLAMAMOS AL MÉTODO PARA EL OBJETO CREADO POR EL CONSTRUCTOR
		numero1.invertirNumero();
		
		// CERRAMOS ESCÁNER
		sc.close();
	}
}