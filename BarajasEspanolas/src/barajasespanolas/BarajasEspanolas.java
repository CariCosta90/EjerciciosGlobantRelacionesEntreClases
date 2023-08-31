package barajasespanolas;

import barajasespanolas.services.CartaService;
import java.util.Scanner;

/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.era carta.
*/


public class BarajasEspanolas {

    public static void main(String[] args) {
        
        CartaService cartas = new CartaService();
        Scanner leer = new Scanner(System.in);
        
        cartas.crearBaraja();
        
        int menu = 0;
        
        do {
            
            System.out.println("--------------Menu------------");
            System.out.println("1. barajar");
            System.out.println("2. siguiente Carta");
            System.out.println("3. cartas Disponibles");
            System.out.println("4.dar Cartas");
            System.out.println("5.cartas Monton");
            System.out.println("6.mostrar Baraja");
            System.out.println("7.Salir");
            
            menu = leer.nextInt();
            
            switch (menu) {
                case 1:
                    cartas.barajar();
                    break;
                case 2:
                    cartas.siguienteCarta();
                    break;
                case 3:
                    cartas.cartasDisponibles();
                    break;
                case 4:
                    cartas.darCartas();
                    break;
                case 5:
                    cartas.cartasMonton();
                    break;
                case 6:
                    cartas.mostrarBaraja();
                    break;                    
            }
            
        } while (menu!=7);
        
        
        
        
       
    }

}
