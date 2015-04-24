package pcfutbol;

import java.io.Serializable;

public class Directivo extends Persona implements Serializable{

  private String cargo;

// Constructor Getter Setter
    public Directivo(String nombre,String apellidos,Integer fechaNacimiento,String cargo) {
        super(nombre,apellidos,fechaNacimiento,0.0,0.0);
        this.cargo = cargo;
    }
    public Directivo(String nombre,String apellidos) {
        super(nombre,apellidos,0,0.0,0.0);
        this.cargo = null;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
  public boolean equals(Object o){
      Directivo a=(Directivo) o;
      return((this.getNombre().equals(a.getNombre()))&&(this.getApellidos().equals(a.getApellidos())));
  }

    
  
}