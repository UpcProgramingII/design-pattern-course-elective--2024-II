package com.design_patterns.demo_factory_method.controller;

import com.design_patterns.demo_factory_method.domains.ICliente;
import com.design_patterns.demo_factory_method.domains.factoryMethodVariant.ClienteFactoryVariant;
import com.design_patterns.demo_factory_method.domains.factoryMethodVariant.ConcreteClienteFactoryVariant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteFMV")
public class ClientControllerFactoryMethodVariant {

    @GetMapping("/crearPedido/{tipoCliente}")
    public ResponseEntity<?> crearPedidoVariante(@PathVariable String tipoCliente){

        ClienteFactoryVariant factory = ConcreteClienteFactoryVariant.ClienteFactory(tipoCliente);
        ICliente cliente = factory.crearCliente();
        return ResponseEntity.ok(cliente.crearPedido());

    }


}
