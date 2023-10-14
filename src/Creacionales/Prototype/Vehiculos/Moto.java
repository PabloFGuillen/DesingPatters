package Creacionales.Prototype.Vehiculos;

import Creacionales.Prototype.AbstractClass.Vehiculo;

public class Moto extends Vehiculo {
    public int pasajeros;

    public Moto(){

    }

    private Moto(Moto moto){
        super(moto);
        if(moto != null){
            this.pasajeros = moto.pasajeros;
        }
    }

    public Vehiculo clone(){
        return new Moto(this);
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof Moto) || !super.equals(object2)) return false;
        Moto shape2 = (Moto) object2;
        return shape2.pasajeros == pasajeros;
    }
}
