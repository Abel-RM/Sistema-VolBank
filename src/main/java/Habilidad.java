import java.util.Objects;

public class Habilidad {
    private String descripcion;
    private Categoria categoria;
    private int tiempo;

    public Habilidad(String descripcion, Categoria categoria, int tiempo) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.tiempo = tiempo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return tiempo == habilidad.tiempo &&
                Objects.equals(descripcion, habilidad.descripcion) &&
                categoria == habilidad.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, categoria, tiempo);
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int horas){
        tiempo += horas;
    }
}
