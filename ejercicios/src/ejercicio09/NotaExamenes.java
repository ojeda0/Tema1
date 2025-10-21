package ejercicio09;

public class NotaExamenes {
	
	// ATRIBUTOS
	private double nota1;
	private double mediaDeseada;
	
	// CONSTRUCTOR
	public NotaExamenes(double nota1, double mediaDeseada) {
		this.nota1 = nota1;
		this.mediaDeseada = mediaDeseada;
	}
	
	// MÉTODOS
	public void getNota1() {
		System.out.println(this.nota1);
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void getMediaDeseada() {
		System.out.println(this.mediaDeseada);
	}
	
	public void setMediaDeseada(double mediaDeseada) {
		this.mediaDeseada = mediaDeseada;
	}
	
	public void calcularNotaNecesaria() {
		double notaNecesaria = (mediaDeseada-(nota1*0.4))/0.6;
		
		System.out.printf("La primera nota del examen ha sido un %.2f y esta vale un 40 %%.\n"
				+ "Tu media deseada es un %.2f\n"
				+ "La nota que debes sacar en el siguiente examen para llegar a la media es %.2f y esta vale un 60 %%.\n", this.nota1, this.mediaDeseada, notaNecesaria);
	}
}