package Estructurales.Adapter.Hole;

import Estructurales.Adapter.Figures.RoundPeg;

public class RoundHole {

    private int radius;

    public RoundHole(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public boolean fits(RoundPeg roundPeg){
        if(roundPeg.getRadius() <= this.radius){
            return true;
        }

        return false;
    }
}
