package Builder.InterfaceImpl;

import Builder.Interfaces.Builder;
import Builder.Interfaces.Ordenador;
import Builder.Interfaces.TipoOrdenador;
import Builder.Ordenadores.Portatil;
import Builder.Ordenadores.Sobremesa;

public class SobremesaBuilder implements Builder {

    private int ram;

    private int puertos;

    private Boolean nfc;

    private int amperios;


    private TipoOrdenador ordenador;
    @Override
    public void setRam(int Ram) {
        this.ram = ram;
    }

    @Override
    public void setPuertosUsb(int puertos) {
        this.puertos = puertos;
    }

    @Override
    public void hasNFC(boolean nfc) {
        this.nfc = nfc;
    }

    @Override
    public void bateria(int amperios) {
        this.amperios = amperios;
    }

    @Override
    public void tipoDispositivo(TipoOrdenador ordenador) {
        ordenador = ordenador;
    }

    public Ordenador getOrdenador(){
        return new Sobremesa(this.ram, this.puertos, this.amperios, ordenador);
    }
}
