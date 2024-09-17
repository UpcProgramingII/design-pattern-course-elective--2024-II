package com.design_patterns.demo_factory_method.domains;

public class ClienteCredito implements ICliente{

    @Override
    public Pedido crearPedido() {

        return new Pedido(1000, "Pedido a credito ");

    }

}
