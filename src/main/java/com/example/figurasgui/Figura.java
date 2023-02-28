package com.example.figurasgui;


public abstract class Figura {
    protected float base;
    protected float altura;
    protected float lado;
    protected float radio;

    protected abstract float area();
    protected abstract float perimetro();
}
