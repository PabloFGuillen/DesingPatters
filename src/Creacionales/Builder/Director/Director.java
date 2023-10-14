package Creacionales.Builder.Director;
import Creacionales.Builder.Interfaces.Builder;
import Creacionales.Builder.Interfaces.TipoOrdenador;

public class Director {

    public void crearPortatil(Builder builder){
        builder.setRam(9);
        builder.setPuertosUsb(1);
        builder.bateria(3000);
        builder.hasNFC(true);
        builder.tipoDispositivo(TipoOrdenador.PORTATIL);
    }

    public void crearSobremesa(Builder builder){
        builder.setRam(64);
        builder.setPuertosUsb(5);
        builder.bateria(6000);
        builder.hasNFC(true);
        builder.tipoDispositivo(TipoOrdenador.SOBREMESA);
    }


}
