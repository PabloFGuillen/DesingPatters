package AbstractFactoryMethod.FactoryInt;

import AbstractFactoryMethod.Interface.Mesa;
import AbstractFactoryMethod.Interface.Silla;

public interface MueblesFactory{
    public Mesa createMesa();

    public Silla createSilla();
}
