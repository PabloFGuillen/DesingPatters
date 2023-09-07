package AbstractFactoryMethod.Factory;

import AbstractFactoryMethod.Interface.Mesa;
import AbstractFactoryMethod.Moderna.MesaModerna;
import AbstractFactoryMethod.Moderna.SillaModerna;
import AbstractFactoryMethod.FactoryInt.MueblesFactory;
import AbstractFactoryMethod.Interface.Silla;

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
