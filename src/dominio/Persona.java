package dominio;

import java.io.Serializable;
import javax.swing.ImageIcon;
/**
 * Esta clase tiene toda la informacion de la persona.
 * @author Usuario
 */
public abstract class Persona implements Serializable {
    /**
     * Esta variable hace referencia al nombre de la persona.
     */
    private String nombre;
    /**
     * Esta variable hace referencia al apellido.
     */
    private String apellido;
    /**
     * Esta variable hace referencia a la fecha de nacimiento.
     */
    private String fechaNacimiento;
    /**
     * Esta variable hace referencia a la foto de perfil.
     */
    private ImageIcon fotoDePerfil;
    /**
     * Este metodo retorna el nombre de la persona.
     * @return retorna un string
     */
    public String getNombre() {
        return this.nombre;
    }
    /**
     * Este metodo modifica el nombre.
     * @param unNombre este es el nuevo nombre
     */
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    /**
     * Este metodo devuelve el apellido.
     * @return retorna un string
     */
    public String getApellido() {
        return this.apellido;
    }
    /**
     * Este metodo modifica el apellido.
     * @param unApellido este es el nuevo apellido
     */
    public void setApellido(String unApellido) {
        if (unApellido == null || unApellido.isEmpty()) {
            this.apellido = "Apellido no ingresado";
        } else {
            this.apellido = unApellido;
        }
    }
    /**
     * Este metodo devuelve la fecha de nacimiento.
     * @return retorna un string
     */
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    /**
     * Este metodo modifica la fecha de nacimiento.
     * @param unaFecha esta es la nueva fecha
     */
    public void setFechaNacimiento(String unaFecha) {
        if (unaFecha == null || unaFecha.isEmpty()) {
            this.fechaNacimiento = "Fecha no ingresada";
        } else {
            this.fechaNacimiento = unaFecha;
        }
    }
    /**
     * Este metodo retorna la foto de perfil.
     * @return retorna un imageicon
     */
    public ImageIcon getFotoDePerfil() {
        return this.fotoDePerfil;
    }
    /**
     * Este metodo modifica la imagen de perfil.
     * @param foto esta es la nueva foto
     */
    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().
                    getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }
    /**
     * Este metodo devuelve el nombre completo.
     * @return retorna un string
     */
    public String getNombreCompleto() {
        String retorno;
        if (getNombre().equals("Nombre no ingresado") && getApellido().
                equals("Apellido no ingresado")) {
            retorno = "Nombre no ingresado";
        } else if (getNombre().equals("Nombre no ingresado")) {
            retorno = getApellido();
        } else if (getApellido().equals("Apellido no ingresado")) {
            retorno = getNombre();
        } else {
            retorno = getNombre() + " " + getApellido();
        }
        return retorno;
    }

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    @Override
    public boolean equals(Object obj) {
        Persona otraPersona = (Persona) obj;
        return this.getNombreCompleto().equals(otraPersona.getNombreCompleto());
    }
}
