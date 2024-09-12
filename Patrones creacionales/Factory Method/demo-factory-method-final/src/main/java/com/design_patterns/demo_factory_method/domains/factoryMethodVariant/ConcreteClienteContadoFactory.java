package com.design_patterns.demo_factory_method.domains.factoryMethodVariant;
import com.design_patterns.demo_factory_method.domains.ClienteContado;
import com.design_patterns.demo_factory_method.domains.ICliente;

public class ConcreteClienteContadoFactory extends ClienteFactoryVariant {
    @Override
    public ICliente crearCliente() {

        return new ClienteContado();

    }
}
