package com.design_pattern.demo_abstract_factory.controller;

import com.design_pattern.demo_abstract_factory.domains.abstractFactory.AbstractFactoryVehiculo;
import com.design_pattern.demo_abstract_factory.domains.SimpleFactory.SimpleFactoryVehiculo;
import com.design_pattern.demo_abstract_factory.domains.IAutomovil;
import com.design_pattern.demo_abstract_factory.domains.IScooter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AutomovilController {

    @GetMapping
    public String crearVehiculo(){

        AbstractFactoryVehiculo factory = SimpleFactoryVehiculo.crearFabrica("gasolina");
        IAutomovil automovil = factory.crearAutomovil();
        IScooter scooter = factory.crearScooter();
        return automovil.getInfoAutomovil();

    }
}
