package poo.ejercicio3modificadores.comprobar;

import poo.ejercicio3modificadores.CuentaCorriente;

public class Comprobar {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente("10099304L", "Francisco José Jiménez García");
		
		// COMPROBAR MODIFICADORES
		System.out.println(cuenta1.nombreTitular);
//		System.out.println(cuenta1.dni);
//		System.out.println(cuenta1.saldo);
	}

}
