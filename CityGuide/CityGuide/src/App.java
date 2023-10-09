import javax.swing.JOptionPane;

public class App extends Lugar {
    public static void main(String[] args) throws Exception {
        Login usuario = new Login();

        String[] opciones = {"Registrarse", "Iniciar Sesión"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == 0) { // Registrarse
            String user = JOptionPane.showInputDialog("Ingrese su usuario");
            String passw = JOptionPane.showInputDialog("Ingrese su contraseña");

            int pos = Login.verificarUsuario(user);

            if ("".equals(user) || "".equals(passw)) {
                JOptionPane.showMessageDialog(null, "El usuario y la contraseña no pueden estar vacíos");
            } else if (pos == -1) {
                Login nuevoUsuario = new Login(user, "", passw, 0); // Supongo que la edad es 0 por defecto
                Login.agregarNuevoUsuario(nuevoUsuario);
                JOptionPane.showMessageDialog(null, "Registro completo");

                // Después de registrar al usuario, permitirle iniciar sesión automáticamente
                realizarInicioSesion(usuario, user, passw);
            } else {
                JOptionPane.showMessageDialog(null, "Este usuario ya está registrado");
            }
        } else if (seleccion == 1) { // Iniciar Sesión
            String user = JOptionPane.showInputDialog("Ingrese su usuario");
            String passw = JOptionPane.showInputDialog("Ingrese su contraseña");

            realizarInicioSesion(usuario, user, passw);
        }
    }

    // Método para realizar el inicio de sesión
    private static void realizarInicioSesion(Login usuario, String user, String passw) {
        int resultado = usuario.verificarLogueo(user, passw);

        if (resultado != -1) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            // Aquí puedes agregar la lógica para acceder a la aplicación una vez que el inicio de sesión sea exitoso.
        } else {
            JOptionPane.showMessageDialog(null, "Los parámetros son incorrectos, intente de nuevo");
        }
    }
}
