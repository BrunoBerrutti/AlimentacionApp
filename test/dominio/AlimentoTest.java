package dominio;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
/**
 * Esta clase es del test del alimento.
 * @author Usuario
 */
public class AlimentoTest {
    /**
     * Este es el constructor de la clase.
     */
    public AlimentoTest() {
    }
    /**
     * Este test setea en null el tipo.
     */
    @Test
    private void testSetsGetsNullTipo() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertEquals(alimentoTest.getTipoAlimento(), "No definido");
    }
    /**
     * Este test setea en null la lista de nutrientes.
     */
    @Test
    private void testSetsGetsNullListaNutrientes() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion().size(), 0);
    }
    /**
     * Este test setea datos correctos en nombre.
     */
    @Test
    private void testSetsGetsDatosCorrectosNombre() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura",
                listaComposicion, null);
        assertEquals(alimentoTest.getNombre(), "Papa");
    }
    /**
     * Este test setea datos correctos en tipo.
     */
    @Test
    private void testSetsGetsDatosCorrectosTipo() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura",
                listaComposicion, null);
        assertEquals(alimentoTest.getTipoAlimento(), "Verdura");
    }
    /**
     * Este test setea datos correctos en nutrientes.
     */
    @Test
    private void testSetsGetsDatosCorrectosNutrientes() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura",
                listaComposicion, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion(),
                listaComposicion);
    }
    /**
     * Este test setea la lista de nutrientes datos vacios.
     */
    @Test
    private void testSetsGetsListaNutrientesDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion().size(), 0);
    }
    /**
     * Este test setea el nombre vacio.
     */
    @Test
    private void testSetsGetsNombreDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getNombre(),
                "Nombre de alimento no ingresado");
    }
    /**
     * Este test setea el tipo de datos vacios.
     */
    @Test
    private void testSetsGetsTipoDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getTipoAlimento(), "No definido");
    }
    /**
     * Este test setea en el to string el nombre en null.
     */
    @Test
    private void testToStringNullNombre() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getNombre(),
                "Nombre de alimento no ingresado");
    }
    /**
     * Este test es el to string en null.
     */
    @Test
    private void testToStringNull() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.toString(),
                "Nombre de alimento no ingresado");
    }
    /**
     * Este test es el to string con datos correctos.
     */
    @Test
    private void testToStringDatosCorrectos() {
        Alimento alimentoTest = new Alimento("Papa", "", null, null);
        assertEquals(alimentoTest.toString(), "Papa");
    }
    /**
     * Este test es de equals iguales.
     */
    @Test
    private void testEqualsIguales() {
        Alimento alimentoTest = new Alimento("Papa", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);
        assertEquals(alimentoTest, alimentoTest2);
    }
    /**
     * Este test es con equals diferentes.
     */
    @Test
    private void testEqualsDiferentes() {
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);
        boolean sonIguales = alimentoTest.equals(alimentoTest2);
        assertFalse(sonIguales);
    }

}
