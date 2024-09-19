package com.desing_pattern.demo_builder_pattern.domains.builder;

public class BuilderDirector {

    public void builderEstudianteSistemas(IEstudianteBuilder builder){
        builder
                .semestre(7)
                .programa("123", "Sistemas", "Ingeneirias", "Upc");
    };

}
