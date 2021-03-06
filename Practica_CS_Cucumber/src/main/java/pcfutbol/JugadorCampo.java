package pcfutbol;

import java.io.Serializable;

public class JugadorCampo extends Jugador implements Serializable { //esta clase contiene todos los datos de cada jugador

  private int velocidad;
  
  private int potencia;

  private int regate;

  private int tiro;

  public JugadorCampo(Integer velocidad, Integer potencia, Integer regate, Integer tiro, String nombreDeportivo, Integer colocacion, String nombre, String apellidos, Integer fechaNacimiento, Double peso, Double altura) {
        super(nombreDeportivo, colocacion,nombre, apellidos, fechaNacimiento, peso, altura);
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.regate = regate;
        this.tiro = tiro;
        this.setValoracion();
        this.setPrecio();
    }
  
  public JugadorCampo(){
  }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
        this.actualizar();
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
        this.actualizar();
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
        this.actualizar();
    }
	
    public int getTiro() {
        return tiro;
    }

    public void setTiro(int tiro) {
        this.tiro = tiro;
        this.actualizar();
    }

  @Override
  public int calcularValoracion(){
      int num=velocidad+potencia+regate+tiro;
      return(num+this.getColocacion());
  }  
  
  public String toString(){
	  return this.toString();
  }

}
