package dominio;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * Esta clase hace referencia a la ingesta.
 * @author Usuario
 */
public final class Ingesta implements Serializable {
    /**
     * Esta variable hace referencia a la fecha de la ingesta.
     */
    private String fechaDeIngesta;
    /**
     *  Esta variable hace referencia a la lista de alimentos.
     */
    private ArrayList<Alimento> listaAlimentosPorFecha;
    /**
     * Este es el constructor de la clase.
     * @param f recibe la fecha de inegesta
     * @param la recibe la lista de alimento
     */
    public Ingesta(String f, ArrayList<Alimento> la) {
        setFechaDeIngesta(f);
        setLAPF(la);
    }
    /**
     * Este metodo devuelve la fecha de ingesta.
     * @return retorna un string
     */
    public String getFechaDeIngesta() {
        return this.fechaDeIngesta;
    }
    /**
     * Este metodo modifica la fecha de ingesta.
     * @param unaFecha esta es la nueva fecha
     */
    public void setFechaDeIngesta(String unaFecha) {
        this.fechaDeIngesta = unaFecha;
    }
    /**
     * Este metodo retorna la lista de alimentos por fecha.
     * @return retorna un arraylist
     */
    public ArrayList<Alimento> getListaAlimentosPorFecha() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return new ArrayList<>();
        } else {
            return this.listaAlimentosPorFecha;
        }
    }
    /**
     * Este metodo modifica la lista de alimentos.
     * @param list esta es la nueva lista
     */
    public void setLAPF(ArrayList<Alimento> list) {
        if (list == null || list.isEmpty()) {
            this.listaAlimentosPorFecha = new ArrayList<>();
        } else {
            this.listaAlimentosPorFecha = list;
        }
    }

    @Override
    public String toString() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return "No hay alimentos ingeridos";
        } else {
            return "Lista de alimentos ingeridos" + this.
                    getListaAlimentosPorFecha();
        }
    }

    @Override
    public boolean equals(Object obj) {
        Ingesta otraIngesta = (Ingesta) obj;
        boolean sonIguales = this.getFechaDeIngesta().equals(otraIngesta.
                getFechaDeIngesta());
        sonIguales = sonIguales && this.getListaAlimentosPorFecha().
                equals(otraIngesta.getListaAlimentosPorFecha());
        return sonIguales;
    }

}
