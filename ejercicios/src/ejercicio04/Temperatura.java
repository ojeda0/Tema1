package ejercicio04;

public class Temperatura {
	
	// ATRIBUTOS
	private double fahrenheit;
	
	// CONSTRUCTOR
	public Temperatura(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	// MÉTODOS
	public void getFahrenheit() {
		System.out.println(this.fahrenheit);
	}
	
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public void mostrarCelsius() {
		double celsius = (this.fahrenheit-32)/1.8;
		
		System.out.printf("La temperatura introducida en grados Fahrenheit ha sido de %.2f ºF.\n"
				+ "La temperatura convertida a grados Celsius es de %.2f ºC.\n", this.fahrenheit, celsius);
	}
}
