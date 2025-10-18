package ejercicio12;

public class Raices {
	
	// ATRIBUTOS
	private double numero;
	
	// CONSTRUCTOR
	public Raices(double numero) {
		this.numero = numero;
	}
	
	// MÉTODOS
	public void getNumero() {
		System.out.println(this.numero);
	}
	
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public void mostrarRaizCuadrada() {
		double raizCuadrada = Math.sqrt(this.numero);
		
		System.out.printf("La raíz cuadrada de este número es: %.2f\n", raizCuadrada);
	}
	
	public void mostrarRaizCubica() {
		double raizCubica = Math.cbrt(this.numero);
		
		System.out.printf("La raíz cúbica de este número es: %.2f\n", raizCubica);
	}
}