package ejercicio03;

public class Calculadora {
	
	// ATRIBUTOS
	private double numero1;
	private double numero2;
	
	// CONSTRUCTOR
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	// MÉTODOS
	public void getNumero1() {
		System.out.println(this.numero1);
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public void getNumero2() {
		System.out.println(this.numero2);
	}
	
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public void calcularSumaRestaMultiplicacionDivision() {
		double suma = this.numero1+this.numero2;
		double resta = this.numero1-this.numero2;
		double multiplicacion = this.numero1*this.numero2;
		double division = this.numero1/this.numero2;
		System.out.printf("Primer número introducido: %.2f\n"
				+ "Segundo número introducido: %.2f\n"
				+ "Suma: %.2f\n"
				+ "Resta: %.2f\n"
				+ "Multiplicación: %.2f\n"
				+ "División: %.2f\n", this.numero1, this.numero2, suma, resta, multiplicacion, division);
	}
	
}
