package com.design_patterns.demo_factory_method.domains.FactoryMethod;

import com.design_patterns.demo_factory_method.domains.ClienteContado;
import com.design_patterns.demo_factory_method.domains.ICliente;

public class ConcreteFactoryClienteContado extends FactoryCliente {
    @Override
    public ICliente crearCliente() {
        return new ClienteContado();
    }
}
