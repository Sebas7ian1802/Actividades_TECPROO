package semana_3_ejer_1;

public class Auto {
    
    // Clase Anidada
    public class Motor {
        public String obtenerTipo() {
            return "V8 Hibrido";
        }
    }

    public void mostrarMotor() {
        Motor miMotor = new Motor();
        System.out.println("El auto tiene un motor tipo: " + miMotor.obtenerTipo());
    }
}