package dominio;

import java.io.Serializable;
/**
 * Esta clase hace referencia a la composicion del alimento.
 * @author Usuario
 */
public final class ComposicionAlimento implements Serializable {
    /**
     * Esta variable hace referencia al nutriente del alimento.
     */
    private String nutriente;
    /**
     * Esta variable hace referencia a la proporcion.
     */
    private float proporcion;
    /**
     * Este es el constructor de la clase.
     * @param unNutriente recibe el nutriente
     * @param unaProporcion recibe la proporcion
     */
    public ComposicionAlimento(String unNutriente, float unaProporcion) {
        this.setNutriente(unNutriente);
        this.setProporcion(unaProporcion);
    }
    /**
     * Este metodo retorna un nutriente.
     * @return retorna un string
     */
    public String getNutriente() {
        return this.nutriente;
    }
    /**
     * Este metodo modifica un nutriente.
     * @param unNutriente este es el nuevo nutriente
     */
    public void setNutriente(String unNutriente) {
        this.nutriente = unNutriente;
    }
    /**
     * Este metodo retorna la proporcion.
     * @return retorna un float
     */
    public float getProporcion() {
        return this.proporcion;
    }
    /**
     * Este metodo modifica la proporcion.
     * @param unaProporcion esta es la nueva proporcion
     */
    public void setProporcion(float unaProporcion) {
        if (unaProporcion <= 0) {
            this.proporcion = 1;
        } else {
            this.proporcion = unaProporcion;
        }
    }
}
