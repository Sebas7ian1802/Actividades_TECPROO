package semana_5_ejer_1;

public class Circulo {
    
    protected double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calcularLongitud() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
}