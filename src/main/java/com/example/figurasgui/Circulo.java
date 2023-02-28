package com.example.figurasgui;


public class Circulo extends Figura{

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    protected float area() {
        return ((float) ((Math.PI) * (Math.pow(radio,2))));
    }

    @Override
    protected float perimetro() {
        return ((float) (2 * Math.PI * radio));
    }
}
