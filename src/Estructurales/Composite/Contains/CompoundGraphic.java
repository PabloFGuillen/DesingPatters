package Estructurales.Composite.Contains;

import Estructurales.Composite.Interface.Graphic;

import java.util.List;

public class CompoundGraphic implements Graphic {

    private List<Graphic> childres;

    public void addChild(Graphic child){
        childres.add(child);
    }

    public void removeChild(Graphic child){
        childres.remove(child);
    }

    public void move(int x, int y) {

    }

    public void draw(){

    }
}
