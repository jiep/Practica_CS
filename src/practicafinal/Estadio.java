package practicafinal;

public class Estadio {
	/**
	* Amplia la funcionalidad de 
	* la versi�n anterior con
	* los estadios.
	*/
	
	private int capacidad;
	private int estrellas_UEFA;
	private String nombre;
	
	public Estadio(){
		this.capacidad = 0;
		this.estrellas_UEFA = 0;
		this.nombre = "";
	}
	
	public Estadio(int capacidad, int estrellas_UEFA, String nombre){
		this.capacidad = capacidad;
		this.estrellas_UEFA = estrellas_UEFA;
		this.nombre = nombre;
	}
	
	public int getEstrellas_UEFA(){
		return this.estrellas_UEFA;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getCapacidad(){
		return this.capacidad;
	}	
}