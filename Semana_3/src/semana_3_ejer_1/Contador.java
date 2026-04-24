package semana_3_ejer_1;

public class Contador {
   
    public static int totalObjetos = 0;

    public Contador() {
        totalObjetos++;
    }

    public static void mostrarTotal() {
        System.out.println("Total de objetos Contador creados: " + totalObjetos);
    }
}