package com.design_pattern.demo_abstract_factory.domains;

public class ScooterGasolina implements IScooter{

    private double capacidadTanque;

    public ScooterGasolina() {
        this.capacidadTanque = 4;
    }

    @Override
    public String getInfoScooter() {
        return " Es una moto de gasolina con capacidad de tanque de " +
                this.capacidadTanque + " galones";
    }
}
