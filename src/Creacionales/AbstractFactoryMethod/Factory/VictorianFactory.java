package Creacionales.AbstractFactoryMethod.Factory;

import Creacionales.AbstractFactoryMethod.Interface.Mesa;
import Creacionales.AbstractFactoryMethod.FactoryInt.MueblesFactory;
import Creacionales.AbstractFactoryMethod.Interface.Silla;
import Creacionales.AbstractFactoryMethod.Victoriana.MesaVictoriana;
import Creacionales.AbstractFactoryMethod.Victoriana.SillaVictoriana;

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
