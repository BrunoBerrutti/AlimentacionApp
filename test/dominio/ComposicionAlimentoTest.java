package dominio;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Esta clase es el test de la composicion del alimento.
 * @author Usuario
 */
public class ComposicionAlimentoTest {
    /**
     * Este es el constructor de la clase.
     */
    public ComposicionAlimentoTest() {
    }
    /**
     * Este test setea en null.
     */
    @Test
    private void testGetsSetsNull() {
        ComposicionAlimento composicion = new ComposicionAlimento(null, 0);
        assertEquals(composicion.getNutriente(), "No definido");
    }
    /**
     * Este test setea en negativo.
     */
    @Test
    private void testGetsSestNegativo() {
        ComposicionAlimento composicion = new ComposicionAlimento("", -5);
        assertEquals(1, composicion.getProporcion(), 0);
    }
    /**
     * Este test setea en positivo.
     */
    @Test
    private void testGetsSestPositivo() {
        ComposicionAlimento composicion = new ComposicionAlimento("Papa", 5);
        assertEquals(1, composicion.getProporcion(), 5);
    }
    /**
     * este test setea datos correctos.
     */
    @Test
    private void testGetsSestDatoCorrecto() {
        ComposicionAlimento composicion = new ComposicionAlimento("Papa", 5);
        assertEquals(composicion.getNutriente(), "Papa");
    }

}
