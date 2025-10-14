package ejercicio08;

public class DistanciaAbsoluta {
	
	// ATRIBUTOS
	private double num1;
	private double num2;
	
	// CONSTRUCTOR
	public DistanciaAbsoluta(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// MÉTODOS
	public void getNum1() {
		System.out.println(this.num1);
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public void getNum2() {
		System.out.println(this.num2);
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public void mostrarDistancia() {
		double distanciaAbsoluta = Math.abs(num1-num2);
		
		System.out.printf("Primer número introducido: %.2f\n"
				+ "Segundo número introducido: %.2f\n"
				+ "Distancia absoluta entre ambos números: %.2f\n", this.num1, this.num2, distanciaAbsoluta);
	}
}
