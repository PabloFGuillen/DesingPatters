package Creacionales.Builder;

import Creacionales.Builder.Director.Director;
import Creacionales.Builder.InterfaceImpl.PortatilBuilder;
import Creacionales.Builder.Interfaces.Ordenador;

public class Main {
    public static void main (String[] args){
        Director director = new Director();
        PortatilBuilder portatilBuilder = new PortatilBuilder();
        director.crearPortatil(portatilBuilder);

        Ordenador ordenador = portatilBuilder.getOrdenador();
        ordenador.moverRatón();
    }
}
