package Estructurales.Bridge;

public interface Dispositivo {

    public boolean estaEncendido();

    public void encender();

    public void apagar();

    public int verVolumen();

    public void subirVolumen(int cifra);

    public void ponerCanal(int canal);


}
