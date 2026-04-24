package semana_5_ejer_2;

public class Producto {
    protected String nombre;
    protected String fechaDeCaducidad;
    protected int numeroDeLote;

    public Producto(String nombre, String fechaDeCaducidad, int numeroDeLote) {
        this.nombre = nombre;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numeroDeLote = numeroDeLote;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaDeCaducidad() { return fechaDeCaducidad; }
    public void setFechaDeCaducidad(String fechaDeCaducidad) { this.fechaDeCaducidad = fechaDeCaducidad; }

    public int getNumeroDeLote() { return numeroDeLote; }
    public void setNumeroDeLote(int numeroDeLote) { this.numeroDeLote = numeroDeLote; }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\nfechaDeCaducidad=" + fechaDeCaducidad + "\nnumeroDeLote=" + numeroDeLote;
    }
}