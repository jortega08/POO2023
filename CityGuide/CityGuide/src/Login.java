import java.util.Vector;

public class Login {
    private String user;
    private String mail;
    private String passw;
    private int edad;

    public Login(String user, String mail, String passw, int edad) {
        this.user = user;
        this.mail = mail;
        this.passw = passw;
        this.edad = edad;
    }

    public Login() {
        this.user = "";
        this.mail = "";
        this.passw = "";
        this.edad = 0;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int verificarUsuario(String usuario) {
        Vector<Login> lista = mostrar();
        Login obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = lista.elementAt(i);
            if (obj.getUser().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogueo(String usuario, String contraseña) {
        Vector<Login> lista = mostrar();
        Login obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = lista.elementAt(i);
            if (obj.getUser().equalsIgnoreCase(usuario) && obj.getPassw().equalsIgnoreCase(contraseña)) {
                return i;
            }
        }
        return -1;
    }

    public static Vector<Login> mostrar() {
        return datos;
    }

    // Nuevo método para agregar un nuevo usuario al vector
    public static void agregarNuevoUsuario(Login nuevoUsuario) {
        datos.addElement(nuevoUsuario);
    }

    private static Vector<Login> datos = new Vector<Login>();
}

