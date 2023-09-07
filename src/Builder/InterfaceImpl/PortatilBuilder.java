package Builder.InterfaceImpl;

import Builder.Interfaces.Builder;
import Builder.Interfaces.Ordenador;
import Builder.Interfaces.TipoOrdenador;
import Builder.Ordenadores.Portatil;

public class PortatilBuilder implements Builder {
    private int ram;

    private int puerto;

    private boolean nfc;

    private int amperios;

    private TipoOrdenador tipoOrdenador;


    @Override
    public void setRam(int Ram) {

    }

    @Override
    public void setPuertosUsb(int puertos) {

    }

    @Override
    public void hasNFC(boolean nfc) {

    }

    @Override
    public void bateria(int amperios) {

    }

    @Override
    public void tipoDispositivo(TipoOrdenador ordenador) {

    }

    public Ordenador getOrdenador(){
        return new Portatil(this.ram, this.puerto, this.amperios, tipoOrdenador);
    }
}
