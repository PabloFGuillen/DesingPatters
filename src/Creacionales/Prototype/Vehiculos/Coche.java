package Creacionales.Prototype.Vehiculos;

import Creacionales.Prototype.AbstractClass.Vehiculo;

public class Coche extends Vehiculo {

    public int puertas;

    public Coche(){

    }

    private Coche(Coche coche){
        super(coche);
        if(coche != null){
            this.puertas = puertas;
        }
    }

    public Vehiculo clone(){
        return new Coche(this);
    }

    public boolean equals(Object object2){
        if (!(object2 instanceof Coche) || !super.equals(object2)) return false;
        Coche shape2 = (Coche) object2;
        return shape2.puertas == puertas;
    }
}
