package dominio;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * Esta clase guarda la conversacion entre usuario y profesional.
 * @author Usuario
 */
public final class Conversacion implements Serializable {
    /**
     * Esta varibale hace referencia a la lista de mensajes.
     */
    private ArrayList<InformacionMensaje> listaMensajes;
    /**
     * Esta variable hace referencia al usuario.
     */
    private Persona usuario;
    /**
     * Esta variable hace referencia al profesional.
     */
    private Persona profesional;
    /**
     * Esta variable hace referencia a si fue atendida la consulta o no.
     */
    private boolean fueAtendidaConsulta;
    /**
     * Este es el constructor de la clase.
     * @param user este es el usuario
     * @param pr este es el profesional
     * @param lista estos son los mensajes
     */
    public Conversacion(Persona user, Persona pr, ArrayList
            <InformacionMensaje> lista) {
        setUsuario(user);
        setProfesional(pr);
        setListaMensajes(lista);
        setFueAtendidaConsulta(false);
    }
    /**
     * Este metodo devuelve true si fue atendida la consulta.
     * @return retorna un booleano
     */
    public boolean getFueAtendidaConsulta() {
        return fueAtendidaConsulta;
    }
    /**
     * Este metodo modifica el parametro para saber si la consulta fue atendida.
     * @param fueAtendida este es el nuevo valor del parametro
     */
    public void setFueAtendidaConsulta(boolean fueAtendida) {
        this.fueAtendidaConsulta = fueAtendida;
    }
    /**
     * Este metodo devuelve la lista de informacion del mensaje.
     * @return retorna un arraylist
     */
    public ArrayList<InformacionMensaje> getListaMensajes() {
        return this.listaMensajes;
    }
    /**
     * Este metodo modifica la lista de mensajes.
     * @param lista esta es la lista nueva
     */
    public void setListaMensajes(ArrayList<InformacionMensaje> lista) {
        if (lista == null || lista.isEmpty()) {
            this.listaMensajes = new ArrayList<>();
        } else {
            this.listaMensajes = lista;
        }
    }
    /**
     * Este metodo devuelve el usuario.
     * @return retorna una persona
     */
    public Persona getUsuario() {
        return usuario;
    }
    /**
     * Este metodo modifica el usuario.
     * @param unUsuario este es el nuevo usuario
     */
    public void setUsuario(Persona unUsuario) {
        if (unUsuario == null) {
            this.usuario = new Usuario(null, null, null, null, null, null, null,
                    null);
        } else {
            this.usuario = unUsuario;
        }
    }
    /**
     * Este metodo devuelve el profesional.
     * @return retorna una persona
     */
    public Persona getProfesional() {
        return this.profesional;
    }
    /**
    * Este metodo modifica el profesional.
    * @param unProfesional este es el nuevo profesional
    */
    public void setProfesional(Persona unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null,
                    null, null);
        } else {
            this.profesional = unProfesional;
        }
    }
    /**
     * Este metodo retorna true si agrego el mensaje.
     * @param mensaje recibe el mensaje
     * @param intercambioRemitente recibe un boolean
     * @return retorna un booleano
     */
    public boolean agregarMensaje(String mensaje,
            boolean intercambioRemitente) {
        InformacionMensaje informacion = new InformacionMensaje(getUsuario().
          getNombreCompleto(), getProfesional().getNombreCompleto(), mensaje);
        if (intercambioRemitente) {
            informacion.intercambiarRemitente();
        }
        listaMensajes.add(informacion);
        boolean agregueMensaje = true;
        return agregueMensaje;
    }

    @Override
    public boolean equals(Object obj) {
        final Conversacion conversacionParametro = (Conversacion) obj;
        return getProfesional().equals(conversacionParametro.getProfesional())
                && getUsuario().equals(conversacionParametro.getUsuario());
    }

    @Override
    public String toString() {
        String retorno = "No hay mensajes para mostrar";
        if (!getListaMensajes().isEmpty()) {
            retorno = "";
            retorno = listaMensajes.stream().map((InformacionMensaje info)
                    -> "\n" + info.getRemitente() + "\n"
                    + info.getMensaje() + "\n").reduce(retorno, String::concat);
        }
        return retorno;
    }

}
