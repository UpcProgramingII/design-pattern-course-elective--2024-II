package com.desing_pattern.demo_builder_pattern.domains.simpleBuilder;

import com.desing_pattern.demo_builder_pattern.domains.Asignatura;
import com.desing_pattern.demo_builder_pattern.domains.Programa;

import java.util.ArrayList;
import java.util.List;

public class EstudianteSimpleBuilder implements IEstudianteBuilder {


        private String id;
        private String nombre;
        private String apellido;
        private int edad;
        private int semestre;
        private Programa programa;
        private List<Asignatura> asignaturas;

        public EstudianteSimpleBuilder() {

            this.asignaturas = new ArrayList<>();
        }

        @Override
        public void id(String id) {
            this.id = id;
        }

        @Override
        public void nombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void apellido(String apellido) {
            this.apellido = apellido;


        }

        @Override
        public void edad(int edad) {
            this.edad = edad;

        }

        @Override
        public void semestre(int semestre) {
            this.semestre = semestre;

        }

        @Override
        public void programa(String codigo, String nombre, String facultad, String universidad) {
            this.programa = new Programa(codigo, nombre, facultad, universidad);
        }

        @Override
        public void asignatura(String codigo, String nombre, String docente) {
            this.asignaturas.add(new Asignatura(codigo, nombre, docente));

        }

        @Override
        public Estudiante build() {
            return new Estudiante(this.id, this.nombre, this.apellido,this.edad,
                    this.semestre, this.programa, this.asignaturas);
        }

}
