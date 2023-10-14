package Creacionales.FactoryMethod;

public class UberApp extends App{

    @Override
    public TransportService createTransport() {
        return new Uber();
    }
}
