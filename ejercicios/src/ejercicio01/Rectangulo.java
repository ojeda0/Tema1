package ejercicio01;

public class Rectangulo {
	
	// ATRIBUTOS
	private double base;
	private double altura;
	
	// CONSTRUCTOR
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// MÉTODOS
	public void getBase() {
		System.out.println(this.base);
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void getAltura() {
		System.out.println(this.altura);
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void calcularAreaPerimetro() {
		double area = this.base * this.altura;
		double perimetro = (this.base + this.altura)*2;
		System.out.printf("Base del rectángulo: %.2f cm.\n"
				+ "Altura del rectángulo: %.2f cm.\n"
				+ "Area del rectángulo: %.2f cm^2.\n"
				+ "Perimetro del rectángulo: %.2f cm^2.\n", this.base, this.altura, area, perimetro);
	}
	
}
