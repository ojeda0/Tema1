package ejercicio07;

public class NotaAlgoritmos {
	
	// ATRIBUTOS
	private double parcial1;
	private double parcial2;
	private double parcial3;
	private double examenFinal;
	private double trabajoFinal;
	
	// CONSTRUCTOR
	public NotaAlgoritmos(double parcial1, double parcial2, double parcial3, double examenFinal, double trabajoFinal) {
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.parcial3 = parcial3;
		this.examenFinal = examenFinal;
		this.trabajoFinal = trabajoFinal;
	}
	
	// MÉTODOS
	public void getParcial1() {
		System.out.println(this.parcial1);
	}
	
	public void setParcial1(double parcial1) {
		this.parcial1 = parcial1;
	}
	
	public void getParcial2() {
		System.out.println(this.parcial2);
	}
	
	public void setParcial2(double parcial2){
		this.parcial2 = parcial2;
	}
	
	public void getParcial3() {
		System.out.println(this.parcial3);
	}
	
	public void setParcial3(double parcial3) {
		this.parcial3 = parcial3;
	}
	
	public void getExamenFinal() {
		System.out.println(this.examenFinal);
	}
	
	public void setExamenFinal(double examenFinal) {
		this.examenFinal = examenFinal;
	}
	
	public void getTrabajoFinal() {
		System.out.println(this.trabajoFinal);
	}
	
	public void setTrabajoFinal(double trabajoFinal) {
		this.trabajoFinal = trabajoFinal;
	}
	
	public void calcularNotaFinal() {
		double porcentaje1 = (((this.parcial1+this.parcial2+this.parcial3))/3)*0.55;
		double porcentaje2 = this.examenFinal*0.3;
		double porcentaje3 = this.trabajoFinal*0.15;
		double notaFinal = porcentaje1+porcentaje2+porcentaje3;
		
		System.out.printf("El 55%% del promedio de sus tres calificaciones parciales es: %.2f\n"
				+ "El 30%% de la calificación del examen final es: %.2f\n"
				+ "El 15%% de la calificación del trabajo final es: %.2f\n"
				+ "Nota final: %.2f\n", porcentaje1, porcentaje2, porcentaje3, notaFinal);
	}
}