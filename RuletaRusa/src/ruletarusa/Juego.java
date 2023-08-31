package ruletarusa;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    ArrayList<Jugador> jugadores = new ArrayList();

    RevolverDeAgua r = new RevolverDeAgua();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    int cantidad;

    public void llenarJuego() {
        //borrar

        System.out.println("aca se crea el revolver");
        
        r.llenarRevolver();
        System.out.println("Este esta en juego");
        System.out.println(r.posicionActual);

        //borrar
        System.out.println("Aca se crea la lista de jugadores");

        //primero preguntamos cuandos jugadores seran en la partida
        System.out.println("Ingresa la cantidad de jugadores de la partida");
        cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {

            String nombre = "Jugador" + i;

            Jugador j = new Jugador(i, nombre, false);

            jugadores.add(j);
       }

        //mostramos lista de Jugadores
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }

    }

    public void ronda() {

        System.out.println("en que esta mojar en este momento???" + r.mojar);
        while(!r.mojar){
            for (Jugador j : jugadores) {
                System.out.println("Le toca al jugador " + j.nombre);
                j.disparo(r);
                if(j.mojado){
                    break;
                }
            }
        }


    }
}
