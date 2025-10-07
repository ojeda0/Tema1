package poo.ejercicio;

public class CuentaCorriente {
	
	// ATRIBUTOS
	String dni;
	String nombreTitular;
	double saldo;
	
	
	// CONSTRUCTOR
	CuentaCorriente(String dni, String nombreTitular) {
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		this.saldo = 0.0;
	}
	
	
	// MÉTODOS
	void ingresarDinero(double cantidad) {
		this.saldo += cantidad;
	}
	
	
	void sacarDinero(double cantidad) {
		String comprobar = cantidad>this.saldo ? "Error, no tienes dinero en tu cuenta para retirar esa cantidad." : "Dinero retirado con éxito.";
		System.out.printf("%s \n", comprobar);
		this.saldo -= cantidad;
	}
	
	
	void mostrarInformacion() {
		System.out.printf("Información de su cuenta: Su nombre es %s y su DNI es %s. El saldo actual de su cuenta es de %.2f € \n", nombreTitular, dni, saldo);
	}
	
}
