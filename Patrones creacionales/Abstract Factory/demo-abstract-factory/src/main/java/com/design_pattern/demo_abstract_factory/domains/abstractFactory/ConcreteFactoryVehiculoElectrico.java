package com.design_pattern.demo_abstract_factory.domains.abstractFactory;

import com.design_pattern.demo_abstract_factory.domains.AutomovilElectrico;
import com.design_pattern.demo_abstract_factory.domains.IAutomovil;
import com.design_pattern.demo_abstract_factory.domains.IScooter;
import com.design_pattern.demo_abstract_factory.domains.ScooterElectrica;

public class ConcreteFactoryVehiculoElectrico implements AbstractFactoryVehiculo{
    @Override
    public IScooter crearScooter() {
        return new ScooterElectrica();
    }

    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilElectrico();
    }
}
