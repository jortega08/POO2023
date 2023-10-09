import java.text.DateFormat;

public class Menu extends Lugar {
    private String bebidaAlcohol;
    private String bebdidaNoAlcohol;
    private String platosCasa;
    private String comidaRapida;
    private String postres;
    
    
    public Menu(String nombre, String categoria, String ubicacion, String[] servicio, DateFormat horarioAtencion,
            float puntajeReseñas, String bebidaAlcohol, String bebdidaNoAlcohol, String platosCasa, String comidaRapida,
            String postres) {
        super(nombre, categoria, ubicacion, servicio, horarioAtencion, puntajeReseñas);
        this.bebidaAlcohol = bebidaAlcohol;
        this.bebdidaNoAlcohol = bebdidaNoAlcohol;
        this.platosCasa = platosCasa;
        this.comidaRapida = comidaRapida;
        this.postres = postres;
    }
    public Menu() {
        this.bebidaAlcohol = "";
        this.bebdidaNoAlcohol = "";
        this.platosCasa = "";
        this.comidaRapida = "";
        this.postres = "";

    }
    public String getBebidaAlcohol() {
        return bebidaAlcohol;
    }
    public String getBebdidaNoAlcohol() {
        return bebdidaNoAlcohol;
    }
    public String getPlatosCasa() {
        return platosCasa;
    }
    public String getComidaRapida() {
        return comidaRapida;
    }
    public String getPostres() {
        return postres;
    }

    public void setBebidaAlcohol(String bebidaAlcohol) {
        this.bebidaAlcohol = bebidaAlcohol;
    }
    public void setBebdidaNoAlcohol(String bebdidaNoAlcohol) {
        this.bebdidaNoAlcohol = bebdidaNoAlcohol;
    }
    public void setPlatosCasa(String platosCasa) {
        this.platosCasa = platosCasa;
    }
    public void setComidaRapida(String comidaRapida) {
        this.comidaRapida = comidaRapida;
    }
    public void setPostres(String postres) {
        this.postres = postres;
    }
    @Override
    public String toString() {
        return "Menu [bebidaAlcohol=" + bebidaAlcohol + ", bebdidaNoAlcohol=" + bebdidaNoAlcohol + ", platosCasa="
                + platosCasa + ", comidaRapida=" + comidaRapida + ", postres=" + postres + "]";
    }

    

}
