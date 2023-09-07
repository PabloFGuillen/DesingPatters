package Prototype;

import Prototype.AbstractClass.Vehiculo;
import Prototype.Vehiculos.Coche;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Vehiculo> vehiculoList = new ArrayList<>();
        List<Vehiculo> vehiculosCloneList = new ArrayList<>();
        Coche coche = new Coche();
        coche.puertas = 2;
        coche.caballos = 3;
        coche.potencia = 3;
        coche.matricula = "DLKGF001";
        vehiculoList.add(coche);

        Coche coche2 = (Coche) coche.clone();
        vehiculoList.add(coche2);

        for(Vehiculo vehiculo: vehiculoList){
            vehiculosCloneList.add(vehiculo.clone());
        }
    }
}
