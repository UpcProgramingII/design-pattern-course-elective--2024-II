package com.design_patterns.demo_factory_method.controller;

import com.design_patterns.demo_factory_method.domains.ICliente;
import com.design_patterns.demo_factory_method.domains.SimpleFactory.ClienteSimpleFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteControllerSF {

    @GetMapping("/crearPedidoSF/{formaDePago}")
    public ResponseEntity<?> crearPedidoSF(@PathVariable String formaDePago){

        ICliente cliente = ClienteSimpleFactory.crearCliente(formaDePago);
        return ResponseEntity.ok(cliente.crearPedido());
    }

}
