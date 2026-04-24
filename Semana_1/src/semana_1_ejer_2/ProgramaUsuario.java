package semana_1_ejer_2;

public class ProgramaUsuario {
    public static void main(String[] args) {
        
        // Inicializamos el controlador
        UsuarioController gestor = new UsuarioController();

        // 1. CREATE
        System.out.println("AGREGANDO USUARIOS");
        Usuario u1 = new Usuario(1, "Carlos", "carlos@empresa.com");
        Usuario u2 = new Usuario(2, "Neil", "neil@empresa.com");
        Usuario u3 = new Usuario(3, "Ivan", "ivan@empresa.com");

        gestor.agregarUsuario(u1);
        gestor.agregarUsuario(u2);
        gestor.agregarUsuario(u3);

        // 2. READ
        gestor.listarUsuarios();

        // 3. UPDATE
        System.out.println("ACTUALIZANDO EMAIL DEL ID 2");
        gestor.actualizarEmail(2, "neil.carreon@empresa.com"); // Simulando un cambio de correo
        gestor.listarUsuarios(); // Verificamos el cambio

        // 4. DELETE
        System.out.println("ELIMINANDO AL USUARIO ID 3");
        gestor.eliminarUsuario(3);
        gestor.listarUsuarios(); // Verificamos que ya no está en la lista
    }
}
