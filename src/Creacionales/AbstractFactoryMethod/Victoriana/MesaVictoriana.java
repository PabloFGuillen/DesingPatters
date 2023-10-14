package Creacionales.AbstractFactoryMethod.Victoriana;

import Creacionales.AbstractFactoryMethod.Interface.Mesa;

public class MesaVictoriana implements Mesa {

    @Override
    public void mesa() {
        System.out.println("Esto es una mesa victoriana");
    }
}
