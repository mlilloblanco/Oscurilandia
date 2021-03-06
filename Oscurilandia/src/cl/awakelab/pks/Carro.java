package cl.awakelab.pks;

import cl.awakelab.funciones.RandomPksQls;

public abstract class Carro {

	// Estos son los atributos de la clase padre
	private int cantidadOcupantes;
	private String fechaIngreso;
	private int ubicacionFila;
	private int ubicacionColumna;
	RandomPksQls rnd = new RandomPksQls();

	// Contructores
	public Carro() {
		this.cantidadOcupantes = (int) (Math.random() * 20 + 1);
		this.fechaIngreso = rnd.getAno();
		this.ubicacionFila = (int) Math.floor(Math.random() * 15);
		this.ubicacionColumna = (int) Math.floor(Math.random() * 15);
	}

	public Carro(int cantidadOcupantes, String fechaIngreso) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionFila = (int) Math.floor(Math.random() * 15);
		this.ubicacionColumna = (int) Math.floor(Math.random() * 15);

	}

	// Getters and Setters
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getUbicacionFila() {
		return ubicacionFila;
	}

	public void setUbicacionFila(int ubicacionFila) {
		this.ubicacionFila = ubicacionFila;
	}

	public int getUbicacionColumna() {
		return ubicacionColumna;
	}

	public void setUbicacionColumna(int ubicacionColumna) {
		this.ubicacionColumna = ubicacionColumna;
	}

	// toString

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes: " + cantidadOcupantes + ", fechaIngreso: " + fechaIngreso
				+ ", ubicacionFila: " + ubicacionFila + ", ubicacionColumna: " + ubicacionColumna + "]";
	}

	// Métodos

	public void desplegarDatos() {

	}

}
