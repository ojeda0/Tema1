package ejercicio05;

public class EvaluacionTest {
	
	// ATRIBUTOS
	private int correctas;
	private int incorrectas;
	private int blancas;
	
	// CONSTRUCTOR
	public EvaluacionTest(int correctas, int incorrectas, int blancas) {
		this.correctas = correctas;
		this.incorrectas = incorrectas;
		this.blancas = blancas;
	}
	
	// MÉTODOS
	public void getCorrectas() {
		System.out.println(this.correctas);
	}
	
	public void setCorrectas(int correctas) {
		this.correctas = correctas;
	}
	
	public void getIncorrectas() {
		System.out.println(this.incorrectas);
	}
	
	public void setIncorrectas(int incorrectas) {
		this.incorrectas = incorrectas;
	}
	
	public void getBlancas() {
		System.out.println(this.blancas);
	}
	
	public void setBlancas(int blancas) {
		this.blancas = blancas;
	}
	
	public void calcularNotaFinal() {
		int puntosTotales = (this.correctas + this.incorrectas + this.blancas)*5;
		int notaFinal = (this.correctas*5)-(this.incorrectas);
		double sobreDiez = (notaFinal/puntosTotales)*10.0;
		
		System.out.printf("Número de respuestas correctas: %d\n"
				+ "Número de respuestas incorrectas: %d\n"
				+ "Número de respuestas en blanco: %d\n"
				+ "Cada respuesta correcta suma 5 puntos, cada incorrecta resta -1 y las blancas valen 0.\n"
				+ "Nota final: %d de %d puntos.\n"
				+ "Nota sobre 10: %.2f", this.correctas, this.incorrectas, this.blancas, notaFinal, puntosTotales, sobreDiez);
	}
}
