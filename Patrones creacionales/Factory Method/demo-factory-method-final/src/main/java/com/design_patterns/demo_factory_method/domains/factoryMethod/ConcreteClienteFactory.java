package com.design_patterns.demo_factory_method.domains.factoryMethod;

import com.design_patterns.demo_factory_method.domains.ClienteContado;
import com.design_patterns.demo_factory_method.domains.ClienteCredito;
import com.design_patterns.demo_factory_method.domains.ICliente;

public class ConcreteClienteFactory extends ClienteFactory{

    private ICliente crearClienteContado() {
        return new ClienteContado();
    }


    private ICliente crearClienteCredito() {
        return new ClienteCredito();
    }

    @Override
    public ICliente crearCliente() {
        return crearClienteContado();
    }

    @Override
    public ICliente crearCliente(String tipo) {
        return switch(tipo){
            case "credito"->  crearClienteCredito();
            default-> crearClienteContado();
        };
    }
}
