package ruletarusa;


import java.util.Random;

public class RevolverDeAgua {

    int posicionActual;

    int posicionDeAgua;
    
    Random random = new Random();
    
    boolean mojar = false;

    public RevolverDeAgua() {
    }
    
    

    public RevolverDeAgua(int posicionActual, int posicionDeAgua) {
        this.posicionActual = posicionActual;
        this.posicionDeAgua = posicionDeAgua;
    }

    public void llenarRevolver() {        
        posicionActual = random.nextInt(10)+1;
        //borrar
        System.out.println("Posicion actual " + posicionActual);
        posicionDeAgua = random.nextInt(10)+1;        
        //borrar
        System.out.println("posicion del agua" + posicionDeAgua);
    }

    public boolean mojar() {
        
        if(posicionActual==posicionDeAgua){
            System.out.println("El jugador perdio la partida! ");
            mojar = true;
        }
        //borrar despues de las pruebas        
        return mojar;
    }

    public void siguienteChorro() {
        
        if(posicionActual<10){
            posicionActual++;
        }else{
            posicionActual=1;
        }
        
        //borrar
        System.out.println("Posicion actual aumento a " + posicionActual);
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionDeAgua=" + posicionDeAgua + '}';
    }

    
}
