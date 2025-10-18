package ejercicio15;

public class TiempoSimple {
	
	// ATRIBUTOS
	private int minutos;
	
	// CONSTRUCTOR
	public TiempoSimple(int minutos) {
		this.minutos = minutos;
	}
	
	// MÉTODOS
	public void getMinutos() {
		System.out.println(this.minutos);
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void mostrarHorasMinutos() {
		int horas = this.minutos / 60;
		int minutosSolos = this.minutos % 60;
		
		System.out.printf("Los minutos totales introducidos son de: %d minutos.\n"
				+ "Esto equivale a %d horas y %d minutos.\n", this.minutos, horas, minutosSolos);
	}
}