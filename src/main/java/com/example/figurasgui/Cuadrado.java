package com.example.figurasgui;


public class Cuadrado extends Figura{
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    @Override
    protected float area() {
        return (this.lado * this.lado);
    }

    @Override
    protected float perimetro() {
        return (this.lado * 4);
    }
}
