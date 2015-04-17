package practicafinal;

import java.io.Serializable;
import java.util.Date;

public abstract class Jugador extends Persona implements Comparable,Serializable{

  private String nombreDeportivo;
                                                //al crear un jugador por defecto no tiene equipo hasta que uno lo fiche (usará el set)
  private Integer colocacion;

  protected Double precio;

  private Integer valoracion;
  
  private Equipo equipo;

    public Jugador(String nombreDeportivo, Integer colocacion, String nombre, String apellidos, Integer fechaNacimiento, Double peso, Double altura) {
        super(nombre, apellidos, fechaNacimiento, peso, altura);
        this.nombreDeportivo = nombreDeportivo;
        this.colocacion = colocacion;
        
    }
    
    public Jugador(){
        this.colocacion=0;
    }

    public String getNombreDeportivo() {
        return nombreDeportivo;
    }

    public void setNombreDeportivo(String nombreDeportivo) {
        this.nombreDeportivo = nombreDeportivo;
    }

    public Integer getColocacion() {
        return colocacion;
    }

    public void setColocacion(Integer colocacion) {
        this.colocacion = colocacion;
        this.actualizar();
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio() {
        this.precio=this.calcularPrecio();
    }
    
    public Integer getValoracion() {
        return valoracion;}
    
     public void setValoracion() {
        this.valoracion = this.calcularValoracion();
    }
     
    public Equipo getEquipo(){
        return this.equipo;
    }
    
    public void setEquipo(Equipo e){
        this.equipo=e;
    }

//-----------------

  public abstract int calcularValoracion();
  
  public Double calcularPrecio() {
       double aux=(double) 10*this.getValoracion();
        return(aux);
  }
  
  public boolean esDeCampo(){
      return this.getClass().equals(new JugadorCampo().getClass());
      }
  
  @Override
  public int compareTo(Object o){
      Jugador aux=(Jugador) o;
      int a=this.getValoracion();
      int b=aux.getValoracion();
      if (a<b){
          return 1;}
      else if(a>b){
          return -1;}
      else{
          return 0;}
      }
  
   public void actualizar(){
      this.setValoracion();
      this.setPrecio();
  }
   
  @Override //Importante override
  public boolean equals(Object o){
      Jugador a=(Jugador) o;
      return(this.getNombreDeportivo().equals(a.getNombreDeportivo()));
  }
  
  public Object[] toArray(){
      Object[] aux = {this.getNombreDeportivo(), this.getValoracion(), this.getPrecio()};
      return(aux);
  }
  }
