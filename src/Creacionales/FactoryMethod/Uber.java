package Creacionales.FactoryMethod;

public class Uber implements TransportService {
    @Override
    public void transport() {
        System.out.println("Transported by Uber");
    }
}
