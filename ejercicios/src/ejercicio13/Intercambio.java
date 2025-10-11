package ejercicio13;

public class Intercambio {
	
	// ATRIBUTOS
	private int a;
	private int b;
	
	// CONSTRUCTOR
	public Intercambio(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// MÉTODOS
	public void getA() {
		System.out.println(this.a);
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void getB() {
		System.out.println(this.b);
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void intercambiar() {
		int numeroTemporal = this.a;
		this.a = this.b;
		this.b = numeroTemporal;
		
		System.out.printf("Valor del número a: %d.\n"
				+ "Valor del número b: %d.\n", this.a, this.b);
	}
}
