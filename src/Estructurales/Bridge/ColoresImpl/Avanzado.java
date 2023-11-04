package Estructurales.Bridge.ColoresImpl;

import Estructurales.Bridge.Dispositivo;
import Estructurales.Bridge.Mando;

public class Avanzado implements Mando {
    private Dispositivo dispositivo;

    @Override
    public void togglePower() {
        dispositivo.encender();
    }

    @Override
    public void volumeDown() {
        dispositivo.subirVolumen(-1);
    }

    @Override
    public void volumeUp() {
        dispositivo.subirVolumen(1);

    }

    @Override
    public void channelDown() {
        dispositivo.ponerCanal(1);
    }

    @Override
    public void channelUp() {
        dispositivo.ponerCanal(1);

    }

    public void mute(){
        dispositivo.subirVolumen(0);
    }
}
