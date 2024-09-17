package com.design_patterns.demo_factory_method.controller;

import com.design_patterns.demo_factory_method.domains.ICliente;
import com.design_patterns.demo_factory_method.domains.FactoryMethod.FactoryCliente;
import com.design_patterns.demo_factory_method.domains.FactoryMethod.SimpleFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteControllerFMA {

    @GetMapping("/crearPedidoFMA/{formaDePago}")
    public ResponseEntity<?> crearPedidoFMA(@PathVariable String formaDePago){

        FactoryCliente factory = SimpleFactory.crearFactory(formaDePago);
        ICliente cliente = factory.crearCliente();
        return ResponseEntity.ok(cliente.crearPedido());
    }
}
