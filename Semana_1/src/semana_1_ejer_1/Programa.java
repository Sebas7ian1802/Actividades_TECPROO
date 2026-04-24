package semana_1_ejer_1;

public class Programa {
    public static void main(String[] args) {
        
        // controlador
        ProductoController tienda = new ProductoController();
        
        // productos
        Producto prod1 = new Producto(101, "Laptop Lenovo", 2500.50, 10);
        Producto prod2 = new Producto(102, "Mouse Inalámbrico", 45.00, 50);
        Producto prod3 = new Producto(103, "Teclado Mecánico", 120.00, 25);
        
        // Agregamos productos
        tienda.agregarProducto(prod1);
        tienda.agregarProducto(prod2);
        tienda.agregarProducto(prod3);
        
        // Listamos productos
        tienda.listarProductos();
        
        // Buscamos por específico
        System.out.println("Buscando el producto con ID 102...");
        Producto encontrado = tienda.buscarProductoPorId(102);
        
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.toString());
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}