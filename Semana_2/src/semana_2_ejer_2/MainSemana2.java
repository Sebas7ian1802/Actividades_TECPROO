package semana_2_ejer_2;

public class MainSemana2 {
    public static void main(String[] args) {
        
        System.out.println("10 EJERCICIOS\n");

        //Triangulo
        Triangulo tri = new Triangulo(10.5, 5.0);
        System.out.println("1. Triangulo - area: " + tri.calcularArea());

        //Numero
        Numero num = new Numero(4.0);
        System.out.println("2. Numero (4.0) - Cuadrado: " + num.calcularCuadrado() + " | Cubo: " + num.calcularCubo());

        //3: Cilindro
        Cilindro cil = new Cilindro(5.0, 10.0);
        System.out.println("3. Cilindro - Volumen: " + String.format("%.2f", cil.calcularVolumen()));

        //TrianguloRectangulo
        TrianguloRectangulo triRect = new TrianguloRectangulo(3.0, 4.0);
        System.out.println("4. Triángulo Rectángulo - Área: " + triRect.calcularArea() + 
                           " | Hipotenusa: " + triRect.calcularHipotenusa() + 
                           " | Perimetro: " + triRect.calcularPerimetro());

        //ConversionTemperatura
        ConversionTemperatura temp = new ConversionTemperatura(25.0);
        System.out.println("5. Temperatura - 25° equivalen a " + temp.calcularFahrenheit() + "°F");

        //ConversionLongitud
        ConversionLongitud longi = new ConversionLongitud(10.0);
        System.out.println("6. Longitud - 10 metros son " + String.format("%.2f", longi.calcularPies()) + " pies y " + 
                           String.format("%.2f", longi.calcularPulgadas()) + " pulgadas.");

        //Producto
        Producto prod = new Producto("Laptop Gamer", 2500.00, 3200.00);
        System.out.println("7. Producto - La ganancia de vender la '" + prod.getNombre() + "' es de S/ " + prod.calcularGanancia());

        //Trabajador
        Trabajador dev = new Trabajador("Alonso", 25.5, 40);
        System.out.println("8. Trabajador - El salario neto de " + dev.getNombre() + " es de S/ " + dev.calcularSalarioNeto());

        //GasIdeal
        GasIdeal gas = new GasIdeal(298.15, 2.0, 50.0); 
        System.out.println("9. Gas Ideal - La presión calculada es: " + String.format("%.4f", gas.calcularPresion()) + " atmosferas.");

        //Movil
        Movil auto = new Movil(0, 10, 5); 
        System.out.println("10. Movil - El espacio recorrido en 10 seg es: " + auto.calcularEspacio() + " metros.");
        
    
    }
}