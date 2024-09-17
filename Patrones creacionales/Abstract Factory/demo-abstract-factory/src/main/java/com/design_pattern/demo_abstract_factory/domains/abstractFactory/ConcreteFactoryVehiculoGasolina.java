package com.design_pattern.demo_abstract_factory.domains.abstractFactory;

import com.design_pattern.demo_abstract_factory.domains.AutomovilGasolina;
import com.design_pattern.demo_abstract_factory.domains.IAutomovil;
import com.design_pattern.demo_abstract_factory.domains.IScooter;
import com.design_pattern.demo_abstract_factory.domains.ScooterGasolina;

public class ConcreteFactoryVehiculoGasolina implements AbstractFactoryVehiculo {
    @Override
    public IScooter crearScooter() {
        return new ScooterGasolina();
    }

    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilGasolina();
    }
}
