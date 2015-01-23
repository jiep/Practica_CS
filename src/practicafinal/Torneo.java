package practicafinal;

import java.io.Serializable;
import java.util.ArrayList;


public class Torneo implements Serializable{
  
  public String nombre;
  private String tipoTorneo;

  private Equipo campeon;

  private Calendario calendario;

  private ArrayList<Equipo> equipos;
  
    public Torneo(String nomb){
      calendario = null;
      equipos = new ArrayList<>();
      campeon = null;
      tipoTorneo = "copa";
      this.nombre = nomb;
  }
    
//----------------------

    public String getTipoTorneo() {
        return tipoTorneo;
    }
    public String getNombre() {
        return nombre;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public Equipo getCampeon() {
        return campeon;
    }
    public void setTipoTorneo(String tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }

    public void setCampeon(Equipo campeon) {
        this.campeon = campeon;
    }

    public void setCalendario() throws ErrorNumero {
        this.calendario = new Calendario();
        calendario.generarCalendarioCopa(equipos);
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    
  @Override
    public boolean equals(Object o){
      try{
        Torneo e=(Torneo) o;
         return(this.getNombre().equals(e.getNombre()));
      }catch(ClassCastException e) {
         return false; 
      }
    }
//----------------------------------------
    
  
  public void addEquipo (Equipo equipo) throws ErrorNumero{
      if (equipo.esLegal()){
          equipos.add(equipo);
      }else{
          throw new ErrorNumero ("El equipo no cumple las reglas sobre el numero de jugadores");
      }
  }
  
  public void disputar() throws ErrorNumero {
      if(calendario.getCalendario()==null){
          throw new ErrorNumero("Debes generar el calendario");
      } else if((calendario.getCalendario()[0].length*2)==getEquipos().size()){
        int i=0;
        while(!calendario.finalizado()) {
            calendario.resolverRonda(i);
            i++;
        }
        calendario.resolverRonda(i);
        setCampeon();
      }else{
          throw new ErrorNumero("El calendario está desfasado");
      }
  }
  
  public void setCampeon(){
      campeon = calendario.getGanador();
  }

}