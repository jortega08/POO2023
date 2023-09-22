public class Animal{
    
    private String nombre;
    private String raza;
    private int edad;
    private float altura;

    public Animal(String nombre, String raza, int edad, float altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
    }
    public Animal() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
        this.altura = 0;
    }

    public String getName(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }


    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", altura=" + altura + "]";
    }
    

    
}
