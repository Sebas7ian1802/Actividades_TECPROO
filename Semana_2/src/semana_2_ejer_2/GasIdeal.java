package semana_2_ejer_2;

public class GasIdeal {
    private double temperatura; 
    private double numeroDeMoles; 
    private double volumen; 
    
    private final double CONSTANTE_R = 0.08206; 

    public GasIdeal(double temperatura, double numeroDeMoles, double volumen) {
        this.temperatura = temperatura;
        this.numeroDeMoles = numeroDeMoles;
        this.volumen = volumen;
    }

    public double calcularPresion() {
       
        return (this.numeroDeMoles * CONSTANTE_R * this.temperatura) / this.volumen;
    }
}