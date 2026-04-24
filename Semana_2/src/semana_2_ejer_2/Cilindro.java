package semana_2_ejer_2;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double calcularVolumen() {
      
        return Math.PI * Math.pow(this.radio, 2) * this.altura;
    }
}
