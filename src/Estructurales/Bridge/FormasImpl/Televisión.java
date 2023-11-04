package Estructurales.Bridge.FormasImpl;

import Estructurales.Bridge.Dispositivo;

public class Televisión implements Dispositivo {

    private boolean encendido;

    private int volumen;

    private int canal;


    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public int verVolumen() {
        return this.volumen;
    }

    @Override
    public void subirVolumen(int cifra) {
        this.volumen = cifra;
    }

    @Override
    public void ponerCanal(int canal) {
        this.canal = canal;
    }
}
