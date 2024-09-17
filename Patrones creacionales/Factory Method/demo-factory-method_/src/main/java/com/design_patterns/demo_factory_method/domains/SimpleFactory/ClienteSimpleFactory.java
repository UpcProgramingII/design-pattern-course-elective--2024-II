package com.design_patterns.demo_factory_method.domains.SimpleFactory;

import com.design_patterns.demo_factory_method.domains.ClienteContado;
import com.design_patterns.demo_factory_method.domains.ClienteCredito;
import com.design_patterns.demo_factory_method.domains.ICliente;

public class ClienteSimpleFactory {

    public static ICliente crearCliente(String formaPago){

        switch(formaPago){

            case "contado": return crearClienteContado();
            default: return crearClienteCredito();
        }

    }

    public static ICliente crearCliente(){
        return  crearCliente("contado");
    }

    private static ClienteCredito crearClienteCredito(){
            return new ClienteCredito();
    }

    private static ClienteContado crearClienteContado(){
          return new ClienteContado();
    }


}
