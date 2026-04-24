package semana_1_ejer_3;

public class ProgramaLibro {
    public static void main(String[] args) {
        
        // Iniciamos la biblioteca
        LibroController biblioteca = new LibroController();

        // Creamos los libros
        Libro lib1 = new Libro("ISBN-001", "Cien Años de Soledad", "Gabriel García Marquez", true);
        Libro lib2 = new Libro("ISBN-002", "El Principito", "Antoine de Saint Exupery", true);
        Libro lib3 = new Libro("ISBN-003", "1984", "George Orwell", true);

        System.out.println("REGISTRANDO LIBROS...");
        biblioteca.agregarLibro(lib1);
        biblioteca.agregarLibro(lib2);
        biblioteca.agregarLibro(lib3);

        // estado inicial
        biblioteca.listarLibros();

        // Simulamos préstamos
        System.out.println("PRUEBA DE PRÉSTAMOS...");
        biblioteca.prestarLibro("ISBN-002"); // Debería funcionar
        biblioteca.prestarLibro("ISBN-002"); // Debería lanzar el mensaje de que ya está prestado
        
        // Vemos cómo cambió el inventario
        biblioteca.listarLibros();

        // Simulamos una devolución
        System.out.println("PRUEBA DE DEVOLUCIÓN...");
        biblioteca.devolverLibro("ISBN-002"); // Debería devolverlo con éxito
        
        // Vemos el inventario final
        biblioteca.listarLibros();
    }
}
