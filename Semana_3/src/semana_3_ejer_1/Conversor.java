package semana_3_ejer_1;

public class Conversor {
    // Recibe double: Celsius a Fahrenheit
    public double convertir(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Recibe float: Kilómetros a Millas
    public double convertir(float kilometros) {
        return kilometros * 0.621371;
    }
    // Recibe int: Segundos a Minutos y Segundos
    public String convertir(int segundosTotales) {
        int minutos = segundosTotales / 60;
        int segundos = segundosTotales % 60;
        return minutos + " minutos y " + segundos + " segundos";
    }
}