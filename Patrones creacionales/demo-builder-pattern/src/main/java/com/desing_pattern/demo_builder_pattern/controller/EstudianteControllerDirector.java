package com.desing_pattern.demo_builder_pattern.controller;

import com.desing_pattern.demo_builder_pattern.domains.builder.BuilderDirector;
import com.desing_pattern.demo_builder_pattern.domains.builder.EstudianteBuilder;
import com.desing_pattern.demo_builder_pattern.domains.builder.IEstudianteBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/")
public class EstudianteControllerDirector {

    @GetMapping("list/")
    public List<EstudianteBuilder> getEstudiantes(){

        BuilderDirector director = new BuilderDirector();
        IEstudianteBuilder builder = new EstudianteBuilder.EstudianteConcreteBuilder();

        List<EstudianteBuilder> estudiantes = new ArrayList<>();

        director.builderEstudianteSistemas(builder);

        EstudianteBuilder estudianteA = builder.id("123").nombre("JAiro").apellido("Seoanes").build();
        estudiantes.add(estudianteA);

        EstudianteBuilder estudianteB = builder.id("456").nombre("Luis").apellido("Diaz").build();
        estudiantes.add(estudianteB);

        EstudianteBuilder estudianteC = builder.id("789").nombre("James").apellido("Rodriguez").build();
        estudiantes.add(estudianteC);

        return  estudiantes;

    }
}
