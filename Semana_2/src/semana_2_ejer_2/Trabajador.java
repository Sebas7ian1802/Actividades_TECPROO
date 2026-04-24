package semana_2_ejer_2;

public class Trabajador {
    private String nombre;
    private double precioHora;
    private int horasTrabajadas;

    public Trabajador(String nombre, double precioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // ¡Agregamos el Getter para el nombre!
    public String getNombre() {
        return this.nombre;
    }

    public double calcularSalarioBruto() {
        return this.precioHora * this.horasTrabajadas;
    }

    public double calcularImpuesto() {
        return calcularSalarioBruto() * 0.10;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularImpuesto();
    }
}