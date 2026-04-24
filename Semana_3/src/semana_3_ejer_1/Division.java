package semana_3_ejer_1;

public class Division {
    public void dividirSeguro(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("El resultado de la division es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERROR MATEMATICO: No existe la division por cero.");
        }
    }
}