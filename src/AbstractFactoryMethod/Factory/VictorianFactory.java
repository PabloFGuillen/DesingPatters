package AbstractFactoryMethod.Factory;

import AbstractFactoryMethod.Interface.Mesa;
import AbstractFactoryMethod.FactoryInt.MueblesFactory;
import AbstractFactoryMethod.Interface.Silla;
import AbstractFactoryMethod.Victoriana.MesaVictoriana;
import AbstractFactoryMethod.Victoriana.SillaVictoriana;

public class VictorianFactory implements MueblesFactory {
    @Override
    public Mesa createMesa() {
        return new MesaVictoriana();
    }

    @Override
    public Silla createSilla() {
        return new SillaVictoriana();
    }
}
