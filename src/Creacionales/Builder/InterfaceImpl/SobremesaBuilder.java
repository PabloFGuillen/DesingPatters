package Creacionales.Builder.InterfaceImpl;

import Creacionales.Builder.Interfaces.Builder;
import Creacionales.Builder.Interfaces.Ordenador;
import Creacionales.Builder.Interfaces.TipoOrdenador;
import Creacionales.Builder.Ordenadores.Sobremesa;

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
