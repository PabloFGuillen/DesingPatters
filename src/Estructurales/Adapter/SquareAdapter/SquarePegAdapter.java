package Estructurales.Adapter.SquareAdapter;

import Estructurales.Adapter.Figures.RoundPeg;
import Estructurales.Adapter.Figures.SquarePeg;

import static java.lang.Math.sqrt;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;

    }

    @Override
    public int getRadius() {
        return (int) (squarePeg.getWidth() * sqrt(2)/2);
    }
}
