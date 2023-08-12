
/**
Área del triángulo:     A = (1/2) * b * h
Donde b es la base del triángulo y h es la altura perpendicular a la base.

Perímetro del triángulo:    P = lado1 + lado2 + lado3
Donde lado1, lado2 y lado3 son las longitudes de los tres lados del triángulo.
 */
public class Triangulo extends PoligonoRegular {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
    }
    
    public Triangulo(double lado1, double lado2, double lado3, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public double area() {
        // Área del triángulo:     A = (1/2) * b * h
        return ((1/2) * base * altura);
    }

    @Override
    public double perimetro() {
        // Perímetro del triángulo:    P = lado1 + lado2 + lado3
        return (lado1 + lado2 + lado3);
    }
    
}
