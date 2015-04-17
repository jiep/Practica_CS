package practicafinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Calendario implements Serializable {
    
    private Partido[][] calendario;

public Calendario(){
    calendario= null;
}
    public Partido[][] getCalendario() {        //rondas en la i
        return calendario;
    }
    
    //PENE
    
//------------------------------------    

public void agregarPartidoCopa(Equipo equipo1, Equipo equipo2, int ronda) {
      int i = 0;
      while((i<calendario[0].length-1)&&(calendario[ronda][i]!=null)){
          i++;
      }
      calendario[ronda][i] = new Partido(equipo1,equipo2,horario(ronda));
    }
  
  public GregorianCalendar horario(int ronda){
      GregorianCalendar aux = new GregorianCalendar();
      aux.set(0, 0, 0, 20, 30);                                                 //Los partidos siempre son a las 20.30
      aux.setWeekDate(2014, 6+ronda, ((ronda/2)==Math.round(ronda/2))?6:5);     //Si es ronda par, Sábado, si es impar Domingo
      return aux;
  }
    
  public void generarCalendarioLiga(Equipo[] equipos) {
      throw new UnsupportedOperationException("No implementado");
  }

  public void generarCalendarioCopa(ArrayList<Equipo> eq)throws ErrorNumero{       //GENERA LOS PARTIDOS DE LA PRIMERA RONDA
      if (((Math.log(eq.size())/Math.log(2))!=(Math.round(Math.log(eq.size())/Math.log(2))))||(eq.isEmpty())){
          throw new ErrorNumero("Número incorrecto de equipos");
      } else {
          ArrayList<Equipo> equipos=new ArrayList<Equipo>();
          equipos.addAll(eq);
          this.calendario= new Partido[(int)(Math.log(equipos.size())/Math.log(2))][equipos.size()/2];
          for (int i = 0; i<(eq.size()/2); i++){
              Equipo equipo1, equipo2;
              equipo1= equipos.get((int) (Math.round(Math.random())*(equipos.size()-1)));
              equipos.remove(equipo1);                  //calendario ya lo ha asignado, se elimina de la lista de pendientes
              if (equipos.size()!=1){
              equipo2= equipos.get((int) (Math.round(Math.random())*(equipos.size()-1)));}
              else{
                  equipo2=equipos.get(0);
              }
              equipos.remove(equipo2);
              agregarPartidoCopa(equipo1,equipo2, 0);
           }
      }
  }

    public void resolverRonda(int ronda) {
        if (finalizado()){
            calendario[ronda][0].jugar();
        }
        else{
            int i = 0;
            while ((i<calendario[0].length-1)&&(calendario[ronda][i]!=null)){
                calendario[ronda][i].jugar();
                calendario[ronda][i+1].jugar();
                agregarPartidoCopa(calendario[ronda][i].getGanador(),calendario[ronda][i+1].getGanador(),ronda+1);
                i=i+2;
            }
        }
    }
    
    public boolean finalizado(){
        try{
        return(calendario[calendario.length-1][0]!=null);
        }catch(NullPointerException e){
            return false;
        }
    }
    
    public Equipo getGanador(){
        return(calendario[calendario.length-1][0].getGanador());
    }

}