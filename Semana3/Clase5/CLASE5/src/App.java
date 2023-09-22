import mamiferos.Mascota;
import mamiferos.Michines;
import mamiferos.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal("Firulay", "canino", 4, 0.8f);
        System.out.println(animal1.toString());
        animal1.cambiaredad(5);
        System.out.println("La edad en meses es: "+ animal1.obteneredad()*12);

        Mascota lucas= new Mascota("Lucas", "Criollo", 4, 80.4f, "Camilo");
        System.out.println(lucas);

        lucas.cambiarEdad(3);
        System.out.println(lucas);

        Michines garfield = new Michines("Garfield", "Anaranjado", "Angora", 7, 28f, "Estefa");
        System.out.println(garfield);
        
    }
}
