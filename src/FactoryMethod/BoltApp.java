package FactoryMethod;

public class BoltApp extends App{

    @Override
    public TransportService createTransport() {
        return new Bolt();
    }
}
