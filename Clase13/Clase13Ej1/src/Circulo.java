
/**
Área del círculo:   A = π * r²
Perímetro del círculo:  P = 2 * π * r

* r = radio.
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public double perimetro() {
        return (2 * Math.PI * radio);
    }
    
}
