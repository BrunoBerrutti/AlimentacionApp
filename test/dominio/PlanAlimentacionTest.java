package dominio;

import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Esta clase es la del test del plan de alimentacion.
 * @author Usuario
 */
public class PlanAlimentacionTest {
    /**
     * Este es el constructor de la clase.
     */
    public PlanAlimentacionTest() {
    }
    /**
     * Este test le setea null al to string.
     */
    @Test
    private void testGetsSetsNullToString() {
        String nombrePlan = null;
        Usuario usuario = null;
        Profesional profesional = null;
        boolean fueAtendido = false;
        String[][] planDiaADia = null;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional, fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), "Plan de alimentación");
    }
    /**
     * Este test setea el nombre en vacio.
     */
    @Test
    private void testGetsSetsDatosVaciosNombre() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null,
                null, null);
        Profesional profesional = new Profesional(null, null, null, null, null,
                null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), "Plan de alimentación");
    }
    /**
     * Este test setea datos vacios del usuario.
     */
    @Test
    private void testGetsSetsDatosVaciosUsuario() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null,
                null, null);
        Profesional profesional = new Profesional(null, null, null, null, null,
                null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario("", "", null, null, null, null,
                null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }
    /**
     * Este test setea datos vacios en el profesional.
     */
    @Test
    private void testGetsSetsDatosVaciosProfesional() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null,
                null, null);
        Profesional profesional = new Profesional(null, null, null, null, null,
                null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional("", "", null, null,
                null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }
    /**
     * Este test setea datos vacios en fue atendido.
     */
    @Test
    private void testGetsSetsDatosVaciosFueAtendido() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null,
                null, null);
        Profesional profesional = new Profesional(null, null, null, null, null,
                null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }
    /**
     * Este test setea dato vacios en el plan de dia a dia.
     */
    @Test
    private void testGetsSetsDatosVaciosPlanDiaADia() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        Profesional profesional = new Profesional(null, null, null, null, null,
                null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        String[][] planEsperado = new String[0][0];
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planEsperado);
    }
    /**
     * Este test setea datos vacios en el to string.
     */
    @Test
    private void testGetsSetsDatosVaciosToString() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null,
                null);
        Profesional profesional = new Profesional(null, null, null, null, null,
                null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), "Plan de alimentación");
    }
    /**
     * Este test setea datos correctos en nombre.
     */
    @Test
    private void testGetsSetsDatosCorrectosNombre() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
        new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null,
                null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), nombrePlan);
    }
    /**
     * Este test setea datos correctos en el profesional.
     */
    @Test
    private void testGetsSetsDatosCorrectosProfesional() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
                new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo",
                null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional("Alejandro",
                "Fernandez", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }
    /**
     * Este test setea datos correctos en fue atendido.
     */
    @Test
    private void testGetsSetsDatosCorrectosFueAtendido() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
                new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo",
                null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }
    /**
     * Este test setea datos correctos del usuario.
     */
    @Test
    private void testGetsSetsDatosCorrectosUsuario() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
                new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo",
                null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario("Martin", "Gómez", "11/02/98",
        new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null,
                null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }
    /**
     * Este test setea datos correctos en el plan dia a dia.
     */
    @Test
    private void testGetsSetsDatosCorrectosPlanDiaADia() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
                new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo",
                null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planDiaADia);
    }
    /**
     * Este test setea datos correctos en to string.
     */
    @Test
    private void testGetsSetsDatosCorrectosToString() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
                new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo",
                null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), nombrePlan);
    }
    /**
     * Este test es cuando los equals son iguales.
     */
    @Test
    private void testEqualsIguales() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
                new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo",
                null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear, planAComparar);
    }
    /**
     * Este test es de equals diferentes.
     */
    @Test
    private void testEqualsDiferentes() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98",
                new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo",
                null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez",
                null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan,
                usuario, profesional,
                fueAtendido, planDiaADia);
        String nombrePlan2 = "Plan 2 Dias UP";
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2,
                usuario, profesional,
                fueAtendido, planDiaADia);
        assertNotEquals(planATestear, planAComparar);
    }
}
