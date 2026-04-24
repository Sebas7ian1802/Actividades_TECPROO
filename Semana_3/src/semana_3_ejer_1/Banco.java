package semana_3_ejer_1;

public class Banco {
    public static double tasaInteres = 0.05;

    public static void actualizarTasa(double nuevaTasa) {
        tasaInteres = nuevaTasa;
        System.out.println("La tasa de interes ha sido actualizada.");
    }

    public static void mostrarTasa() {
        System.out.println("Tasa de interes actual del Banco: " + (tasaInteres * 100) + "%");
    }
}