package Prototype.AbstractClass;

import java.util.Objects;

public abstract class Vehiculo {

    public int potencia;

    public Integer caballos;

    public String matricula;

    public Vehiculo(){

    }

    public Vehiculo(Vehiculo vehiculo){
        if(vehiculo != null){
            this.potencia = vehiculo.potencia;
            this.caballos = vehiculo.caballos;
        }
    }

    public abstract Vehiculo clone();

    public boolean equals(Object object2) {
        if (!(object2 instanceof Vehiculo)) return false;
        Vehiculo shape2 = (Vehiculo) object2;
        return shape2.potencia == potencia && shape2.caballos == caballos && Objects.equals(shape2.matricula, matricula);
    }

}
