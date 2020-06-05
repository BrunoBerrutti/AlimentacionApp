package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 * Esta clase hace referencia al usuario e informacion importante del mismo.
 * @author Usuario
 */
public final class Usuario extends Persona {
    /**
     * Esta variable hace referencia a la nacionalidad.
     */
    private String nacionalidad;
    /**
     *  Esta variable hace referencia a la lista de preferencias.
     */
    private ArrayList<String> preferencias;
    /**
     *  Esta variable hace referencia a la lista de restricciones.
     */
    private ArrayList<String> restricciones;
    /**
     *  Esta variable hace referencia a la lista de alimentos ingeridos.
     */
    private ArrayList<Ingesta> alimentosIngeridos;
    /**
     * Este constructor es del usuario.
     * @param unNombre es el nombre nuevo
     * @param unApellido es el apellido nuevo
     * @param unaFechaNacimiento es la fecha de nacimiento del usuario
     * @param unaFotoDePerfil es la foto de perfil
     * @param unaNacionalidad es la nacionalidad
     * @param listaPreferencias son las preferencias
     * @param listaRestricciones son las restrincciones
     * @param listaAlimentos son los alimentos
     */
    public Usuario(String unNombre,
            String unApellido,
            String unaFechaNacimiento,
            ImageIcon unaFotoDePerfil,
            String unaNacionalidad,
            ArrayList<String> listaPreferencias,
            ArrayList<String> listaRestricciones,
            ArrayList<Ingesta> listaAlimentos) {

        this.setNombre(unNombre);
        this.setApellido(unApellido);
        this.setFechaNacimiento(unaFechaNacimiento);
        this.setFotoDePerfil(unaFotoDePerfil);
        this.setNacionalidad(unaNacionalidad);
        this.setPreferencias(listaPreferencias);
        this.setRestricciones(listaRestricciones);
        this.setAlimentosIngeridos(listaAlimentos);
    }
    /**
     * Este metodo retorna la nacionalidad.
     * @return retorna un string de la nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }
    /**
     * Este metodo modifica la nacionalidad.
     * @param unaNacionalidad esta es la nacionalidad nueva
     */
    public void setNacionalidad(String unaNacionalidad) {
        nacionalidad = unaNacionalidad;
    }
    /**
     * Este metodo devuelve la lista de preferencias.
     * @return retorna un arraylist
     */
    public ArrayList<String> getPreferencias() {
        return this.preferencias;
    }
    /**
     * Este metodo modifica las preferencias.
     * @param listaPreferencias esta es la nueva lista
     */
    public void setPreferencias(ArrayList<String> listaPreferencias) {
        if (listaPreferencias == null) {
            this.preferencias = new ArrayList<>();
        } else {
            this.preferencias = listaPreferencias;
        }
    }
    /**
     * Este metodo retorna la lista de restricciones.
     * @return retorna un arraylist
     */
    public ArrayList<String> getRestricciones() {
        return this.restricciones;
    }
    /**
     * Este metodo modifica la lista de restricciones.
     * @param listaRestricciones esta es la nueva lista de restricciones
     */
    public void setRestricciones(ArrayList<String> listaRestricciones) {
        if (listaRestricciones == null) {
            this.restricciones = new ArrayList<>();
        } else {
            this.restricciones = listaRestricciones;
        }
    }
    /**
     * Este metodo devuelve la lista de alimentos.
     * @return retorna un arraylist
     */
    public ArrayList<Ingesta> getAlimentosIngeridos() {
        return this.alimentosIngeridos;
    }
    /**
     * Este metodo modifica la lista de alimentos ingeridos.
     * @param listaAlimentos esta es la lista nueva de alimentos
     */
    public void setAlimentosIngeridos(ArrayList<Ingesta> listaAlimentos) {
        if (listaAlimentos == null) {
            this.alimentosIngeridos = new ArrayList<>();
        } else {
            this.alimentosIngeridos = listaAlimentos;
        }

    }
    /**
     * Este metodo devuelve la lista de alimentos ingeridos.
     * @return retorna la lista de alimentos
     */
    public String[] getArrayAlimentosIngeridos() {
        String[] retorno = new String[getAlimentosIngeridos().size()];
        for (int i = 0; i < getAlimentosIngeridos().size(); i++) {
            retorno[i] = getAlimentosIngeridos().get(i).toString();
        }
        return retorno;
    }
    /**
     * Este metodo devuelve la lista de restricciones.
     * @return retorna las restricciones
     */
    public String[] getArrayRestricciones() {
        String[] retorno = new String[getRestricciones().size()];
        for (int i = 0; i < getRestricciones().size(); i++) {
            retorno[i] = getRestricciones().get(i);
        }
        return retorno;
    }
    /***
     * Este metodo devuelve las preferencias.
     * @return retorna la lista de preferencias
     */
    public String[] getArrayPreferencias() {
        String[] retorno = new String[getPreferencias().size()];
        for (int i = 0; i < getPreferencias().size(); i++) {
            retorno[i] = getPreferencias().get(i);
        }
        return retorno;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    /**
     * Este metodo actualiza las preferencias del usuario.
     * @param usuario recibe el usuario
     * @param pr recibe una lista de preferencias
     */
    public void actualizarPreferenciasUsuario(Usuario usuario, ArrayList
            <String> pr) {
        usuario.setPreferencias(pr);
    }
    /**
     * Este metodo actualiza las restricciones del usuario.
     * @param usuario recibe al usuario
     * @param restricciones recibe las restrcciones
     */
    public void actualizarRestriccionesUsuario(Usuario usuario, ArrayList
            <String> restricciones) {
        usuario.setRestricciones(restricciones);
    }
}
