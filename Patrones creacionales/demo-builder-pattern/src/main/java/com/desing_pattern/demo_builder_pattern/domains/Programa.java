package com.desing_pattern.demo_builder_pattern.domains;

public class Programa {

    private String codigo;
    private String nombre;
    private String facultad;
    private String universidad;

    public Programa(String codigo, String nombre, String facultad, String universidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.facultad = facultad;
        this.universidad = universidad;
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

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", facultad='" + facultad + '\'' +
                ", universidad='" + universidad + '\'' +
                '}';
    }
}
