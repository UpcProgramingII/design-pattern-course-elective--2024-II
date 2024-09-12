package com.design_patterns.demo_factory_method.domains.factoryMethod;

import com.design_patterns.demo_factory_method.domains.ICliente;

public abstract class ClienteFactory {

    public ICliente obtenerCliente(String tipo){

        return this.crearCliente(tipo);

    }

    public ICliente obtenerCliente(){

        return this.crearCliente();

    }

    public abstract ICliente crearCliente(String tipo);
    public abstract ICliente crearCliente();

}
