package Creacionales.FactoryMethod;

public class Bolt implements TransportService{
    @Override
    public void transport() {
        System.out.println("Transport by Bolt");
    }
}
