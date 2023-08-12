/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* Lo que tiene en comun todas las figuras geometricas, y lo heredan desde aca.
* entre el rectangulo, triangulo y circulo, no comparten cosas en comun solo el calcular area y perimetro
 */
public abstract class Figura {
    /*
    Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro de una
    figura geométrica genérica.
    */
    
    
    public abstract double area();
    
    public abstract double perimetro();
    

}
