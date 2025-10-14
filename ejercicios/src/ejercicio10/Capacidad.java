package ejercicio10;

public class Capacidad {
	
	// ATRIBUTOS
	private double megabytes;
	
	// CONSTRUCTOR
	public Capacidad(double megabytes) {
		this.megabytes = megabytes;
	}
	
	// MÉTODOS
	public void getMegabytes() {
		System.out.println(this.megabytes);
	}
	
	public void setMegabytes(double megabytes) {
		this.megabytes = megabytes;
	}
	
	public void mostrarConversiones() {
		double bytes = this.megabytes*1000000;
		double kilobytes = this.megabytes*1000;
		double gigabytes = this.megabytes*0.001;
		
		System.out.printf("La cantidad de megabytes introducidas es de %.2f\n"
				+ "Cantidad en bytes: %.2f bytes.\n"
				+ "Cantidad en kilobytes: %.2f kilobytes.\n"
				+ "Cantidad en gigabytes: %.2f gigabytes.\n", this.megabytes, bytes, kilobytes, gigabytes);
	}

}
