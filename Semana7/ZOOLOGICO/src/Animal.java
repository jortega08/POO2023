public class Animal {
    private String color;
    private int edad;
    private float altura;

    public Animal() {
        this.color = "";
        this.edad = 0;
        this.altura = 0;
    }

    public Animal(String color, int edad, float altura) {
        this.color = color;
        this.edad = edad;
        this.altura = altura;
    }

    public void comer (String alimento) {
        System.out.println("El animal esta comiendo "+ alimento);
    }

    public void dormir () {
        System.out.println("El animal esta durmiendo");   
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal [color=" + color + ", edad=" + edad + ", altura=" + altura + "]";
    }

    

    
    
}
