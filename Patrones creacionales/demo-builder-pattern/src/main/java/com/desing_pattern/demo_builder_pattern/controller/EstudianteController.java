package com.desing_pattern.demo_builder_pattern.controller;


import com.desing_pattern.demo_builder_pattern.domains.simpleBuilder.Estudiante;
import com.desing_pattern.demo_builder_pattern.domains.simpleBuilder.EstudianteSimpleBuilder;
import com.desing_pattern.demo_builder_pattern.domains.simpleBuilder.IEstudianteBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EstudianteController {

    @GetMapping
    public Estudiante getEstudiante(){

        IEstudianteBuilder builder = new EstudianteSimpleBuilder();

        builder.nombre("JAiro");
        builder.apellido("Seoanes");
        builder.edad(30);
        builder.asignatura("ABC", "Asignatura 1", "Docente 1");
        builder.asignatura("CDF", "Asignatura 2", "Docente 2");
        builder.semestre(7);
        builder.programa("123", "Sistemas", "Ingenierias", "Unicesar");

        Estudiante estudiante= builder.build();
        return  estudiante;

    }

}
