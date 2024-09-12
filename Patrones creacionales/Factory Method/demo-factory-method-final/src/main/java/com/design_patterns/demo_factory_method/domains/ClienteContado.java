package com.design_patterns.demo_factory_method.domains;

public class ClienteContado implements ICliente{

    @Override
    public Pedido crearPedido() {
        return new PedidoContado(5000, "Pedido a contado ");
    }
}
