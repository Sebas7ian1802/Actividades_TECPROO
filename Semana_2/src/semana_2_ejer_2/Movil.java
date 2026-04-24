package semana_2_ejer_2;

public class Movil {
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion;

    public Movil(double velocidadInicial, double tiempo, double aceleracion) {
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo;
        this.aceleracion = aceleracion;
    }

    public double calcularEspacio() {
        return (this.velocidadInicial * this.tiempo) + (0.5 * this.aceleracion * Math.pow(this.tiempo, 2));
    }
}