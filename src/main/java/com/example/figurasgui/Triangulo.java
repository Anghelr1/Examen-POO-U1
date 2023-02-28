package com.example.figurasgui;


public class Triangulo extends Figura{
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    protected float area() {
        return ((this.base * this.altura) / 2);
    }
    @Override
    protected float perimetro() {
        return (this.base + 2 * hipotenusa());
    }
    protected float hipotenusa(){
        return ((float)(Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.altura, 2))));
    }
    protected String tipo(){
        if (this.base == hipotenusa()) {
            return("El triángulo es un triángulo isósceles rectángulo");
        } else if (this.base < hipotenusa()) {
            return("El triángulo es un triángulo obtusángulo");
        } else {
            return("El triángulo es un triángulo agudo");
        }
    }
}
