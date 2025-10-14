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
		
	}
}
