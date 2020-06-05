package dominio;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Esta clase es del test de la informacion de los mensajes.
 * @author Usuario
 */
public class InformacionMensajeTest {
    /**
     * Este es el constructor de la clase.
     */
    public InformacionMensajeTest() {
    }
    /**
     * Este test setea los remitente en null.
     */
    @Test
    private void testGetsSetsNullRemitente() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente,
                destinatario, mensaje);
        assertEquals(info.getRemitente(), "Remitente no ingresado");
    }
    /**
     * Este test setea en null el mensaje.
     */
    @Test
    private void testGetsSetsNullMensaje() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente,
                destinatario, mensaje);
        assertEquals(info.getMensaje(), mensaje);
    }
    /**
     * Este test setea en null el to string.
     */
    @Test
    private void testGetsSetsNullToString() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente,
                destinatario, mensaje);
        String esperadoToString = "Remitente no ingresado" + ": \n" + mensaje;
        assertEquals(info.toString(), esperadoToString);
    }
    /**
     * Este test setea strings vacios en el remitente.
     */
    @Test
    private void testGetsSetsStringsVaciosRemitente() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente,
                destinatario, mensaje);
        assertEquals(info.getRemitente(), "Remitente no ingresado");
    }
    /**
     * Este test setea strings vacios en el destinatario.
     */
    @Test
    private void testGetsSetsStringsVaciosDestinatario() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente,
                destinatario, mensaje);
        assertEquals(info.getDestinatario(), "Destinatario no ingresado");
    }
    /**
     * Este test setea strings vacios en el mensaje.
     */
    @Test
    private void testGetsSetsStringsVaciosMensaje() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente,
                destinatario, mensaje);
        assertEquals(info.getMensaje(), mensaje);
    }
    /**
     * Este test setea strings vacios en el to string.
     */
    @Test
    private void testGetsSetsStringsVaciosToString() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente,
                destinatario, mensaje);
        String esperadoToString = "Remitente no ingresado" + ": \n" + mensaje;
        assertEquals(info.toString(), esperadoToString);
    }

}
