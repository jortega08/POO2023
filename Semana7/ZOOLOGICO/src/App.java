public class App {
    public static void main(String[] args) throws Exception {
        Perro Tomas = new Perro("cafe", 6, 80.5f, "Tomas", "Pitbull", "Camilo");
        System.out.println(Tomas.toString());
        Tomas.comer("Carne");
        Tomas.ladrar();
        Tomas.sentarse();
    }
}
