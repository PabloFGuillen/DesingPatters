package Builder;

import Builder.Director.Director;
import Builder.InterfaceImpl.PortatilBuilder;
import Builder.Interfaces.Ordenador;

public class Main {
    public static void main (String[] args){
        Director director = new Director();
        PortatilBuilder portatilBuilder = new PortatilBuilder();
        director.crearPortatil(portatilBuilder);

        Ordenador ordenador = portatilBuilder.getOrdenador();
        ordenador.moverRatón();
    }
}
