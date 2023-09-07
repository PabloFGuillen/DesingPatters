package AbstractFactoryMethod.Moderna;

import AbstractFactoryMethod.Interface.Mesa;

public class MesaModerna implements Mesa {
    @Override
    public void mesa() {
        System.out.println("Mesa moderna creada");
    }
}
