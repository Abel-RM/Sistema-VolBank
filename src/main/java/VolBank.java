public class VolBank {
    String nombre= "",descripcion = "";
    int horas = 0;
    int cantPersonas = 0;


    public Categoria seleccionarCategoria(String cat){
        switch (cat){
            case "EDUCACION":
                return Categoria.EDUCACION;
            case "HOUSEWORKING":
                return Categoria.HOUSEWORKING;
            case "REPARACION":
                return Categoria.REPARACION;
        }
        return null;
    }

    public Actividad seleccionarActividad(Categoria categoria){

        return new Actividad(nombre,descripcion,categoria,horas,cantPersonas);
    }

    public Habilidad seleccionarHabilidad(int numHabilidad, Persona persona){
        return persona.getHabilidades().get(numHabilidad);
    }

    public boolean depositarTiempo(Habilidad habilidad,int cantidadHoras){
        habilidad.setTiempo(cantidadHoras);
        if (habilidad.getTiempo() > 10)
            return false;
        else return true;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }
}
