
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Área del rectángulo:    A = b * h
Perímetro del rectángulo:   P = 2 * b + 2 * h

* Donde b es la base y h es el altura del rectángulo.
 */
public class Rectangulo extends PoligonoRegular{
    
    public Rectangulo() {
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return base * 2 + altura * 2;
    }
    
}
