package semana_5_ejer_2;

public class ProductoRefrigerado extends Producto {
    private String codigoDigesa;

    public ProductoRefrigerado(String nombre, String fechaDeCaducidad, int numeroDeLote, String codigoDigesa) {
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.codigoDigesa = codigoDigesa;
    }

    public String getCodigoDigesa() { return codigoDigesa; }
    public void setCodigoDigesa(String codigoDigesa) { this.codigoDigesa = codigoDigesa; }

    @Override
    public String toString() {
        return super.toString() + "\ncodigoDigesa=" + codigoDigesa;
    }
}