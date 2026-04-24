package semana_2_ejer_2;

public class ConversionLongitud {
    private double metros;

    public ConversionLongitud(double metros) {
        this.metros = metros;
    }

    public double calcularPies() {
        return this.metros * 3.28084;
    }

    public double calcularPulgadas() {
        return this.metros * 39.3701;
    }
}