package AbstractFactoryMethod.Victoriana;

import AbstractFactoryMethod.Interface.Silla;

public class SillaVictoriana implements Silla {
    @Override
    public void silla() {
        System.out.println("Esto es una silla victoriana");
    }
}
