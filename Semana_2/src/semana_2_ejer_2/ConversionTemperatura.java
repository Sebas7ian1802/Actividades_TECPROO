package semana_2_ejer_2;

public class ConversionTemperatura {
    private double gradosCentigrados;

    public ConversionTemperatura(double gradosCentigrados) {
        this.gradosCentigrados = gradosCentigrados;
    }

    public double calcularFahrenheit() {
        return (this.gradosCentigrados * 9 / 5) + 32;
    }
}