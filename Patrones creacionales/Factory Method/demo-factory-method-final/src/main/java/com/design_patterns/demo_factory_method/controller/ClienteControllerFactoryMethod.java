package com.design_patterns.demo_factory_method.controller;

import com.design_patterns.demo_factory_method.domains.ICliente;
import com.design_patterns.demo_factory_method.domains.factoryMethod.ClienteFactory;
import com.design_patterns.demo_factory_method.domains.factoryMethod.ConcreteClienteFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteFM")
public class ClienteControllerFactoryMethod {
    @GetMapping("/crearPedido/{tipoCliente}")
    public ResponseEntity<?> crearPedidoStandard(@PathVariable String tipoCliente){

        ClienteFactory factory = new ConcreteClienteFactory();
        ICliente cliente = factory.crearCliente(tipoCliente);
        return ResponseEntity.ok(cliente.crearPedido());

    }
}
