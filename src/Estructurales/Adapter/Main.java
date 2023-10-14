package Estructurales.Adapter;

import Estructurales.Adapter.Figures.RoundPeg;
import Estructurales.Adapter.Figures.SquarePeg;
import Estructurales.Adapter.Hole.RoundHole;
import Estructurales.Adapter.SquareAdapter.SquarePegAdapter;

public class Main {
    public static void main(String[] args){
        RoundPeg roundPeg = new RoundPeg(2);
        RoundHole roundHole = new RoundHole(3);

        SquarePeg squarePeg = new SquarePeg(10);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
