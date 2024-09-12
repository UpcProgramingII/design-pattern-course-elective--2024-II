package com.design_patterns.demo_factory_method.domains.factoryMethodVariant;

public class ConcreteClienteFactoryVariant {

    public static ClienteFactoryVariant ClienteFactory(String tipo){
        return switch(tipo){
            case "credito"->new ConcreteClienteCreditoFactory();
            default -> new ConcreteClienteContadoFactory();
        };
    }

}
