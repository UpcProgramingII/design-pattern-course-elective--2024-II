package com.design_patterns.demo_factory_method.domains.FactoryMethod;

public class SimpleFactory {

    public static FactoryCliente crearFactory(String formaPago){

        switch(formaPago){

            case "contado": return new ConcreteFactoryClienteContado();
            default: return new ConcreteFactoryClienteCredito();
        }


    }
}
