package com.design_patterns.demo_factory_method.domains.simpleFactory;

import com.design_patterns.demo_factory_method.domains.ClienteContado;
import com.design_patterns.demo_factory_method.domains.ClienteCredito;
import com.design_patterns.demo_factory_method.domains.ICliente;

public class SimpleClienteFactory {

    public static ICliente crearCliente(String tipo){

        return switch(tipo){
            case "credito"-> new ClienteCredito();
            default-> new ClienteContado();
        };
    }

}
