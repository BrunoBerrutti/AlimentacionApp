package dominio;

import dominio.Sistema.DiasDeLaSemana;
import dominio.Sistema.IngestasPorDia;
import dominio.Sistema.Preferencias;
import dominio.Sistema.Restricciones;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Esta clase es la de pruebas del sistema.
 * @author Usuario
 */
public class SistemaTest {
    /**
     * Este es el constructor.
     */
    public SistemaTest() {

    }

    /**
     * Este es el test de modificar a null la lista de alimentos.
     */
    @Test
    private void testGetsSetsNullListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales,
        listaAlimentos, listaPlanesAlimentacion, listaConversaciones,
                personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }
    /**
     * Este es el test de modificar a null la lista de planes.
     */
    @Test
    private void testGetsSetsNullListaPlanes() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales,
        listaAlimentos, listaPlanesAlimentacion, listaConversaciones,
                personaLogueada);
        assertEquals(sistemaATestear.getListaPlanesAlimentacion().size(), 0);
    }
    /**
     * Este es el test de modificar null la lista de conversaciones.
     */
    @Test
    private void testGetsSetsNullListaConversaciones() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales,
                listaAlimentos, listaPlanesAlimentacion, listaConversaciones,
                personaLogueada);
        assertEquals(sistemaATestear.getListaConversaciones().size(), 0);
    }
    /**
     * Este es el test de modificar a null la persona logueada.
     */
    @Test
    private void testGetsSetsNullPersonaLogueada() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales,
                listaAlimentos, listaPlanesAlimentacion, listaConversaciones,
                personaLogueada);
        Persona personaLogueadaEsperada = new Usuario(null, null, null, null,
                null, null, null, null);
        assertEquals(sistemaATestear.getPersonaLogueada(),
                personaLogueadaEsperada);
    }
    /**
     * Este es el test de modificar a vacio la lista de usuarios.
     */
    @Test
    private void testGetsSetsDatosVaciosListaUsuarios() {
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.getListaUsuarios().size(), 0);
    }
    /**
     * Este es el test de modificar a vacio la lista de alimentos.
     */
    @Test
    private void testGetsSetsDatosVaciosListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario(null, null, null, null, null,
                null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales,
        listaAlimentos, listaPlanesAlimentacion, listaConversaciones,
                personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }
    /**
     * Este es el test de agregar mensaje a conversacion vacia.
     */
    @Test
    private void testAgregarMensajeConversacionListaVacia() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        boolean pudeAgregarMensaje = sistemaATestear.
             agregarMensajeConversacion("Martin", "Lucia", "aa", false, false);
        assertFalse(pudeAgregarMensaje);
    }
    /**
     * Este es el test de agregar mensaje a conversacion null.
     */
    @Test
    private void testAgregarMensajeConversacionNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        boolean pudeAgregarMensaje = sistemaATestear.
        agregarMensajeConversacion(null, null, "Segundo mensaje", false, false);
        assertFalse(pudeAgregarMensaje);
    }
    /**
     * Este es el test de devolver un alimento null.
     */
    @Test
    private void testDevolverAlimentoNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Alimento alimentoEsperado = new Alimento(null, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(null),
                alimentoEsperado);
    }
    /**
     * Este es el test de devolver un alimento con datos vacio.
     */
    @Test
    private void testDevolverAlimentoDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Alimento alimentoEsperado = new Alimento("", "", null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(""),
                alimentoEsperado);
    }
    /**
     * Este es el test de devolver un alimento con datos correctos.
     */
    @Test
    private void testDevolverAlimentoDatosCorrectos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null,
                null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre("Papa"),
                alimentoEsperado);
    }
    /**
     * Este es el test de devolver un alimento con datos erroneos.
     */
    @Test
    private void testDevolverAlimentoDatosErroneos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null,
                null, null);
        assertNotEquals(sistemaATestear.devolverAlimentoDadoNombre("Luca"),
                alimentoEsperado);
    }
    /**
     * Este es el test de devolver un usuario por nombre null.
     */
    @Test
    private void testUsuarioDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null,
                null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(null),
                usuarioEsperado);
    }
    /**
     * Este es el test de devolver profesionales por nombre null.
     */
    @Test
    private void testProfesionalDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Profesional profesionalEsperado = new Profesional(null, null, null,
                null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(null),
                profesionalEsperado);
    }
    /**
     * Este es el test de devolver profesionales con datos vacios.
     */
    @Test
    private void testDevolverProfesionalPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Profesional profesionalEsperado = new Profesional(null, null, null,
                null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(""),
                profesionalEsperado);
    }
    /**
     * Este es el test de devolver profesionales por datos erroneos.
     */
    @Test
    private void testDevolverProfesionalPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Profesional profesionalEsperado = new Profesional("Martin", null, null,
                null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(profesionalEsperado);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"),
                profesionalEsperado);
    }
    /**
     * Este es el test de devolver usuarios por datos vacios.
     */
    @Test
    private void testDevolverUsuarioPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null,
                null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(""),
                usuarioEsperado);
    }
    /**
     * Este es el test de devolver usuarios por nombre de datos erroneos.
     */
    @Test
    private void testDevolverUsuarioPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuario = new Usuario("Martin", null, null, null, null, null,
                null, null);
        sistemaATestear.agregarUsuarioALaLista(usuario);
        Usuario usuario2 = new Usuario(null, null, null, null, null, null, null,
                null);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"),
                usuario2);
    }
    /**
     * Este es el test de agregar planes de alimentacion con usuario null.
     */
    @Test
    private void testAgregarPlanAlimentacionUsuarioNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuario1 = null;
        Profesional profesional1 = new Profesional(null, null, null, null, null,
                null, null);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1,
                profesional1));
    }
    /**
     * Este es el test de agregar plan de alimentacion con profesional null.
     */
    @Test
    private void testAgregarPlanAlimentacionProfesionalNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null,
                null);
        Profesional profesional1 = null;
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1,
                profesional1));
    }
    /**
     * Este es el test de agregar plan de alimentacion repetido.
     */
    @Test
    private void testAgregarPlanAlimentacionRepetidos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null,
                null);
        Profesional profesional1 = new Profesional(null, null, null, null, null,
                null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1,
                profesional1));
    }
    /**
     * Este es el test de planes pendientes.
     */
    @Test
    private void testPlanesPendientes() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null,
                null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null,
                null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional1).
                length, 1);
    }
    /**
     * Este es el test de planes pendientes version2.
     */
    @Test
    private void testPlanesPendientes2() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null,
                null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null,
                null, null, null, null);
        Profesional profesional2 = new Profesional("Joaquin", "Bardanca", null,
                null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional2).
                length, 0);
    }
    /**
     * Este es el test de planes pendientes null.
     */
    @Test
    private void testPlanesPendientesNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null,
                null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null,
                null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(null).length, 0);
    }
    /**
     * Este es el test de agregar a la lista conversacion con datos erroneos.
     */
    @Test
    private void testAgregarAListaConversacionesDatosErroneos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario("Martin", null, null, null, null,
                null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales,
        listaAlimentos, listaPlanesAlimentacion, listaConversaciones,
                personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null,
                null, null, null, null);
        Persona profesionalConversacion = new Profesional("Luis", null, null,
                null, null, null, null);
        sistemaATestear.crearConversacion(usuarioConversacion,
                profesionalConversacion, "Hola", true);
        boolean agregoConversacionRepetida = sistemaATestear.
        crearConversacion(usuarioConversacion, profesionalConversacion, "Hola",
                true);
        assertFalse(agregoConversacionRepetida);
    }
    /**+
     * Este es el test de agregar ingesta con datos correctos.
     */
    @Test
    private void testAgregarIngestaDatosCorrectos() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        Ingesta ingesta1 = new Ingesta("11/02/17", null);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null,
                null, null);
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(listaIngestas,
                "11/02/16", "Papa");
        assertTrue(retorno);
    }
    /**
     * Este es el test de agregar ingesta repetida.
     */
    @Test
    private void testAgregarIngestaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null,
                null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17",
                "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.
                getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }
    /**
     * Este es el test de agregra ingesta con fecha repetida.
     */
    @Test
    private void testAgregarIngestaFechaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null,
                null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17",
                "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.
                getAlimentosIngeridos(), "11/02/17", "Papa");
        assertTrue(retorno);
    }
    /**
     * Este es el test de agregra ingesta con fecha null.
     */
    @Test
    private void testAgregarIngestaFechaNull() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta(null, listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null,
                null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, null, "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.
                getAlimentosIngeridos(), null, "Papa");
        assertFalse(retorno);
    }
    /**+
     * Este es el test de agregar ingesta de alimento repetido con fecha.
     * distinta.
     */
    @Test
    private void testAgregarIngestaAlimentoRepetidoFechaDistinta() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null,
                null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null,
                null, null);
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.
                getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }
    /**
     * Este es el test de devolver plan dado un nombre null.
     */
    @Test
    private void testDevolverPlanDadoNombreNull() {
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre(null),
                new PlanAlimentacion(null, null, null, false, null));
    }
    /**
     * Este es el test de devolver plan de datos validos.
     */
    @Test
    private void testDevolverPlanDatosValidos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan", user1,
                professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan"), plan1);
    }
    /**
     * Este es el test de devolver un plan que no pertenece.
     */
    @Test
    private void testDevolverPlanNoPertenece() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación",
                user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan").
                getNombreDelPlan(), plan1.getNombreDelPlan());
    }
    /**
     * Este es el test de atender la solicitud de plan.
     */
    @Test
    private void testAtenderSolicitudPlan() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación",
                user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.
                getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertTrue(fueAtendido);
    }
    /**
     * Este es el test de atender la solicitud de plan atendido true.
     */
    @Test
    private void testAtenderSolicitudPlanAtendidoTrue() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación",
                user1, professional1, true, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.
                getPlanDiaADia(), professional1,
                user1, "Plan de alimentación");
        assertFalse(fueAtendido);
    }
    /**
     * Este es el test de atender solicitud de plan con profesional distinto.
     */
    @Test
    private void testAtenderSolicitudPlanProfesionalDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación",
                user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        Profesional professional2 = new Profesional("Lautaro", null, null, null,
                null, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.
                getPlanDiaADia(), professional2,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }
    /**
     * Este es el test de atender solicitud de plan de usuario distinto.
     */
    @Test
    private void testAtenderSolicitudPlanUsuarioDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación",
                user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        Usuario user2 = new Usuario("Martina", null, null, null, null, null,
                null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.
                getPlanDiaADia(), professional1,
                user2, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }
    /**
     * Este es el test de atender solicitud de plan con lista vacia.
     */
    @Test
    private void testAtenderSolicitudPlanListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación",
                user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.
                getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }
    /**
     * Este es el test de la lista de planes atendidos con datos correctos.
     */
    @Test
    private void testListaPlanesAtendidosDatosCorrectos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null,
                null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación",
                user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(),
                professional1,
                user1, plan1.getNombreDelPlan());
        boolean sonIguales = sistemaATestear.planesAtendidosDelUsuario(user1)
                [0].equals(plan1.getNombreDelPlan());
        assertTrue(sonIguales);
    }
    /**
     * Este es el test de los planes atendidos con lista vacia.
     */
    @Test
    private void testListaPlanesAtendidosListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null,
                null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null,
                listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.planesAtendidosDelUsuario(user1).length,
                0);
    }
    /**
     * Este es el test de enumerar las preferencias con carnes blancas.
     */
    @Test
    private void testEnumPreferenciasCarnesBlancas() {
        String resultadoEsperado = "CarnesBlancas";
        assertEquals(Preferencias.CarnesBlancas.name(), resultadoEsperado);
    }
    /**
     * Este es el test de enumerar las preferencias con carnes roja.
     */
    @Test
    private void testEnumPreferenciasCarnesRojas() {
        String resultadoEsperado = "CarnesRojas";
        assertEquals(Preferencias.CarnesRojas.name(), resultadoEsperado);
    }
    /**
     * Este es el test de enumerar las preferencias con las verduras.
     */
    @Test
    private void testEnumPreferenciasVerduras() {
        String resultadoEsperado = "Verduras";
        assertEquals(Preferencias.Verduras.name(), resultadoEsperado);
    }
    /**
     * Este es el test de enumerar las preferencias por la fruta.
     */
    @Test
    private void testEnumPreferenciasFrutas() {
        String resultadoEsperado = "Frutas";
        assertEquals(Preferencias.Frutas.name(), resultadoEsperado);
    }
    /**
     * Este es el test de enumerar las preferencias con la harina.
     */
    @Test
    private void testEnumPreferenciasHarinas() {
        String resultadoEsperado = "Harinas";
        assertEquals(Preferencias.Harinas.name(), resultadoEsperado);
    }
    /**
     * Este es el test de enumerar las restricciones con diabetes.
     */
    @Test
    private void testEnumRestriccionesDiabetes() {
        String resultadoEsperado = "Diabetes";
        assertEquals(Restricciones.Diabetes.name(), resultadoEsperado);
    }
    /**
     * Este es el test de restricciones con veganismo.
     */
    @Test
    private void testEnumRestriccionesVeganismo() {
        String resultadoEsperado = "Veganismo";
        assertEquals(Restricciones.Veganismo.name(), resultadoEsperado);
    }
    /**
     * Este es el test de restricciones que sean intolerantes a la.
     * lactosa
     */
    @Test
    private void testEnumRestriccionesIntoleranciaLactosa() {
        String resultadoEsperado = "IntoleranciaLactosa";
        assertEquals(Restricciones.IntoleranciaLactosa.name(),
                resultadoEsperado);
    }
    /**
     * Este es el test de las restricciones con harinas.
     */
    @Test
    private void testEnumRestriccionesHarinas() {
        String resultadoEsperado = "Celiaquia";
        assertEquals(Restricciones.Celiaquia.name(), resultadoEsperado);
    }
    /**
     * Este es el test de el dia jueves.
     */
    @Test
    private void testEnumDiasSemanaJueves() {
        String resultadoEsperado = "Jueves";
        assertEquals(DiasDeLaSemana.Jueves.name(), resultadoEsperado);
    }
    /**
     * Este es el test de el dia viernes.
     */
    @Test
    private void testEnumDiasSemanaViernes() {
        String resultadoEsperado = "Viernes";
        assertEquals(DiasDeLaSemana.Viernes.name(), resultadoEsperado);
    }
    /**
     * Este es el test de el dia sabado.
     */
    @Test
    private void testEnumDiasSemanaSabado() {
        String resultadoEsperado = "Sabado";
        assertEquals(DiasDeLaSemana.Sabado.name(), resultadoEsperado);
    }
    /**
     * Este es el test de el dia domingo.
     */
    @Test
    private void testEnumDiasSemanaDomingo() {
        String resultadoEsperado = "Domingo";
        assertEquals(DiasDeLaSemana.Domingo.name(), resultadoEsperado);
    }
    /**
     * Este es el test de  el dia miercoles.
     */
    @Test
    private void testEnumDiasSemanaMiercoles() {
        String resultadoEsperado = "Miercoles";
        assertEquals(DiasDeLaSemana.Miercoles.name(), resultadoEsperado);
    }
    /**
     * Este es el test de el dia martes.
     */
    @Test
    private void testEnumDiasSemanaMartes() {
        String resultadoEsperado = "Martes";
        assertEquals(DiasDeLaSemana.Martes.name(), resultadoEsperado);
    }
    /**
     * Este es el test de el dia lunes.
     */
    @Test
    private void testEnumDiasSemanaLunes() {
        String resultadoEsperado = "Lunes";
        assertEquals(DiasDeLaSemana.Lunes.name(), resultadoEsperado);
    }
    /**
     * Este es el dia de el dia 'desayuno'.
     */
    @Test
    private void testEnumIngestasDiaDesayuno() {
        String resultadoEsperado = "Desayuno";
        assertEquals(IngestasPorDia.Desayuno.name(), resultadoEsperado);
    }
    /**
     * Este es el dia de el dia 'almuerzo'.
     */
    @Test
    private void testEnumIngestasDiaAlmuerzo() {
        String resultadoEsperado = "Almuerzo";
        assertEquals(IngestasPorDia.Almuerzo.name(), resultadoEsperado);
    }
    /**
     * Este es el test de el dia 'cena'.
     */
    @Test
    private void testEnumIngestasDiaCena() {
        String resultadoEsperado = "Cena";
        assertEquals(IngestasPorDia.Cena.name(), resultadoEsperado);
    }
    /**
     * Este es el test de devolver la lista de ingesta.
     */
    @Test
    private void testEnumDevolverListaIngestas() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Desayuno");
        listaEsperada.add("Almuerzo");
        listaEsperada.add("Cena");
        assertEquals(sistemaATestear.devolverListaIngestasDeLaSemana(),
                listaEsperada);
    }

    /**+
     * Este es el test de devolver la lista con los dias de la semana.
     */
    @Test
    private void testEnumDevolverListaDiasDeLaSemana() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Lunes");
        listaEsperada.add("Martes");
        listaEsperada.add("Miercoles");
        listaEsperada.add("Jueves");
        listaEsperada.add("Viernes");
        listaEsperada.add("Sabado");
        listaEsperada.add("Domingo");
        assertEquals(sistemaATestear.devolverListaDiasDeLaSemana(),
                listaEsperada);
    }

}
