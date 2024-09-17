package com.design_patterns.demo_factory_method.domains;

public  class Pedido {

    private String descripcion;
    private double valor;

    public Pedido() {
    }

    public Pedido(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descripcion='" + descripcion + '\'' +
                ", valor=" + valor +
                '}';
    }
}
