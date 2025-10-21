package ejercicio11;

public class DistanciaEntrePuntos {

	// ATRIBUTOS
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	// CONSTRUCTOR
	public DistanciaEntrePuntos(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	// MÉTODOS
	public void getX1() {
		System.out.println(this.x1);
	}
	
	public void setX1(double x1) {
		this.x1 = x1;
	}
	
	public void getY1() {
		System.out.println(this.y1);
	}
	
	public void setY1(double y1) {
		this.y1 = y1;
	}
	
	public void getX2() {
		System.out.println(this.x2);
	}
	
	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	public void getY2() {
		System.out.println(this.y2);
	}
	
	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	public void mostrarDistancia() {
		double distancia = Math.sqrt(Math.pow((this.x2-this.x1), 2)+Math.pow((this.y2-this.y1), 2));
		
		System.out.printf("El valor del punto x1 introducido ha sido: %.2f\n"
				+ "El valor del punto y1 introducido ha sido: %.2f\n"
				+ "El valor del punto x2 introducido ha sido: %.2f\n"
				+ "El valor del punto y2 introducido ha sido: %.2f\n"
				+ "La distancia entre estos dos puntos es: %.2f\n", this.x1, this.y1, this.x2, this.y2, distancia);
	}
}