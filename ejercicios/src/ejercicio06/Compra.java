package ejercicio06;

public class Compra {
	
	// ATRIBUTOS
	private double total;
	
	// CONSTRUCTOR
	public Compra(double total) {
		this.total = total;
	}
	
	// MÉTODOS
	public void getTotal() {
		System.out.println(this.total);
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void mostrarTotalConDescuento() {
		double totalConDescuento = this.total*0.85;
		
		System.out.printf("El total de su compra ha sido: %.2f €.\n"
				+ "Tenemos actualmente un descuento del 15 %% en nuestros productos.\n"
				+ "El total de su compra con descuento aplicado es: %.2f €.\n", this.total, totalConDescuento);
	}

}
