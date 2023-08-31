package ruletarusa;


public class Jugador {

    int id;

    String nombre;

    boolean mojado;


    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    public boolean disparo(RevolverDeAgua r) {
        
        System.out.println("DISPARO!!!!");

        boolean mojar = r.mojar();

        System.out.println("Se mojo el jugador?");
        System.out.println(mojar);

        if (!mojar) {
            r.siguienteChorro();
            System.out.println("Como el jugador no se mojo, se pasa la poscion al siguente lugar");
            mojado = false;
            return false;
        }else{
            mojado = true;
            return true;
        }                

    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
