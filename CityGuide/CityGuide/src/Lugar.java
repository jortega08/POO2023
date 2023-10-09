import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Lugar {
    public String nombre;
    public String categoria;
    public String ubicacion;
    public String [] servicio;
    public DateFormat horarioAtencion = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public float puntajeReseñas;

    public Lugar() {
        this.nombre = "";
        this.categoria = "";
        this.ubicacion = "";
        this.servicio = new String [0];
        this.horarioAtencion = null;
        this.puntajeReseñas = 0;
    }

    public Lugar(String nombre, String categoria, String ubicacion, String[] servicio, DateFormat horarioAtencion,
            float puntajeReseñas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.servicio = servicio;
        this.horarioAtencion = horarioAtencion;
        this.puntajeReseñas = puntajeReseñas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String[] getServicio() {
        return servicio;
    }

    public void setServicio(String[] servicio) {
        this.servicio = servicio;
    }

    public DateFormat getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(DateFormat horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public float getPuntajeReseñas() {
        return puntajeReseñas;
    }

    public void setPuntajeReseñas(float puntajeReseñas) {
        this.puntajeReseñas = puntajeReseñas;
    }

    @Override
    public String toString() {
        return "Lugar [nombre=" + nombre + ", categoria=" + categoria + ", ubicacion=" + ubicacion + ", servicio="
                + Arrays.toString(servicio) + ", horarioAtencion=" + horarioAtencion + ", puntajeReseñas="
                + puntajeReseñas + "]";
    }
    
}
