package semana_5_ejer_1;



public class Cilindro extends Circulo {
 private double altura;

 public Cilindro() {
     super(); 
 }

 public Cilindro(double radio, double altura) {
     super(radio); 
     this.altura = altura;
 }

 public double getAltura() { return altura; }
 public void setAltura(double altura) { this.altura = altura; }

 
 @Override
 public double calcularArea() {
    
     return (2 * Math.PI * this.radio * this.altura) + (2 * super.calcularArea());
 }

 public double calcularVolumen() {
    
     return super.calcularArea() * this.altura;
 }

 @Override
 public String toString() {
     return "Cilindro [radio=" + radio + ", altura=" + altura + "]";
 }
}