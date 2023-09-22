package mamiferos;

public class Gato {
    protected String nombre;
    protected String color;
    protected String raza;
    protected int edad;
    protected float altura;

    /**
     * Contructor clase gato
     * @param nombre
     * @param color
     * @param raza 
     * @param edad -> años
     * @param altura -> centimetros
     */
    public Gato(String nombre, String color, String raza, int edad, float altura) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
    }

    public Gato() {
        this.nombre = "";
        this.color = "";
        this.raza = "";
        this.edad = 0;
        this.altura = 0;
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", altura="
                + altura + "]";
    }
    
}
