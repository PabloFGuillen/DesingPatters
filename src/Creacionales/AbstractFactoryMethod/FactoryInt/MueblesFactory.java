package Creacionales.AbstractFactoryMethod.FactoryInt;

import Creacionales.AbstractFactoryMethod.Interface.Mesa;
import Creacionales.AbstractFactoryMethod.Interface.Silla;

public interface MueblesFactory{
    public Mesa createMesa();

    public Silla createSilla();
}
