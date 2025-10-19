package ejercicio17;

public class ViajeCiclista {

	// ATRIBUTOS
	private int horaSalida;
	private int minutoSalida;
	private int segundoSalida;
	private int tiempoTotalSegundos;
	
	// CONSTRUCTOR
	public ViajeCiclista(int horaSalida, int minutoSalida, int segundoSalida, int tiempoTotalSegundos) {
		this.horaSalida = horaSalida;
		this.minutoSalida = minutoSalida;
		this.segundoSalida = segundoSalida;
		this.tiempoTotalSegundos = tiempoTotalSegundos;
	}
	
	// MÉTODOS
	public void getHoraSalida() {
		System.out.println(this.horaSalida);
	}
	
	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public void getMinutoSalida() {
		System.out.println(this.minutoSalida);
	}
	
	public void setMinutoSalida(int minutoSalida) {
		this.minutoSalida = minutoSalida;
	}
	
	public void getSegundoSalida() {
		System.out.println(this.segundoSalida);
	}
	
	public void setSegundoSalida(int segundoSalida) {
		this.segundoSalida = segundoSalida;
	}
	
	public void getTiempoTotalSegundos() {
		System.out.println(this.tiempoTotalSegundos);
	}
	
	public void setTiempoTotalSegundos(int tiempoTotalSegundos) {
		this.tiempoTotalSegundos = tiempoTotalSegundos;
	}
	
	public void mostrarHoraLlegada() {
		int horaSalidaSegundos = (this.horaSalida * 3600) + (this.minutoSalida * 60) + this.segundoSalida;
		int horaLlegadaSegundos = horaSalidaSegundos + this.tiempoTotalSegundos;
		
		int horaLlegada = (horaLlegadaSegundos / 3600) % 24;
		int minutoLlegada = (horaLlegadaSegundos % 3600) / 60;
		int segundoLlegada = horaLlegadaSegundos % 60;
		
		System.out.printf("La hora de salida introducida es %d:%d:%d y el tiempo total tardado introducido es de %d segundos.\n"
				+ "Hora de llegada estimada: %d:%d:%d\n", this.horaSalida, this.minutoSalida, this.segundoSalida, this.tiempoTotalSegundos, horaLlegada, minutoLlegada, segundoLlegada);
	}
}