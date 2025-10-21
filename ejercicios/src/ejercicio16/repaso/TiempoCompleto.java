package ejercicio16.repaso;

public class TiempoCompleto {
	
	// ATRIBUTOS
	private int segundos;
	
	// CONSTRUCTOR
	public TiempoCompleto(int segundos) {
		this.segundos = segundos;
	}
	
	// MÉTODOS
	public void getSegundos() {
		System.out.println(this.segundos);
	}
	
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void mostrarHorasMinutosSegundos() {
		int horas = this.segundos / 3600;
		int minutos = (this.segundos / 60) % 60;
		int segundos = this.segundos % 60;
		
		System.out.printf("Tenemos un total de %d horas, %d minutos y %d segundos.\n", horas, minutos, segundos);
	}
}