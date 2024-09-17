package com.design_pattern.demo_abstract_factory.domains.abstractFactory;

import com.design_pattern.demo_abstract_factory.domains.IAutomovil;
import com.design_pattern.demo_abstract_factory.domains.IScooter;

public interface AbstractFactoryVehiculo {

    IScooter crearScooter();
    IAutomovil crearAutomovil();

}
