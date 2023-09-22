package mamiferos;

public class Perro {
    public String nombre;
    public String raza;
    public int edad;
    public float altura;

    /**
     * Constructor de Perro
     * @param nombre ->cadena
     * @param raza ->cadena
     * @param edad -> entero en años
     * @param altura -> altura en centimetros
     * @param dueno -> nombre del responsable
     */
    public Perro(String nombre, String raza, int edad, float altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
    }

    public Perro() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
        this.altura = 0;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", altura=" + altura + "]";
    }
    
}
