package Creacionales.AbstractFactoryMethod;

import Creacionales.AbstractFactoryMethod.Factory.ModernFactory;
import Creacionales.AbstractFactoryMethod.FactoryInt.MueblesFactory;
import Creacionales.AbstractFactoryMethod.Interface.Silla;

public class Main {
    public static void main(String[] args){
        MueblesFactory mueblesFactory = new ModernFactory();
        Silla sillaModerna = mueblesFactory.createSilla();
        sillaModerna.silla();
    }
}
