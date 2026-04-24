package semana_2_ejer_2;

public class Numero {
    private double numeroReal;

    public Numero(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    public double calcularCuadrado() {
        return Math.pow(this.numeroReal, 2);
    }

    public double calcularCubo() {
        return Math.pow(this.numeroReal, 3);
    }
}