package com.design_pattern.demo_abstract_factory.domains;

public class AutomovilGasolina implements  IAutomovil{
    private double capacidadTanque;

    public AutomovilGasolina() {
        this.capacidadTanque = 14;
    }

    @Override
    public String getInfoAutomovil() {
        return " Es una automovil gasolina con capacidad de tamque de " +
                this.capacidadTanque + " Galones";
    }
}
