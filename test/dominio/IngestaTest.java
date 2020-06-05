package dominio;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Esta clase es sobre del test de ingesta.
 * @author Usuario
 */
public class IngestaTest {
    /**
     * Este es el constructor de la ingesta.
     */
    public IngestaTest() {

    }
    /**
     * Este test setea datos validos a la lista de alimentos.
     */
    @Test
    private void testGetsSetsDatosValidosListaAlimentos() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion,
                null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta,
                listaAlimentosPorFecha);
        assertEquals(ingestaATestear.getListaAlimentosPorFecha(),
                listaAlimentosPorFecha);
    }
    /**
     * Este test setea datos validos al to string.
     */
    @Test
    private void testGetsSetsDatosValidosToString() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion,
                null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta,
                listaAlimentosPorFecha);
        String toStringEsperado =
                "Lista de alimentos ingeridos" + listaAlimentosPorFecha;
        assertEquals(ingestaATestear.toString(), toStringEsperado);
    }
    /**
     * Este test es de equals iguales en la lista.
     */
    @Test
    private void testEqualsIgualesLista() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion,
                null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta,
                listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngesta,
                listaAlimentosPorFecha);
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertTrue(resultadoEquals);
    }
    /**
     * Este test es de equals distintos en la fecha.
     */
    @Test
    private void testEqualsDistintosFecha() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion,
                null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta,
                listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngesta,
                new ArrayList<>());
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertFalse(resultadoEquals);
    }


}
