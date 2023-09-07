package AbstractFactoryMethod;

import AbstractFactoryMethod.Factory.ModernFactory;
import AbstractFactoryMethod.FactoryInt.MueblesFactory;
import AbstractFactoryMethod.Interface.Silla;
import AbstractFactoryMethod.Moderna.SillaModerna;

public class Main {
    public static void main(String[] args){
        MueblesFactory mueblesFactory = new ModernFactory();
        Silla sillaModerna = mueblesFactory.createSilla();
        sillaModerna.silla();
    }
}
