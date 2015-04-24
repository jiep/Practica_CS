package pcfutbol;

import java.io.Serializable;
import java.util.ArrayList;

public class Mercado implements Serializable {

public static ArrayList<Jugador> jugadores;

public Mercado(){
    jugadores = new ArrayList<Jugador>();
}

public  ArrayList<Jugador> guardarMercado(){
    ArrayList<Jugador> lista = new ArrayList<Jugador>(jugadores);
    return lista;
}
public  void cargarMercado(ArrayList<Jugador> mercado){
    jugadores = mercado;
}
public boolean agregarJugador(Jugador jugador){
    if(!jugadores.contains(jugador)){
        jugadores.add(jugador);
        return true;
    }
    else{
        return false;
    }
}
public  void eliminarJugador(Jugador jugador){
    jugadores.remove(jugador);
}

public  boolean pertenece(Jugador jug){
    return(jugadores.contains(jug));
}
    
}
