import java.util.Vector;

public class Usuario {

    private String user;
    private String passw;

    public Usuario(String user, String passw) {
        this.user = user;
        this.passw = passw;
    }

    // Métodos getters para obtener el usuario y la contraseña
    public String getUser() {
        return user;
    }

    public String getPassw() {
        return passw;
    }

    // Vector para almacenar los objetos de usuario
    private static Vector<Usuario> datos = new Vector<Usuario>();

    // Método para agregar un objeto Usuario al vector
    public static void agregar(Usuario obj) {
        datos.addElement(obj);
    }

    // Método para eliminar un objeto Usuario del vector
    public static void eliminar(int pos) {
        datos.removeElementAt(pos);
    }

    // Método para mostrar todos los objetos Usuario en el vector
    public static Vector<Usuario> mostrar() {
        return datos;
    }

    // Otros métodos para la gestión de usuarios, como buscar, actualizar, etc., pueden agregarse aquí según sea necesario.
}

