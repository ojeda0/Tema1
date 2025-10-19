package ejercicio19;

public class Monedero {

	// ATRIBUTOS
	private int dosEuros;
	private int unEuro;
	private int cent50;
	private int cent20;
	private int cent10;
	
	// CONSTRUCTOR
	public Monedero(int dosEuros, int unEuro, int cent50, int cent20, int cent10) {
		this.dosEuros = dosEuros;
		this.unEuro = unEuro;
		this.cent50 = cent50;
		this.cent20 = cent20;
		this.cent10 = cent10;
	}
	
	// MÉTODOS
	public void getDosEuros() {
		System.out.println(this.dosEuros);
	}
	
	public void setDosEuros(int dosEuros) {
		this.dosEuros = dosEuros;
	}
	
	public void getUnEuro() {
		System.out.println(this.unEuro);
	}
	
	public void setUnEuro(int unEuro) {
		this.unEuro = unEuro;
	}
	
	public void getCent50() {
		System.out.println(this.cent50);
	}
	
	public void setCent50(int cent50) {
		this.cent50 = cent50;
	}
	
	public void getCent20() {
		System.out.println(this.cent20);
	}
	
	public void setCent20(int cent20) {
		this.cent20 = cent20;
	}
	
	public void getCent10() {
		System.out.println(this.cent10);
	}
	
	public void setCent10(int cent10) {
		this.cent10 = cent10;
	}
	
	public void calcularTotalEuros() {
		int totalCentimos = (this.dosEuros * 200) + (this.unEuro * 100) + (this.cent50 * 50) + (this.cent20 * 20) + (this.cent10 * 10);
		
		int euros = totalCentimos / 100;
		int centimos = totalCentimos % 100;
		
		System.out.printf("Cantidad de monedas introducidas: %d monedas de 2€, %d monedas de 1€, %d monedas de 50 céntimos, %d monedas de 20 céntimos y %d monedas de 10 céntimos.\n"
				+ "La cantidad total en la cartera es de %d euros y %d céntimos.\n", this.dosEuros, this.unEuro, this.cent50, this.cent20, this.cent10, euros, centimos);
	}
}