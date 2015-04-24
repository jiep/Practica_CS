package pcfutbol;

import java.util.ArrayList;

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
    private ArrayList<Directivo> personal;

    public Estadio(){
        this.capacidad = 0;
        this.estrellas_UEFA = 0;
        this.nombre = "";
        this.ciudad = "";
        this.personal = new ArrayList();
    }

    public Estadio(int capacidad, int estrellas_UEFA, String nombre){
        this.capacidad = capacidad;
        this.estrellas_UEFA = estrellas_UEFA;
        this.nombre = nombre;
        this.ciudad = "";
        this.personal = new ArrayList();
    }

    public Estadio(int capacidad, int estrellas_UEFA, String nombre, String ciudad){
        this.capacidad = capacidad;
        this.estrellas_UEFA = estrellas_UEFA;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.personal = new ArrayList();
    }
    
    public ArrayList<Directivo> getPersonal(){
        return this.personal;
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
    
    public void addPersonal (Directivo directivo){
        this.personal.add(directivo);
    }

    @Override
    public String toString(){
        String serie = "";
        serie = serie + this.nombre + " " + this.capacidad + " personas " + 
                this.estrellas_UEFA + " estrellas";
        for(Directivo e:personal){
            serie = serie + " " + e.toString();
        }
        return serie;
    }
}