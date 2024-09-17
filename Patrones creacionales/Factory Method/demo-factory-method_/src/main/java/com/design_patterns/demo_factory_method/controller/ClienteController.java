package com.design_patterns.demo_factory_method.controller;

import com.design_patterns.demo_factory_method.domains.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {



    @GetMapping("/crearPedido/{formaDePago}")
    public ResponseEntity<?> crearPedido(@PathVariable String formaDePago){
        ICliente cliente;
        if(formaDePago.equalsIgnoreCase("Contado")){
            cliente = new ClienteContado();
        }else{
            cliente = new ClienteCredito();
        }
        return ResponseEntity.ok(cliente.crearPedido());
    }




}
