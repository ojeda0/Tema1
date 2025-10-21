package ejercicio18.repaso;

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
	
	public void invertirNumero() {
		int decena = this.numero / 10;
		int unidad = this.numero % 10;
		
		int invertido = (unidad * 10) + decena;
		
		System.out.printf("Número introducido: %d\n"
			+ "Número invertido: %d\n", this.numero, invertido);
	}
}