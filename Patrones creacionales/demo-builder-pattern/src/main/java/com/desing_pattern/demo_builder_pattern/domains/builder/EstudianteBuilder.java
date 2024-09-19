package com.desing_pattern.demo_builder_pattern.domains.builder;

import com.desing_pattern.demo_builder_pattern.domains.Asignatura;
import com.desing_pattern.demo_builder_pattern.domains.Programa;

import java.util.ArrayList;
import java.util.List;

public class EstudianteBuilder {

    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;
    private Programa programa;
    private List<Asignatura> asignaturas;

    private EstudianteBuilder(String id, String nombre, String apellido, int edad, int semestre, Programa programa, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
        this.programa = programa;
        this.asignaturas = asignaturas;
    }

    private EstudianteBuilder(String nombre, String apellido, int edad, int semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                ", programa=" + programa +
                ", asignaturas=" + asignaturas +
                '}';
    }

    public static class EstudianteConcreteBuilder implements IEstudianteBuilder {

        private String id;
        private String nombre;
        private String apellido;
        private int edad;
        private int semestre;
        private Programa programa;
        private List<Asignatura> asignaturas;

        public EstudianteConcreteBuilder() {
            this.asignaturas = new ArrayList<>();
        }

        @Override
        public IEstudianteBuilder id(String id) {
            this.id = id;
            return this;
        }

        @Override
        public IEstudianteBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        @Override
        public IEstudianteBuilder apellido(String apellido) {
            this.apellido = apellido;
            return this;

        }

        @Override
        public IEstudianteBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        @Override
        public IEstudianteBuilder semestre(int semestre) {
            this.semestre = semestre;
            return this;
        }

        @Override
        public IEstudianteBuilder programa(String codigo, String nombre, String facultad, String universidad) {
            this.programa = new Programa(codigo, nombre, facultad, universidad);
            return this;
        }

        @Override
        public IEstudianteBuilder asignatura(String codigo, String nombre, String docente) {
            this.asignaturas.add(new Asignatura(codigo, nombre, docente));
            return this;
        }

        @Override
        public EstudianteBuilder build() {
            return new EstudianteBuilder(this.id, this.nombre, this.apellido,this.edad,
                    this.semestre, this.programa, this.asignaturas);
        }
    }
}
