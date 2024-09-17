package com.design_patterns.demo_factory_method.domains.FactoryMethod;

import com.design_patterns.demo_factory_method.domains.ICliente;

public abstract class FactoryCliente {

    public ICliente getCliente(){

        return this.crearCliente();

    }

    public abstract ICliente crearCliente();




}
