package ejercicio14;

public class CruceVehiculos {

	// ATRIBUTOS
	private double distancia;
	private double velocidad1;
	private double velocidad2;
	
	// CONSTRUCTOR
	public CruceVehiculos(double distancia, double velocidad1, double velocidad2) {
		this.distancia = distancia;
		this.velocidad1 = velocidad1;
		this.velocidad2 = velocidad2;
	}
	
	// MÉTODOS
	public void getDistancia() {
		System.out.println(this.distancia);
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public void getVelocidad1() {
		System.out.println(this.velocidad1);
	}
	
	public void setVelocidad1(double velocidad1) {
		this.velocidad1 = velocidad1;
	}
	
	public void getVelocidad2() {
		System.out.println(this.velocidad2);
	}
	
	public void setVelocidad2(double velocidad2) {
		this.velocidad2 = velocidad2;
	}
	
	public void calcularTiempoAlcance() {
		double tiempo = this.distancia / (this.velocidad2 - this.velocidad1);
		double tiempoMinutos = tiempo * 60;
		
		System.out.printf("La distancia entre los vehículos introducida es de: %.2f km.\n"
				+ "La velocidad del primer coche introducida es de: %.2f km/h.\n"
				+ "La velocidad del segundo coche introducida es de: %.2f km/h.\n"
				+ "El tiempo que tardará en alcanzar un coche a otro es de: %.2f minutos o %.2f horas.\n", this.distancia, this.velocidad1, this.velocidad2, tiempoMinutos, tiempo);
	}
}