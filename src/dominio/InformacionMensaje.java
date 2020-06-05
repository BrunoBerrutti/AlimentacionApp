package dominio;

import java.io.Serializable;
/**
 * Esta clase mantiene toda la informacion respecto al mensaje.
 * @author Usuario
 */
public final class InformacionMensaje implements Serializable {
    /**
     * Esta variable hace referencia al mensaje.
     */
    private String mensaje;
    /**
     * Esta variable hace referencia al destinatario.
     */
    private String destinatario;
    /**
     * Esta variable hace referencia al remitente.
     */
    private String remitente;
    /**
     * Este es el constructor de la clase.
     * @param elRemitente aca recibe el remitente del mensaje
     * @param dst aca recibe el destinatario del mensaje
     * @param elMensaje este es el mensaje
     */
   public InformacionMensaje(String elRemitente, String dst, String elMensaje) {
        setRemitente(elRemitente);
        setDestinatario(dst);
        setMensaje(elMensaje);
    }
   /**
    * Este metodo devuelve el mensaje.
    * @return retorna un string
    */
    public String getMensaje() {
        return mensaje;
    }
    /**
     * Este metodo modifica el mensaje.
     * @param elMensaje este es el nuevo mensaje
     */
    public void setMensaje(String elMensaje) {
        mensaje = elMensaje;
    }
    /**
     * Este metodo devuelve el destinatario.
     * @return retorna un string
     */
    public String getDestinatario() {
        return destinatario;
    }
    /**
     * Este metodo modifica el destinatario.
     * @param elDestinatario este es el nuevo destinatario
     */
    public void setDestinatario(String elDestinatario) {
        destinatario = elDestinatario;

    }
    /**
     * Este metodo retorna el remitente.
     * @return retorna un string
     */
    public String getRemitente() {
        return remitente;
    }
    /**
     * Este metodo modifica el remitente.
     * @param elRemitente este es el nuevo remitente
     */
    public void setRemitente(String elRemitente) {
        this.remitente = elRemitente;
    }
    /**
     * Este metodo intercambia el remitente.
     */
    public void intercambiarRemitente() {
        String aux = destinatario;
        destinatario = remitente;
        remitente = aux;
    }

    @Override
    public String toString() {
        return getRemitente() + ": \n" + getMensaje();
    }

}
