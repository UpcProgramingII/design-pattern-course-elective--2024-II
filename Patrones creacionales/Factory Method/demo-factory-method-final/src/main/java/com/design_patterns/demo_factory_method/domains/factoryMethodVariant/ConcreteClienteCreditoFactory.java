package com.design_patterns.demo_factory_method.domains.factoryMethodVariant;

import com.design_patterns.demo_factory_method.domains.ClienteCredito;
import com.design_patterns.demo_factory_method.domains.ICliente;

public class ConcreteClienteCreditoFactory extends ClienteFactoryVariant {
    @Override
    public ICliente crearCliente() {

        return new ClienteCredito();

    }
}
