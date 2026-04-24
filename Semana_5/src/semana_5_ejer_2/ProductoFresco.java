package semana_5_ejer_2;

public class ProductoFresco extends Producto {
    private String fechaDeEnvasado;
    private String paisDeOrigen;

    public ProductoFresco(String nombre, String fechaDeCaducidad, int numeroDeLote, String fechaDeEnvasado, String paisDeOrigen) {
        super(nombre, fechaDeCaducidad, numeroDeLote); 
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getFechaDeEnvasado() { return fechaDeEnvasado; }
    public void setFechaDeEnvasado(String fechaDeEnvasado) { this.fechaDeEnvasado = fechaDeEnvasado; }

    public String getPaisDeOrigen() { return paisDeOrigen; }
    public void setPaisDeOrigen(String paisDeOrigen) { this.paisDeOrigen = paisDeOrigen; }

    @Override
    public String toString() {
        return super.toString() + "\nfechaDeEnvasado=" + fechaDeEnvasado + "\npaisDeOrigen=" + paisDeOrigen;
    }
}    