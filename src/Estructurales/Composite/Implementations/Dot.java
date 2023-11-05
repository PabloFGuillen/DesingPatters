package Estructurales.Composite.Implementations;

import Estructurales.Composite.Interface.Graphic;

public class Dot implements Graphic {

    private int x;

    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {

    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
