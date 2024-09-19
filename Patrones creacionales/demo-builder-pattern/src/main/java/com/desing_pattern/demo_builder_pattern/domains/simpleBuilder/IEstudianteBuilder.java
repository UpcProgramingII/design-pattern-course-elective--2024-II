package com.desing_pattern.demo_builder_pattern.domains.simpleBuilder;

public interface IEstudianteBuilder {

     void id(String id);
     void nombre(String nombre);
     void apellido(String apellido);
     void edad (int edad);
     void semestre(int semestre);
     void programa(String codigo, String nombre, String facultad, String universidad);
     void asignatura(String codigo, String nombre, String docente);
     Estudiante build();

}
