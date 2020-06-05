package dominio;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Esta clase es de los test de usuario.
 * @author Usuario
 */
public class UsuarioTest {
    /**
     * Este es el constructor vacio.
     */
    public UsuarioTest() {
    }
    /**
     * Este es el test de modificar a vacio la lista de alimentos.
     */
    @Test
    private void testGetsSetsVaciosListaAlimentos() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }
    /**
     * Este es el test de modificar a vacio las restricciones.
     */
    @Test
    private void testGetsSetsVaciosRestricciones() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }
    /**
     * Este es el test de modificar a vacio las preferencias.
     */
    @Test
    private void testGetsSetsVaciosPreferencias() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }
    /**
     * Este es el test de modificar a null el nombre.
     */
    @Test
    private void testGetsSetsNullNombre() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(usuario.getNombre(), "Nombre no ingresado");
    }
    /**
     * Este es el test de modificar a null el apellido.
     */
    @Test
    private void testGetsSetsNullApellido() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(usuario.getApellido(), "Apellido no ingresado");
    }
    /**
     * Este es el test de modificar a null la fecha de nacimiento.
     */
    @Test
    private void testGetsSetsNullFechaNacimiento() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(usuario.getFechaNacimiento(), "Fecha no ingresada");
    }
    /**
     * Este es el test de modificar a null la nacionalidad.
     */
    @Test
    private void testGetsSetsNullNacionalidad() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(usuario.getNacionalidad(), "Nacionalidad no ingresada");
    }
    /**
     * Este es el test de modificar a null la lista de alimentos.
     */
    @Test
    private void testGetsSetsNullListaAlimentos() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }
    /**
     * Este es el test de modificar a null las restricciones.
     */
    @Test
    private void testGetsSetsNullRestricciones() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }
    /**
     * Este es el test de modificar a null las preferencias.
     */
    @Test
    private void testGetsSetsNullPreferencias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

}
