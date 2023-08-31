package ruletarusa;

import java.util.ArrayList;


public class RuletaRusa {

    public static void main(String[] args) {
        
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego partida = new Juego();
        
        partida.llenarJuego();
        partida.ronda();
        
        

    }

}
