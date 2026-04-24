package semana_2_ejer_2;

public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double calcularArea() {
        return (this.cateto1 * this.cateto2) / 2;
    }

    public double calcularHipotenusa() {
        
        return Math.hypot(this.cateto1, this.cateto2); 
    }

    public double calcularPerimetro() {
        return this.cateto1 + this.cateto2 + calcularHipotenusa();
    }
}