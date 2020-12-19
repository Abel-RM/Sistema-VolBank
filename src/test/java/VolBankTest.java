import org.junit.Assert;
import org.junit.Test;
public class VolBankTest {

    VolBank v = new VolBank();
    @Test
    public void seleccionarCategoria() {

        Assert.assertEquals(Categoria.EDUCACION , v.seleccionarCategoria("EDUCACION"));
    }

    @Test
    public void seleccionarActividad() {
        String nombre = "Abel";
        String descripcion = "clases de matematicas";
        int horas = 5;
        int cantPersonas = 1;
        v.setNombre(nombre);
        v.setDescripcion(descripcion);
        v.setHoras(horas);
        v.setCantPersonas(cantPersonas);
        Assert.assertEquals(new Actividad(nombre,descripcion,Categoria.EDUCACION,horas,cantPersonas) , v.seleccionarActividad(Categoria.EDUCACION));
    }

    @Test
    public void seleccionarHabilidad(){
        Habilidad h = new Habilidad("reparar equipos electricos",Categoria.REPARACION,5);
        Persona p = new Persona("Abel",23,"direccion",0,0);
        p.setHabilidades(h);
        Assert.assertEquals(h,v.seleccionarHabilidad(0,p));
    }

    @Test
    public void depositarTiempo(){
        Habilidad h = new Habilidad("reparar equipos electricos",Categoria.REPARACION,2);
        Assert.assertTrue(v.depositarTiempo(h,8));
    }
}