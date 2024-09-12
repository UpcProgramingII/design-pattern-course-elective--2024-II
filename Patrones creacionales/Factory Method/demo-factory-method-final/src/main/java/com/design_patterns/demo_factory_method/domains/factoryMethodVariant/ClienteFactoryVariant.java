package com.design_patterns.demo_factory_method.domains.factoryMethodVariant;

import com.design_patterns.demo_factory_method.domains.ICliente;

public abstract class ClienteFactoryVariant {

    public ICliente obtenerCliente(){

        return this.crearCliente();

    }

    public abstract ICliente crearCliente();
}
