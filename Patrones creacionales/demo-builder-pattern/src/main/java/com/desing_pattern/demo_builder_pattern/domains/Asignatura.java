package com.desing_pattern.demo_builder_pattern.domains;


public class Asignatura {

    private String codigo;
    private String nombre;
    private String docente;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, String docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", docente='" + docente + '\'' +
                '}';
    }
}
