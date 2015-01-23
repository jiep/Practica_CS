package practicafinal;

public class Estadio {

    /**
    * Amplia la funcionalidad de 
    * la versión anterior con
    * los estadios.
    */

    private int capacidad;
    private int estrellas_UEFA;
    private String ciudad;
    private String nombre;

    public Estadio(){
        this.capacidad = 0;
        this.estrellas_UEFA = 0;
        this.nombre = "";
        this.ciudad = "";
    }

    public Estadio(int capacidad, int estrellas_UEFA, String nombre){
        this.capacidad = capacidad;
        this.estrellas_UEFA = estrellas_UEFA;
        this.nombre = nombre;
        this.ciudad = "";
    }

    public Estadio(int capacidad, int estrellas_UEFA, String nombre, String ciudad){
        this.capacidad = capacidad;
        this.estrellas_UEFA = estrellas_UEFA;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public int getEstrellas_UEFA(){
        return this.estrellas_UEFA;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public int getCapacidad(){
        return this.capacidad;
    }	
}