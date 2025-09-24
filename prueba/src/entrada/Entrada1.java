package entrada;

//Importamos el paquete de Scanner

import java.util.Scanner;


public class Entrada1 {

	public static void main(String[] args) {
		
		
		//Añadimos una celda para poder recoger datos, tipo Scanner
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cómo te llamas?");
		
		
		//Añadimos variable String para recoger texto del Scanner, con .next
		
		String nombre = sc.next();
		
		System.out.printf("Hola %s \n", nombre);
		
		
		//Con .nextInt() Recogemos números enteros
		
		System.out.println("¿Cuantos años tienes?");
		int edad = sc.nextInt();
		System.out.printf("Tienes %d años \n", edad);

		
		//Con .nextDouble recogemos números decimales
		//Importante separar con . al programar dentro del código y fuera del código usar ,
		
		System.out.println("¿Cuánto mides?");
		double estatura = sc.nextDouble();
		System.out.printf("Mides %.2f cm \n", estatura);
		
		
		//Con .nextBoolean() recogemos verdadero o falso (true or false)
		
		System.out.println("¿Vas a ver al Sevilla?");
		boolean sevilla = sc.nextBoolean();
		System.out.printf("Vas a ver al Sevilla: %b \n", sevilla);
		
	}

}
