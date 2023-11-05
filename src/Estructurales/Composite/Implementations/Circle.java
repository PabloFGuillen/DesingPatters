package Estructurales.Composite.Implementations;

public class Circle extends Dot{

    private int radius;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radious){
        super(x, y);
        this.radius = radious;
    }

    @Override
    public void draw(){

    }
}
