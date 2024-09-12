package com.design_patterns.demo_factory_method.controller;

import com.design_patterns.demo_factory_method.domains.ICliente;
import com.design_patterns.demo_factory_method.domains.simpleFactory.SimpleClienteFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteSF")
public class ClienteControllerSimpleFactory {

    @GetMapping("/crearPedido/{tipoCliente}")
    public ResponseEntity<?> crearPedidoSimple(@PathVariable String tipoCliente){

        ICliente cliente = SimpleClienteFactory.crearCliente(tipoCliente);
        return ResponseEntity.ok(cliente.crearPedido());

    }

}
