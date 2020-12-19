import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private int horasDonadas;
    private int horasUsadas;
    private ArrayList<Habilidad> habilidades = new ArrayList<>();

    public Persona(String nombre, int edad, String direccion, int horasDonadas, int horasUsadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.horasDonadas = horasDonadas;
        this.horasUsadas = horasUsadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHorasDonadas() {
        return horasDonadas;
    }

    public void setHorasDonadas(int horasDonadas) {
        this.horasDonadas = horasDonadas;
    }

    public int getHorasUsadas() {
        return horasUsadas;
    }

    public void setHorasUsadas(int horasUsadas) {
        this.horasUsadas = horasUsadas;
    }

    public void setHabilidades(Habilidad habilidades) {
        this.habilidades.add(habilidades);
    }

    public ArrayList<Habilidad> getHabilidades(){
        return habilidades;
    }
}
