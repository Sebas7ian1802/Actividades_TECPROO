package semana_3_ejer_1;

public class ValidarEdad {
    public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Acceso denegado: Eres menor de edad.");
        }
        System.out.println("Acceso permitido. Edad validada.");
    }
}