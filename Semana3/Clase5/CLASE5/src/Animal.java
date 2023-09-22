public class Animal {
    private String nombre;
    private String raza;
    private int edad;
    private float altura;

    /**
     * Constructor de la clase Animal con todos los atributos
     * @param nombre -> cadena
     * @param raza -> cadena
     * @param edad -> entero
     * @param altura -> flotante
     */
    public Animal(String nombre, String raza, int edad, float altura){
        this.nombre = nombre;
        this.raza = raza;
        this.edad= edad;
        this.altura = altura;
    }

    public Animal(){
        this.nombre = "";
        this.raza = "";
        this.edad= 0;
        this.altura = 0;
    }

    /**
     * Metodo publico para cambiar la edad de mi animal
     * @param edad -> entero
     */
    public void cambiaredad (int edad){
        this.edad = edad;
    }

    /**
     * Metodo para regresar la edad de mi animal
     * @return
     */
    public int obteneredad(){
        return this.edad;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", altura=" + altura + "]";
    }

    
}
