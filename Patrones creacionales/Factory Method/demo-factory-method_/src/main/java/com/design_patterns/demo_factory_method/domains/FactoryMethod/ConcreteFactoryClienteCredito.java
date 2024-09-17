package com.design_patterns.demo_factory_method.domains.FactoryMethod;

import com.design_patterns.demo_factory_method.domains.ClienteCredito;
import com.design_patterns.demo_factory_method.domains.ICliente;

public class ConcreteFactoryClienteCredito extends FactoryCliente {
    @Override
    public ICliente crearCliente() {
        return new ClienteCredito();
    }
}
