package ejercicio16;

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
		int minutos = (this.segundos % 3600) / 60;
		int segundosSolos = this.segundos % 60;
		
		System.out.printf("La cantidad de segundos total introducida es de: %d segundos.\n"
				+ "Esto se traduce a:\n"
				+ "%d horas.\n"
				+ "%d minutos.\n"
				+ "%d segundos.\n", this.segundos, horas, minutos, segundosSolos);
	}
}