package semana_5_ejer_2;

public class ProductoCongelado extends Producto {
    private double temperaturaDeCongelacion;

    public ProductoCongelado(String nombre, String fechaDeCaducidad, int numeroDeLote, double temperaturaDeCongelacion) {
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.temperaturaDeCongelacion = temperaturaDeCongelacion;
    }

    public double getTemperaturaDeCongelacion() { return temperaturaDeCongelacion; }
    public void setTemperaturaDeCongelacion(double temperaturaDeCongelacion) { this.temperaturaDeCongelacion = temperaturaDeCongelacion; }

    @Override
    public String toString() {
        return super.toString() + "\ntemperaturaDeCongelacion=" + temperaturaDeCongelacion;
    }
}