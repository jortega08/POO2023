public class Perro extends Animal {

    private String nombre, raza, dueno;

    public Perro() {
        super();
        this.nombre = "";
        this.raza = "";
        this.dueno = "";
    }

    public Perro(String color, int edad, float altura, String nombre, String raza, String dueno) {
        super(color, edad, altura);
        this.nombre = nombre;
        this.raza = raza;
        this.dueno = dueno;
    }

    public void ladrar(){
        System.out.println("Guau, Guau, Grrr...!!");
    }

    public void sentarse(){
        System.out.println("El perro esta sentado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return super.toString()+"Perro [nombre=" + nombre + ", raza=" + raza + ", dueno=" + dueno + "]";
    }
    
}