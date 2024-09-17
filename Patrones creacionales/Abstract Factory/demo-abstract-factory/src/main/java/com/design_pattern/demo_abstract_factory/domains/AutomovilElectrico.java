package com.design_pattern.demo_abstract_factory.domains;

public class AutomovilElectrico implements IAutomovil{

    private double autonomiaKms;

    public AutomovilElectrico() {
        this.autonomiaKms = 500;
    }

    @Override
    public String getInfoAutomovil() {
        return " Es un automovil electrico con autonomia de " +
                this.autonomiaKms + " kms";
    }
}
