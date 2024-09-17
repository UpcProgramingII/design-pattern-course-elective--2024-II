package com.design_pattern.demo_abstract_factory.domains;

public class ScooterElectrica implements IScooter{

    private double autonomiaKms;

    public ScooterElectrica() {
        this.autonomiaKms = 80;
    }

    @Override
    public String getInfoScooter() {
        return " Es una scooter electrica con autonomia de " + this.autonomiaKms +
                "Kms ";
    }
}
