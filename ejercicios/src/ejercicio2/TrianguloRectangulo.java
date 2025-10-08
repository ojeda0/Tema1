package ejercicio2;

public class TrianguloRectangulo {
	
	// ATRIBUTOS
	private double catetoA;
	private double catetoB;
	
	// CONSTRUCTOR
	public TrianguloRectangulo(double catetoA, double catetoB) {
		this.catetoA = catetoA;
		this.catetoB = catetoB;
	}
	
	// MÉTODOS
	public void getCatetoA() {
		System.out.println(this.catetoA);
	}
	
	public void setCatetoA(double catetoA) {
		this.catetoA = catetoA;
	}
	
	public void getCatetoB() {
		System.out.println(this.catetoB);
	}
	
	public void setCatetoB(double catetoB) {
		this.catetoB = catetoB;
	}
	
	public void calcularHipotenusa() {
		double hipotenusa = Math.sqrt(((this.catetoA*this.catetoA)+(this.catetoB*this.catetoB)));
		System.out.printf("Longitud del cateto A: %.2f cm.\n"
				+ "Longitud del cateto B: %.2f cm.\n"
				+ "Hipotenusa: %.2f cm.\n", this.catetoA, this.catetoB, hipotenusa);
	}
	
}
