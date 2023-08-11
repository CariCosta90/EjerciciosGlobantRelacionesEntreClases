package ruletarusaagua.services;

import java.util.Random;
import ruletarusaagua.entities.RevolverDeAgua;

public class RevolverDeAguaService {

    RevolverDeAgua revolver = new RevolverDeAgua();

    public void llenarRevolver() {
        Random random = new Random();
        revolver.setPosicionAgua(random.nextInt(10) + 1);
        System.out.println(revolver.getPosicionAgua());
        revolver.setPosiocionAcutal(random.nextInt(10) + 1);
        System.out.println(revolver.getPosiocionAcutal());
    }

    public boolean mojar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void siguienteChorro() {
    }
}
