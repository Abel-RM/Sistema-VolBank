import java.util.ArrayList;
import java.util.Objects;

public class Actividad {
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private int horas;
    private int cantPersonas;
    private ArrayList<Persona> voluntarios = new ArrayList<>();

    public Actividad(String nombre,String descripcion, Categoria categoria, int horas, int cantPersonas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.horas = horas;
        this.cantPersonas = cantPersonas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actividad actividad = (Actividad) o;
        return horas == actividad.horas &&
                cantPersonas == actividad.cantPersonas &&
                nombre.equals(actividad.nombre) &&
                descripcion.equals(actividad.descripcion) &&
                categoria == actividad.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, categoria, horas, cantPersonas, voluntarios);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public ArrayList<Persona> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Persona> voluntarios) {
        this.voluntarios = voluntarios;
    }
}
