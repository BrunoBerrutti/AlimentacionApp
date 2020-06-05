package dominio;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Esta clase es el test de la conversacion.
 * @author Usuario
 */
public class ConversacionTest {
    /**
     * Este es el constructor de la clase.
     */
    public ConversacionTest() {
    }
    /**
     * Este test setea en null el usuario.
     */
    @Test
    private void testGetSetsNullUsuario() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario,
                profesional, listaMensajes);
        Persona usuarioEsperado = new Usuario(null, null, null, null, null,
                null, null, null);
        assertEquals(conversacionATestear.getUsuario(), usuarioEsperado);
    }
    /**
     * Este test setea en null al profesional.
     */
    @Test
    private void testGetSetsNullProfesional() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario,
                profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null,
                null, null, null);
        assertEquals(conversacionATestear.getProfesional(),
                profesionalEsperado);
    }
    /**
     * Este test setea en null la lista de mensajes.
     */
    @Test
    private void testGetSetsNullLsitaMensajes() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario,
                profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }
    /**
     * Este test setea en null el to string.
     */
    @Test
    private void testGetSetsNullToString() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario,
                profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(),
                "No hay mensajes para mostrar");
    }
    /**
     * Este test setea datos vacios en el profesional.
     */
    @Test
    private void testGetSetsDatosVaciosProfesional() {
        Persona usuario = new Usuario(null, null, null, null, null, null,
                null, null);
        Persona profesional = new Profesional(null, null, null, null, null,
                null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario,
                profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null,
                null, null, null);
        assertEquals(conversacionATestear.getProfesional(),
                profesionalEsperado);
    }
    /**
     * Este test setea datos vacios en la lista de mensajes.
     */
    @Test
    private void testGetSetsDatosVaciosListaMensajes() {
        Persona usuario = new Usuario(null, null, null, null, null, null,
                null, null);
        Persona profesional = new Profesional(null, null, null, null, null,
                null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario,
                profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }
    /**
     * Este test setea datos vacios en el to string.
     */
    @Test
    private void testGetSetsDatosVaciosToString() {
        Persona usuario = new Usuario(null, null, null, null, null, null,
                null, null);
        Persona profesional = new Profesional(null, null, null, null, null,
                null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario,
                profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(),
                "No hay mensajes para mostrar");
    }


}
