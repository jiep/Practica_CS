package practicafinal;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Partido implements Serializable{
    private Equipo local;
    private Equipo visitante;
    private GregorianCalendar horario;
    private String resultado;
    private Estadio estadio;
    
// Constructor Getter Setter

    public Partido(Equipo local, Equipo visitante, GregorianCalendar horario) {
        this.local = local;
        this.visitante = visitante;
        this.horario = horario;
        this.resultado = "No jugado";
        this.estadio = new Estadio(0,0,"Desconocido");
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public GregorianCalendar getHorario() {
        return horario;
    }

    public String getResultado() {
        return resultado;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public void setHorario(GregorianCalendar horario) {
        this.horario = horario;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
// Métodos privados
    
    private String golesEquipo(Equipo local,Equipo visitante){
        int goleslocal = 0;
        int golesvisit = 0;
        int i=1;
        while ((goleslocal==golesvisit)&&i<=10){
            goleslocal=(int) Math.floor(local.valLos10Mejores()/100)+1;
            golesvisit=(int) Math.floor(visitante.valLos10Mejores()/100);
            if (Math.random() < 0.5){
                            golesvisit=golesvisit+1;
                        }else {
                            goleslocal=goleslocal+1;
                        }
            int paradoslocal = (int) Math.floor(local.valMejPortero()/10);
            int paradosvisit=(int) Math.floor(visitante.valMejPortero()/10);
            goleslocal= ((goleslocal-paradosvisit)>0)?goleslocal-paradosvisit:0;
            golesvisit = ((golesvisit-paradoslocal)>0)?golesvisit-paradoslocal:0;
            i++;
        }
        if (i==11){
            goleslocal=0;
            golesvisit=1;
        }
        return goleslocal+" - "+golesvisit;
    }
    
// Métodos públicos
    
    public void jugar(){
        if (getResultado().matches("No jugado")){
            if ((local.esLegal())&&(visitante.esLegal())){
                setResultado(golesEquipo(local,visitante));
            }else if (!local.esLegal()){
                this.setResultado("1 - 0");
            }else if (!visitante.esLegal()){
                this.setResultado("0 - 1");
            }
    }
    }

   public Equipo getGanador() {
       if (!getResultado().matches("No jugado")){
           String[] a=resultado.split(" - ");
           int g=Integer.parseInt(a[0]);
           int p=Integer.parseInt(a[1]);
           return (g>p)?getLocal():getVisitante();
    }
       else return null;
   }
}
