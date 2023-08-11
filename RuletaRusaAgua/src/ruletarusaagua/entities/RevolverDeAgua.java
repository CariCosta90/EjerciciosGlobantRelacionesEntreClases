package ruletarusaagua.entities;

public class RevolverDeAgua {

    private int posiocionAcutal;

    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posiocionAcutal, int posicionAgua) {
        this.posiocionAcutal = posiocionAcutal;
        this.posicionAgua = posicionAgua;
    }

    public int getPosiocionAcutal() {
        return posiocionAcutal;
    }

    public void setPosiocionAcutal(int posiocionAcutal) {
        this.posiocionAcutal = posiocionAcutal;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posiocionAcutal=" + posiocionAcutal + ", posicionAgua=" + posicionAgua + '}';
    }
}
