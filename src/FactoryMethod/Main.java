package FactoryMethod;

public class Main {
    public static void main (String[] args){
        App app = new UberApp();
        TransportService transportService = app.createTransport();
        transportService.transport();
    }
}
