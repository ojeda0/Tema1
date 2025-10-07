package poo.ejercicio;

public class Main {

	public static void main(String[] args) {
		
		// CUENTA 1.
		CuentaCorriente cuenta1 = new CuentaCorriente("10099304L", "Francisco José Jiménez García");
		cuenta1.mostrarInformacion();
		
		cuenta1.ingresarDinero(100);
		cuenta1.mostrarInformacion();
		
		cuenta1.sacarDinero(55.2);
		cuenta1.mostrarInformacion();
		
		
		// CUENTA 2.
		CuentaCorriente cuenta2 = new CuentaCorriente("20034704M", "Laura García Pérez");
		cuenta2.mostrarInformacion();
	}

}
