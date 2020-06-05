package dominio;

import javax.swing.ImageIcon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Esta clase es del test de los profesionales.
 * @author Usuario
 */
public class ProfesionalTest {
    /**
     * Este es el constructor de la clase.
     */
    public ProfesionalTest() {
    }
    /**
     * Este test setea los datos correctos de la graduacion.
     */
    @Test
    private void testGetsSetsDatosCorrectosGraduacion() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento,
                fotoPerfil, tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getFechaGraduacion(), fechaGrad);
    }
    /**
     * Este test es con datos correctos, compara los paises de graduacion.
     */
    @Test
    private void testGetsDatosCorrectossVaciosPais() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento,
                fotoPerfil, tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getPaisGraduacion(), paisGraduacion);
    }
    /**
     * Este test es con datos correctos,compara los titulos.
     */
    @Test
    private void testGetsSetsDatosCorrectosTitulo() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento,
                fotoPerfil, tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getTituloProfesional(), tituloProf);
    }
    /**
     * Este test compara el to string.
     */
    @Test
    private void testToStringDatosCorrectos() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento,
                fotoPerfil, tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = nombre + " " + apellido;
        assertEquals(prof.toString(), toStringEperado);
    }
    /**
     * Este test tiene el to stringo null.
     */
    @Test
    private void testToStringDatosNull() {
        String nombre = null;
        String apellido = null;
        String fechaNacimiento = null;
        ImageIcon fotoPerfil = null;
        String tituloProf = null;
        String fechaGrad = null;
        String paisGraduacion = null;
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento,
                fotoPerfil, tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Nombre no ingresado";
        assertEquals(prof.toString(), toStringEperado);
    }
    /**
     * Este test compara to string vacios.
     */
    private void testToStringDatosVacios() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "";
        String paisGraduacion = "";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento,
                fotoPerfil, tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Nombre no ingresado";
        assertEquals(prof.toString(), toStringEperado);
    }
}
