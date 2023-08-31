package barajasespanolas.services;

import barajasespanolas.entities.Carta;
import barajasespanolas.enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartaService {

    ArrayList<Carta> baraja = new ArrayList();
    ArrayList<Carta> sacadas = new ArrayList();



    /*
    Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
    y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
    contener un método toString() que retorne el número de carta y el palo. La baraja estará
    compuesta por un conjunto de cartas, 40 exactamente.
     */
    public void crearBaraja() {

        //crearemos una bajraja que tenga una carta de cada palo menos 8 y 9
        for (int i = 1; i < 13; i++) {

            for (Palo palo : Palo.values()) {
                if (i != 8 && i != 9) {
                    Carta carta = new Carta(palo, i);
                    baraja.add(carta);
                }
            }
        }
    }

    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {

        // uso class collections metodo shuffle(List<?> list)
        Collections.shuffle(baraja);
    }

    /*
    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
       se haya llegado al final, se indica al usuario que no hay más cartas.
     */
    public void siguienteCarta() {

        Carta sacada;
        if (baraja.isEmpty()) {
            System.out.println("La baraja ya esta vacia");
        } else {
            //traigo la carta que esta en la primer posicion de la baraja
            sacada = baraja.get(0);
            //la muestro
            System.out.println("La carta sacada es: " + sacada);
            //agrego la carta  la lista de descartadas
            sacadas.add(sacada);
            //la elimino de la baraja
            baraja.remove(sacada);
        }

    }

    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("La cartas disponibles en la baraja son: " + baraja.size());
    }

    /*
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
     */
    Scanner leer = new Scanner(System.in);

    public void darCartas() {
        System.out.println("Ingresa la cantidad de cartas a descartar");
        int cantidad = leer.nextInt();

        if (cantidad > baraja.size()) {
            System.out.println("No hay cartas suficientes en la baraja");
        } else {
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta();
            }
        }

    }

    /*
    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
     */
    public void cartasMonton() {
        //mostramos el mazo de las cartas sacadas
        if (sacadas.isEmpty()) {
            System.out.println("No hay cartas sacadas del mazo aun ");
        } else {
            sacadas.forEach((sacada) -> {
                System.out.println(sacada);
            });
        }

    }

    /*
    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.era carta.
     */
    public void mostrarBaraja() {
        //mostramos el mazo de baraja
        if (baraja.isEmpty()) {
            System.out.println("La baraja ya esta vacia");
        } else {
            baraja.forEach((carta) -> {
                System.out.println(carta);
            });
        }
    }

}
