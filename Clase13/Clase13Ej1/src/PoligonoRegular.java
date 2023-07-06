
/**
* Lo que tienen en comun el rectangulo y el triangulo y lo heredan desde aca.
* base y altura en rectangulo y triangulo
 */
public abstract class PoligonoRegular extends Figura {
    
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
