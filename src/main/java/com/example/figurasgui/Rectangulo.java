package com.example.figurasgui;


public class Rectangulo extends Figura{

    public Rectangulo(float base,float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected float area() {
        return (this.base * this.altura);
    }

    @Override
    protected float perimetro() {
        return ((this.base * 2) + (this.altura * 2));
    }
}
