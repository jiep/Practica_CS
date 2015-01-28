package practicafinal;

import java.io.Serializable;

public class Portero extends Jugador implements Serializable{

  private Integer salidas;

  private Integer manoAmano;

  private Integer reflejos;

  private Integer penaltis;

    public Portero(Integer salidas, Integer manoAmano, Integer reflejos, Integer penaltis, String nombreDeportivo, Integer colocacion, String nombre, String apellidos, Integer fechaNacimiento, Double peso, Double altura) {
        super(nombreDeportivo, colocacion, nombre, apellidos, fechaNacimiento, peso, altura);
        this.salidas = salidas;
        this.manoAmano = manoAmano;
        this.reflejos = reflejos;
        this.penaltis = penaltis;
        this.setValoracion();
        this.setPrecio();
    }
    
    public Portero(){ // portero base añadido
        this.salidas = 0;
        this.manoAmano = 0;
        this.reflejos = 0;
        this.penaltis = 0;
    }
  
    public Integer getSalidas() {
        return salidas;
    }

    public void setSalidas(Integer salidas) {
        this.salidas = salidas;
        this.actualizar();
    }

    public Integer getManoAmano() {
        return manoAmano;
    }

    public void setManoAmano(Integer manoAmano) {
        this.manoAmano = manoAmano;
        this.actualizar();
    }

    public Integer getReflejos() {
        return reflejos;
    }

    public void setReflejos(Integer reflejos) {
        this.reflejos = reflejos;
        this.actualizar();
    }

    public Integer getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(Integer penaltis) {
        this.penaltis = penaltis;
        this.actualizar();
    }
  
  @Override
  public int calcularValoracion(){
      return(salidas+reflejos+penaltis+manoAmano+super.getColocacion());
  }
  
}

