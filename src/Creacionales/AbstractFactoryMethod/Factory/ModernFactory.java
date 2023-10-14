package Creacionales.AbstractFactoryMethod.Factory;

import Creacionales.AbstractFactoryMethod.Interface.Mesa;
import Creacionales.AbstractFactoryMethod.Moderna.MesaModerna;
import Creacionales.AbstractFactoryMethod.Moderna.SillaModerna;
import Creacionales.AbstractFactoryMethod.FactoryInt.MueblesFactory;
import Creacionales.AbstractFactoryMethod.Interface.Silla;

public class ModernFactory implements MueblesFactory {
    @Override
    public Mesa createMesa() {
        return new MesaModerna();
    }

    @Override
    public Silla createSilla() {
        return new SillaModerna();

    }
}
