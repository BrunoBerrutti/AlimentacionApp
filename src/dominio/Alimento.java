package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 * Esta clase hace referencia a los alimentos y sus características.
 * @author Usuario
 */
public final class Alimento implements Serializable {
    /**
     * Esta variable hace referencia al nombre del alimento.
     */
    private String nombre;
    /**
     * Esta variable hace referencia al tipo de alimento.
     */
    private String tipoAlimento;
    /**
     *  Esta variable hace referencia a la lista de la composicion del alimento.
     */
    private ArrayList<ComposicionAlimento> listaNutrientesConProporcion;
    /**
     *  Esta variable hace referencia a la foto del alimento.
     */
    private ImageIcon fotoDelAlimento;
    /**
     * Este constructor es para crear un alimento.
     * @param unNombre recibe el nombre del alimento
     * @param unTipoAlimento es el tipo de alimento
     * @param listaNutrientes la lista de nutrientes del alimento
     * @param foto la foto del alimento
     */
    public Alimento(String unNombre,
            String unTipoAlimento,
            ArrayList<ComposicionAlimento> listaNutrientes,
            ImageIcon foto) {

        this.setNombre(unNombre);
        this.setTipoAlimento(unTipoAlimento);
        this.setListaNutrientesConProporcion(listaNutrientes);
        this.setFotoDelAlimento(foto);
    }
    /**
     * Devuelve el nombre del alimento.
     * @return this.nombre, retorna el nombre
     */
    public String getNombre() {
        return this.nombre;
    }
    /**
     * Este metodo setea el nombre.
     * @param unNombre es el nombre por el cual se va a modificar
     */
    public void setNombre(String unNombre) {
        if (unNombre == null || unNombre.isEmpty()) {
            this.nombre = "Nombre de alimento no ingresado";
        } else {
            this.nombre = unNombre;
        }
    }
    /**
     * Este metodo devuelve el tipo de alimento.
     * @return this.tipoAlimento, es decir devuelve el tipo de alimento
     */
    public String getTipoAlimento() {
        return this.tipoAlimento;
    }
    /**
     * Este metodo setea el tipo de alimento, es decir lo modifica.
     * @param ta es por el tipo de alimento que se va modificar el anterior.
     */
    public void setTipoAlimento(String ta) {
        tipoAlimento = ta;
    }
    /**
     * Este metodo obtiene la lista de nutrientes.
     * @return retorna una nueva lista vacia, o la lista con los nutientes
     */
    public ArrayList<ComposicionAlimento> getListaNutrientesConProporcion() {
        if (this.listaNutrientesConProporcion.isEmpty()) {
            return new ArrayList<>();
        } else {
            return this.listaNutrientesConProporcion;
        }
    }
    /**
     * Este metodo modifica la lista de nutrientes.
     * @param listaNutrientes es la nueva lista por la cual se va a modificar
     */
    public void setListaNutrientesConProporcion(ArrayList<ComposicionAlimento>
            listaNutrientes) {
        if (listaNutrientes == null) {
            this.listaNutrientesConProporcion = new ArrayList<>();
        } else {
            this.listaNutrientesConProporcion = listaNutrientes;
        }
    }
    /**
     * Retorna la foto del alimento.
     * @return this.fotoDelAlimento es decir, retorna la foto
     */
    public ImageIcon getFotoDelAlimento() {
        return this.fotoDelAlimento;
    }
    /**
     * Este metodo modifica la foto del alimento.
     * @param foto es la foto por la cual se va a modificar
     */
    public void setFotoDelAlimento(ImageIcon foto) {
        if (foto == null) {
            this.fotoDelAlimento = new ImageIcon(getClass().
                    getResource("/Imagenes/fotoDelAlimentoEstandar.png"));
        } else {
            this.fotoDelAlimento = foto;
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    @Override
    public boolean equals(Object obj) {
        Alimento otroAlimento = (Alimento) obj;
        return (this.getNombre().equals(otroAlimento.getNombre()));
    }

}
