package Builder.Ordenadores;

import Builder.Interfaces.Ordenador;
import Builder.Interfaces.TipoOrdenador;

public class Sobremesa implements Ordenador {


    private int ram;

    private int puerto;

    private int amperios;

    private TipoOrdenador tipoOrdenador;

    public Sobremesa(int ram, int puerto, int amperios, TipoOrdenador tipoOrdenador) {
        this.ram = ram;
        this.puerto = puerto;
        this.amperios = amperios;
        this.tipoOrdenador  = tipoOrdenador;
    }

    @Override
    public void moverRatón() {
        System.out.println("Muevo el RATÓN en un Sobremesa");

    }
}
