package Creacionales.Singleton.SingletonObject;

public class Car {

    public static Car car;

    private Car(){
        this.car = new Car();

    }

    public static Car getCar(){
        if(car == null){
            car = new Car();
        }

        return car;
    }
}
