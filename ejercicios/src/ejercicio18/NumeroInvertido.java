package ejercicio18;

public class NumeroInvertido {
	
	// ATRIBUTOS
	
	private int numero;
	
	// CONSTRUCTOR
	
	public NumeroInvertido(int numero) {
		this.numero = numero;
	}
	
	// MÉTODOS
	public void getNumero() {
		System.out.println(this.numero);
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void invertirNumero( ) {
		int decena = this.numero / 10;
		int unidad = this.numero % 10;
		int invertido = unidad * 10 + decena;
		
		System.out.printf("Su número introducido ha sido %d.\n"
				+ "Decena del número: %d.\n"
				+ "Unidad del número: %d.\n"
				+ "Su número invertido es: %d.\n", this.numero, decena, unidad, invertido);
	}
}