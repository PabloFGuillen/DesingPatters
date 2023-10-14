package Creacionales.Builder.Ordenadores;

import Creacionales.Builder.Interfaces.Ordenador;
import Creacionales.Builder.Interfaces.TipoOrdenador;

public class Portatil implements Ordenador {


    private int ram;

    private int puerto;

    private int amperios;

    private TipoOrdenador tipoOrdenador;

    public Portatil(int ram, int puerto, int amperios, TipoOrdenador tipoOrdenador) {
        this.ram = ram;
        this.puerto = puerto;
        this.amperios = amperios;
        this.tipoOrdenador  = tipoOrdenador;
    }


    @Override
    public void moverRatón() {
        System.out.println("Muevo el RATÓN en un Portatil");
    }
}
