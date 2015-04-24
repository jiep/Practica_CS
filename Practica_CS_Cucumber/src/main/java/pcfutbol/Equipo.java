package pcfutbol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Equipo implements Comparable,Serializable{

  private String nombre;

  private String domicilio;

  private int año;

  private String himno;

  private String bandera;

  private double dinero;

  public Mercado mercado;
  
  private ArrayList<Directivo> directivos;

  private ArrayList<Portero>  porteros;

  private ArrayList<JugadorCampo>  jugCampo;

    public Equipo(String nombre, String domicilio, int año, String himno, String bandera, double dinero, Mercado mercado, ArrayList<Directivo> directivos, ArrayList<Portero> porteros, ArrayList<JugadorCampo> jugadoresCampo){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.año = año;
        this.himno = himno;
        this.bandera = bandera;
        this.dinero = dinero;
        this.mercado = mercado;
        this.directivos = directivos;
        setPorteros(porteros);
        setJugCampo(jugadoresCampo);
    }
    public Equipo (String nombre, String domicilio,int año,String himno,String bandera,double dinero,Mercado mercado){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.año = año;
        this.himno = himno;
        this.bandera = bandera;
        this.dinero = dinero;
        this.mercado = mercado;
        directivos = new ArrayList<Directivo>();
        porteros = new ArrayList<Portero>();
        jugCampo = new ArrayList<JugadorCampo>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getAño() {
        return año;
    }

    public String getHimno() {
        return himno;
    }

    public String getBandera() {
        return bandera;
    }

    public double getDinero() {
        return dinero;
    }

    public Mercado getMercado() {
        return mercado;
    }

    public ArrayList<Directivo> getDirectivos() {
        return directivos;
    }

    public ArrayList<Portero> getPorteros() {
        return porteros;
    }

    public ArrayList<JugadorCampo> getJugCampo() {
        return jugCampo;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setHimno(String himno) {
        this.himno = himno;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }

    public void setDirectivos(ArrayList<Directivo> directivos) {
        this.directivos = directivos;
    }

    public void setPorteros(ArrayList<Portero> porteros){

            this.porteros = porteros;

    }

    public void setJugCampo(ArrayList<JugadorCampo> jugCampo){
        this.jugCampo = jugCampo;
    }
          
//---------------------------------------

  public void descartar(Jugador jugador){
      if (pertenecePorteros(jugador)){
          porteros.remove(jugador);
          mercado.agregarJugador(jugador);
      }
      else if (perteneceCampo(jugador)){
          jugCampo.remove(jugador);
          mercado.agregarJugador(jugador);
      }
  }

  public void fichar(Jugador jug) {
      if (this.mercado.pertenece(jug)){
          this.mercado.eliminarJugador(jug);
          if (jug.esDeCampo()){
              JugadorCampo jugc=(JugadorCampo) jug;
              jugCampo.add(jugc);
              
          }
          else{
               Portero jugc=(Portero) jug;
               porteros.add(jugc);
          }
          jug.setEquipo(this);
      }
  }

  public void fichar(Jugador jug,Equipo eq) throws ErrorNumero {
        if (this.dinero>=jug.getPrecio()){
            this.setDinero(dinero-jug.getPrecio());
            eq.setDinero(eq.dinero+jug.getPrecio());
            if (eq.perteneceCampo(jug)){
                eq.descartar(jug);
                JugadorCampo jugc=(JugadorCampo) jug;
                jugCampo.add(jugc);
            }
            else if (eq.pertenecePorteros(jug)){
                 eq.descartar(jug);
                 Portero jugc=(Portero) jug;
                 porteros.add(jugc);}
            jug.setEquipo(this);
        } else {
            throw new ErrorNumero("No hay suficiente dinero");
        }
  }

  public void fichar(Jugador fichaje,Equipo eq,Jugador[] cambio) throws ErrorNumero {
      int val=0;
      for (Jugador j:cambio){
          val=val+j.getValoracion();
      }     
      if ((Math.abs(fichaje.getValoracion()-val)/100)<=10){
          eq.descartar(fichaje);
          for (Jugador j:cambio){
              descartar(j);
              eq.fichar(j);
          }
          fichar(fichaje);
          
      } else {
          throw new ErrorNumero ("El intercambio es injusto");
      }
  }
  
 private boolean perteneceCampo(Jugador jug){
     return(this.jugCampo.contains(jug));
 }
 
 private boolean pertenecePorteros(Jugador jug){
     return(this.porteros.contains(jug));
 }
 
 public boolean esLegal(){
     int a,b;
     a = porteros.size();
     b = jugCampo.size();
     if (((a+b)>15)||(a<1)||(b<10)){
        return false;
     } else {
         return true;
     }
 }
 
 public int valLos10Mejores(){
     int aux=0;
     int i=0;
     Collections.sort(this.jugCampo);
     for(JugadorCampo j:this.jugCampo){
         if (i<10){
                 aux=aux+j.getValoracion();
                 i=i+1;
     }
     }
     return aux;
}
 
 public int valMejPortero(){
     int aux=0;
     int i=0;
     Collections.sort(this.porteros);
     for(Portero j:this.porteros){
         if (i<10){
                 aux=aux+j.getValoracion();
                 i=i+1;
     }
     }
     return aux;
 }

    
    public int compareTo(Object o) {
        Equipo e=(Equipo) o;
        return(this.getNombre().compareTo(e.getNombre()));
    }
    
  @Override
    public String toString(){
      return (this.getNombre()+" - "+this.getDinero()+"€");
        
    }
    
  @Override
    public boolean equals(Object o){
        Equipo e=(Equipo) o;
        return(this.getNombre().equals(e.getNombre()));
    }
}