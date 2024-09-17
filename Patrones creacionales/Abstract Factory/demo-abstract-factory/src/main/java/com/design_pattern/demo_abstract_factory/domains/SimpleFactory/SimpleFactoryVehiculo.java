package com.design_pattern.demo_abstract_factory.domains.SimpleFactory;

import com.design_pattern.demo_abstract_factory.domains.abstractFactory.AbstractFactoryVehiculo;
import com.design_pattern.demo_abstract_factory.domains.abstractFactory.ConcreteFactoryVehiculoElectrico;
import com.design_pattern.demo_abstract_factory.domains.abstractFactory.ConcreteFactoryVehiculoGasolina;

public class SimpleFactoryVehiculo {

    public static AbstractFactoryVehiculo crearFabrica(String tipo){

        switch (tipo){
            case "gasolina" : return new ConcreteFactoryVehiculoGasolina();
            default: return new ConcreteFactoryVehiculoElectrico();
        }

    }
}
