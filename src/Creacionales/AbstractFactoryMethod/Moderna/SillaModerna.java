package Creacionales.AbstractFactoryMethod.Moderna;

import Creacionales.AbstractFactoryMethod.Interface.Silla;

public class SillaModerna implements Silla {

    @Override
    public void silla() {
        System.out.println("Silla moderna creada");
    }
}
