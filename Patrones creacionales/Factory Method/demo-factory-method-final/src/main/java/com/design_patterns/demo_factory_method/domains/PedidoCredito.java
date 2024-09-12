package com.design_patterns.demo_factory_method.domains;

import com.design_patterns.demo_factory_method.domains.Pedido;

public class PedidoCredito extends Pedido {

    public PedidoCredito(double valor, String descripcion) {
        super(valor, descripcion);
    }
}
