package interfaz;

import dominio.Alimento;
import dominio.Ingesta;
import dominio.PlanAlimentacion;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Button;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Esta clase es el menú del usuario{.
 * @author Usuario
 */
public class VentanaMenuPrincipalUsuario extends javax.swing.JDialog {
    /**
     *  Esta variable hace referencia al sistema.
     */
    private Sistema sistema;
    /**
     *  Esta variable hace referencia al profesional seleccionado.
     */
    private String profesionalSeleccionado;
    /**
     *  Esta variable hace referencia a si la conversacion existe o no.
     */
    private boolean existeConversacion;
    /**
     *  Esta variable hace referencia a si es la primera vez o no.
     */
    private boolean primeraVez;
    /**
     *  Esta variable hace referencia a si es la primera ingesta o no.
     */
    private boolean primeraIngesta;
    /**
     *  Esta variable hace referencia al nombre del plan.
     */
    private String nombreDelPlan;
    /**
     *  Esta variable hace referencia al boton de cerrar el sistema.
     */
    private Button btnCerrarSistema;
    /**
     * Este metodo inicializa la ventana.
     * @param unSistema le pasa el sistema por parametro
     */
    public VentanaMenuPrincipalUsuario(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultarPaneles();
        this.sistema = unSistema;
        this.existeConversacion = false;
        this.lblValidarProfesionalPlan.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblDatosIncorrectos1.setVisible(false);
        this.lblValidarNuevoAlimento.setVisible(false);
        this.lblNuevoAlimentoVacio.setVisible(false);
        this.lblDatosIncorrectos2.setVisible(false);
        this.btnCerrarSistemaUsuarios.setVisible(true);
        this.nombreDelPlan = "";
        this.primeraVez = true;
        this.primeraIngesta = true;
        Calendar fecha = new GregorianCalendar();
        this.fechaIngestaUsuario.setMaxDate(fecha);
        this.panelVacio.setVisible(true);
        this.btnCerrarSistemaUsuarios.setVisible(true);
        this.btnCerrarSistemaUsuarios.repaint();
    }
    /**
     * Este metodo retorna el sistema.
     * @return retorna el sistema
     */
    public Sistema getSistema() {
        return sistema;
    }
    /**
     * Este metodo modifica el sistema.
     * @param unSistema recibe el sistema por el cual va a modificar
     */
    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }
    /**
     * Este metodo retorna si existe una conversacion.
     * @return retorna un booleano
     */
    public boolean getYaExisteConversacion() {
        return existeConversacion;
    }
    /**
     * Este metodo modifica el booleano existeconversacion.
     * @param existe es el booleano por el cual va a modificar el ya existente
     */
    public void setYaExisteConversacion(boolean existe) {
        this.existeConversacion = existe;
    }
    /**
     * Este metodo aun no hace nada.
     * @param evt es la variable que recibe por parametro
     */
    public void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent
            evt) {                          
    }
    /**
     * Este metodo guarda los datos en el sistema.
     */
    public void guardarDatosSistema() {
        try {
            FileOutputStream archivo = new FileOutputStream("Sistema.data");
            BufferedOutputStream buffer = new BufferedOutputStream(archivo);
            try (ObjectOutputStream objetoASerializar = new
                ObjectOutputStream(buffer)) {
                objetoASerializar.writeObject(this);
                objetoASerializar.flush();
            }
        } catch (IOException e) {

        }
    }
    /**
    * Este metodo suprime los warnings no chequeados.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lblNohayConsultas = new javax.swing.JLabel();
        lblNohayProfesionales = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnConsultaConProfesional = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblConsultaConProfesional = new javax.swing.JLabel();
        btnSolicitarPlanAlimentacion = new javax.swing.JButton();
        lblSolicitarPlanAlimentacion = new javax.swing.JLabel();
        btnIngresarAlimentoIngerido = new javax.swing.JButton();
        lblIngresarAlimentoIngerido = new javax.swing.JLabel();
        btnCerrarSistemaUsuarios = new javax.swing.JButton();
        panelDerecho = new javax.swing.JPanel();
        panelNoHayConversacionesCreadas = new javax.swing.JPanel();
        btnNuevaConversacion1 = new javax.swing.JButton();
        lblNohayConsultasTexto3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelConsultaConProfesional = new javax.swing.JPanel();
        panelConversacion = new javax.swing.JPanel();
        lblFotoProfesional = new javax.swing.JLabel();
        lblNombreProfesional = new javax.swing.JLabel();
        btnEnviarMensaje = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarConversacion = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeNuevo = new javax.swing.JTextArea();
        btnNuevaConversacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaConversaciones = new javax.swing.JList<String>();
        jLabel1 = new javax.swing.JLabel();
        panelElegirProfesional = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaElegirProfesionales = new javax.swing.JList();
        panelVerPlanAlimentacion = new javax.swing.JPanel();
        lblPlanPropuesto1 = new javax.swing.JLabel();
        lblPlanPropuesto2 = new javax.swing.JLabel();
        lblNombreDelPlan = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado2 = new javax.swing.JLabel();
        lblNombreDelProfesional = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado4 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado5 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado6 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado7 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado8 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado9 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado10 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado14 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        txtComidasMartes = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        txtComidasMiercoles = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        txtComidasJueves = new javax.swing.JTextArea();
        jScrollPane37 = new javax.swing.JScrollPane();
        txtComidasSabado = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        txtComidasLunes = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        txtComidasDomingo = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        txtComidasViernes = new javax.swing.JTextArea();
        lblAlimentoIngeridoSeleccionado11 = new javax.swing.JLabel();
        lblTituloDelProfesional = new javax.swing.JLabel();
        panelIngestaRegistradaCorrectamente = new javax.swing.JPanel();
        lblNohayConsultas1 = new javax.swing.JLabel();
        lblNohayConsultasTexto1 = new javax.swing.JLabel();
        panelAlimentoIngerido = new javax.swing.JPanel();
        fechaIngestaUsuario = new datechooser.beans.DateChooserCombo();
        lblAlimentoIngerido = new javax.swing.JLabel();
        lblAlimentoIngerido2 = new javax.swing.JLabel();
        lblFechaAlimentoIngerido = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado = new javax.swing.JLabel();
        comboAlimentosEnSistema = new javax.swing.JComboBox<String>();
        lblNuevoAlimentoIngerido = new javax.swing.JLabel();
        btnNuevaIngesta = new javax.swing.JButton();
        lblValidarNuevoAlimento = new javax.swing.JLabel();
        lblNuevoAlimentoVacio = new javax.swing.JLabel();
        lblDatosIncorrectos2 = new javax.swing.JLabel();
        panelPlanDeAlimentacion = new javax.swing.JPanel();
        lblPlanDeAlimentacion = new javax.swing.JLabel();
        btnSolicitarNuevoPlan = new javax.swing.JButton();
        panelNoHayPlanesDisponibles = new javax.swing.JPanel();
        lblNoHayPlanes = new javax.swing.JLabel();
        lblPlanSolicitadoCorrectamente1 = new javax.swing.JLabel();
        lblNoHayPlanes1 = new javax.swing.JLabel();
        panelPlanSolicitadoCorrectamente = new javax.swing.JPanel();
        lblPlanSolicitadoCorrectamente = new javax.swing.JLabel();
        lblPlanSolicitado = new javax.swing.JLabel();
        panelSolicitarNuevoPlan = new javax.swing.JPanel();
        lblCambiarPreferencias = new javax.swing.JLabel();
        comboProfesionalesEnSistema = new javax.swing.JComboBox<String>();
        lblSeleccioneProfesional1 = new javax.swing.JLabel();
        lblCambiarPreferencias3 = new javax.swing.JLabel();
        lblCambiarPreferencias2 = new javax.swing.JLabel();
        btnEditarPreferencias = new javax.swing.JButton();
        lblCambiarPreferencias4 = new javax.swing.JLabel();
        btnEditarRestricciones = new javax.swing.JButton();
        lblCambiarPreferencias5 = new javax.swing.JLabel();
        lblCambiarPreferencias6 = new javax.swing.JLabel();
        btnAceptarSolicitudPlanAlimentacion = new javax.swing.JButton();
        lblValidarProfesionalPlan = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblDatosIncorrectos1 = new javax.swing.JLabel();
        panelBuscarPlan = new javax.swing.JPanel();
        btnVerPlanesExistentes = new javax.swing.JButton();
        lblSeleccioneProfesional2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPlanesDelUsuario = new javax.swing.JList<String>();
        panelVacio = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelNoHayAlimentos = new javax.swing.JPanel();
        lblNohayConsultasTexto = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        lblNohayConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N

        lblNohayProfesionales.setBackground(new java.awt.Color(51, 51, 51));
        lblNohayProfesionales.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayProfesionales.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayProfesionales.setText("No hay profesionales creados");
        lblNohayProfesionales.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelMenu.setBackground(new java.awt.Color(58, 80, 92));
        panelMenu.setMaximumSize(new java.awt.Dimension(260, 800));
        panelMenu.setMinimumSize(new java.awt.Dimension(260, 800));
        panelMenu.setPreferredSize(new java.awt.Dimension(260, 800));

        btnConsultaConProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaConProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultaConProfesionales.png"))); // NOI18N
        btnConsultaConProfesional.setBorder(null);
        btnConsultaConProfesional.setBorderPainted(false);
        btnConsultaConProfesional.setContentAreaFilled(false);
        btnConsultaConProfesional.setFocusPainted(false);
        btnConsultaConProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaConProfesionalActionPerformed(evt);
            }
        });

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVolverAtras.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setFocusPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblConsultaConProfesional.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblConsultaConProfesional.setForeground(new java.awt.Color(153, 255, 153));
        lblConsultaConProfesional.setText("Consulta con profesional");

        btnSolicitarPlanAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarPlanAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPlanAlimentacion.png"))); // NOI18N
        btnSolicitarPlanAlimentacion.setBorder(null);
        btnSolicitarPlanAlimentacion.setBorderPainted(false);
        btnSolicitarPlanAlimentacion.setContentAreaFilled(false);
        btnSolicitarPlanAlimentacion.setFocusPainted(false);
        btnSolicitarPlanAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPlanAlimentacionActionPerformed(evt);
            }
        });

        lblSolicitarPlanAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSolicitarPlanAlimentacion.setForeground(new java.awt.Color(153, 255, 153));
        lblSolicitarPlanAlimentacion.setText("Plan de alimentación");

        btnIngresarAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngresarAlimentoIngerido.png"))); // NOI18N
        btnIngresarAlimentoIngerido.setBorder(null);
        btnIngresarAlimentoIngerido.setBorderPainted(false);
        btnIngresarAlimentoIngerido.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido.setFocusPainted(false);
        btnIngresarAlimentoIngerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngeridoActionPerformed(evt);
            }
        });

        lblIngresarAlimentoIngerido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIngresarAlimentoIngerido.setForeground(new java.awt.Color(153, 255, 153));
        lblIngresarAlimentoIngerido.setText("Ingresar alimento ingerido");

        btnCerrarSistemaUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistemaUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSistemaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistemaUsuarios.setBorderPainted(false);
        btnCerrarSistemaUsuarios.setContentAreaFilled(false);
        btnCerrarSistemaUsuarios.setFocusPainted(false);
        btnCerrarSistemaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistemaUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblConsultaConProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSistemaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(btnCerrarSistemaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        btnCerrarSistemaUsuarios.getAccessibleContext().setAccessibleDescription("");

        panelDerecho.setBackground(new java.awt.Color(51, 51, 51));
        panelDerecho.setMaximumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setMinimumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setPreferredSize(new java.awt.Dimension(800, 800));
        panelDerecho.setLayout(new java.awt.CardLayout());

        panelNoHayConversacionesCreadas.setBackground(new java.awt.Color(58, 80, 92));
        panelNoHayConversacionesCreadas.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNoHayConversacionesCreadas.setMinimumSize(new java.awt.Dimension(800, 800));

        btnNuevaConversacion1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConversacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CREARCONVER.png"))); // NOI18N
        btnNuevaConversacion1.setBorder(null);
        btnNuevaConversacion1.setBorderPainted(false);
        btnNuevaConversacion1.setContentAreaFilled(false);
        btnNuevaConversacion1.setFocusPainted(false);
        btnNuevaConversacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversacion1ActionPerformed(evt);
            }
        });

        lblNohayConsultasTexto3.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto3.setForeground(new java.awt.Color(153, 255, 153));
        lblNohayConsultasTexto3.setText("No hay conversaciones creadas");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N

        javax.swing.GroupLayout panelNoHayConversacionesCreadasLayout = new javax.swing.GroupLayout(panelNoHayConversacionesCreadas);
        panelNoHayConversacionesCreadas.setLayout(panelNoHayConversacionesCreadasLayout);
        panelNoHayConversacionesCreadasLayout.setHorizontalGroup(
            panelNoHayConversacionesCreadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayConversacionesCreadasLayout.createSequentialGroup()
                .addGroup(panelNoHayConversacionesCreadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNoHayConversacionesCreadasLayout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNoHayConversacionesCreadasLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblNohayConsultasTexto3))
                    .addGroup(panelNoHayConversacionesCreadasLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnNuevaConversacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        panelNoHayConversacionesCreadasLayout.setVerticalGroup(
            panelNoHayConversacionesCreadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayConversacionesCreadasLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblNohayConsultasTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnNuevaConversacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 242, Short.MAX_VALUE))
        );

        panelDerecho.add(panelNoHayConversacionesCreadas, "card9");

        panelConsultaConProfesional.setBackground(new java.awt.Color(58, 80, 92));
        panelConsultaConProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setMinimumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setPreferredSize(new java.awt.Dimension(800, 800));

        panelConversacion.setOpaque(false);

        lblFotoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        lblFotoProfesional.setAlignmentY(0.0F);

        lblNombreProfesional.setFont(new java.awt.Font("Levenim MT", 0, 30)); // NOI18N
        lblNombreProfesional.setForeground(new java.awt.Color(153, 255, 153));
        lblNombreProfesional.setText("Profesional");

        btnEnviarMensaje.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnEnviarMensaje.setBorder(null);
        btnEnviarMensaje.setBorderPainted(false);
        btnEnviarMensaje.setContentAreaFilled(false);
        btnEnviarMensaje.setFocusPainted(false);
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        txtMostrarConversacion.setEditable(false);
        txtMostrarConversacion.setBackground(new java.awt.Color(86, 107, 119));
        txtMostrarConversacion.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMostrarConversacion.setAutoscrolls(false);
        jScrollPane2.setViewportView(txtMostrarConversacion);

        txtMensajeNuevo.setBackground(new java.awt.Color(86, 107, 119));
        txtMensajeNuevo.setColumns(20);
        txtMensajeNuevo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMensajeNuevo.setRows(5);
        jScrollPane1.setViewportView(txtMensajeNuevo);

        javax.swing.GroupLayout panelConversacionLayout = new javax.swing.GroupLayout(panelConversacion);
        panelConversacion.setLayout(panelConversacionLayout);
        panelConversacionLayout.setHorizontalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFotoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        panelConversacionLayout.setVerticalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConversacionLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFotoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnNuevaConversacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConversacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarprofesional.png"))); // NOI18N
        btnNuevaConversacion.setBorder(null);
        btnNuevaConversacion.setBorderPainted(false);
        btnNuevaConversacion.setContentAreaFilled(false);
        btnNuevaConversacion.setFocusPainted(false);
        btnNuevaConversacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversacionActionPerformed(evt);
            }
        });

        listaConversaciones.setBackground(new java.awt.Color(86, 107, 119));
        listaConversaciones.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaConversaciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaConversacionesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaConversaciones);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Seleccione al profesional");

        javax.swing.GroupLayout panelConsultaConProfesionalLayout = new javax.swing.GroupLayout(panelConsultaConProfesional);
        panelConsultaConProfesional.setLayout(panelConsultaConProfesionalLayout);
        panelConsultaConProfesionalLayout.setHorizontalGroup(
            panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                .addGroup(panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultaConProfesionalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevaConversacion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(panelConversacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelConsultaConProfesionalLayout.setVerticalGroup(
            panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                .addGroup(panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevaConversacion))
                    .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(panelConversacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );

        panelDerecho.add(panelConsultaConProfesional, "card3");

        panelElegirProfesional.setBackground(new java.awt.Color(58, 80, 92));
        panelElegirProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelElegirProfesional.setMinimumSize(new java.awt.Dimension(800, 800));
        panelElegirProfesional.setPreferredSize(new java.awt.Dimension(800, 800));

        listaElegirProfesionales.setBackground(new java.awt.Color(86, 107, 119));
        listaElegirProfesionales.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaElegirProfesionales.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaElegirProfesionalesValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(listaElegirProfesionales);

        javax.swing.GroupLayout panelElegirProfesionalLayout = new javax.swing.GroupLayout(panelElegirProfesional);
        panelElegirProfesional.setLayout(panelElegirProfesionalLayout);
        panelElegirProfesionalLayout.setHorizontalGroup(
            panelElegirProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelElegirProfesionalLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        panelElegirProfesionalLayout.setVerticalGroup(
            panelElegirProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElegirProfesionalLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        panelDerecho.add(panelElegirProfesional, "card4");

        panelVerPlanAlimentacion.setBackground(new java.awt.Color(58, 80, 92));
        panelVerPlanAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelVerPlanAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));

        lblPlanPropuesto1.setFont(new java.awt.Font("Levenim MT", 0, 40)); // NOI18N
        lblPlanPropuesto1.setForeground(new java.awt.Color(153, 255, 153));
        lblPlanPropuesto1.setText("Plan de alimentación propuesto");

        lblPlanPropuesto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconbro.png"))); // NOI18N

        lblNombreDelPlan.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblNombreDelPlan.setForeground(new java.awt.Color(153, 255, 153));
        lblNombreDelPlan.setText("nombre del plan");

        lblAlimentoIngeridoSeleccionado2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado2.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado2.setText("Nombre:");

        lblNombreDelProfesional.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblNombreDelProfesional.setForeground(new java.awt.Color(153, 255, 153));
        lblNombreDelProfesional.setText("nombre del profesional");

        lblAlimentoIngeridoSeleccionado4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado4.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado4.setText("Martes");

        lblAlimentoIngeridoSeleccionado5.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado5.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado5.setText("Título del profesional:");

        lblAlimentoIngeridoSeleccionado6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado6.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado6.setText("Miércoles");

        lblAlimentoIngeridoSeleccionado7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado7.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado7.setText("Jueves");

        lblAlimentoIngeridoSeleccionado8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado8.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado8.setText("Viernes");

        lblAlimentoIngeridoSeleccionado9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado9.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado9.setText("Sábado");

        lblAlimentoIngeridoSeleccionado10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado10.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado10.setText("Domingo");

        lblAlimentoIngeridoSeleccionado14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado14.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado14.setText("Lunes");

        txtComidasMartes.setBackground(new java.awt.Color(86, 107, 119));
        txtComidasMartes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasMartes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasMartes.setRows(5);
        jScrollPane34.setViewportView(txtComidasMartes);

        txtComidasMiercoles.setBackground(new java.awt.Color(86, 107, 119));
        txtComidasMiercoles.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasMiercoles.setRows(5);
        jScrollPane35.setViewportView(txtComidasMiercoles);

        txtComidasJueves.setBackground(new java.awt.Color(86, 107, 119));
        txtComidasJueves.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasJueves.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasJueves.setRows(5);
        jScrollPane36.setViewportView(txtComidasJueves);

        txtComidasSabado.setBackground(new java.awt.Color(86, 107, 119));
        txtComidasSabado.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasSabado.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasSabado.setRows(5);
        jScrollPane37.setViewportView(txtComidasSabado);

        txtComidasLunes.setBackground(new java.awt.Color(86, 107, 119));
        txtComidasLunes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasLunes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasLunes.setRows(5);
        jScrollPane38.setViewportView(txtComidasLunes);

        txtComidasDomingo.setBackground(new java.awt.Color(86, 107, 119));
        txtComidasDomingo.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasDomingo.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasDomingo.setRows(5);
        jScrollPane39.setViewportView(txtComidasDomingo);

        txtComidasViernes.setBackground(new java.awt.Color(86, 107, 119));
        txtComidasViernes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasViernes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasViernes.setRows(5);
        jScrollPane40.setViewportView(txtComidasViernes);

        lblAlimentoIngeridoSeleccionado11.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado11.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado11.setText("Profesional:");

        lblTituloDelProfesional.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblTituloDelProfesional.setForeground(new java.awt.Color(153, 255, 153));
        lblTituloDelProfesional.setText("titulo del profesional");

        javax.swing.GroupLayout panelVerPlanAlimentacionLayout = new javax.swing.GroupLayout(panelVerPlanAlimentacion);
        panelVerPlanAlimentacion.setLayout(panelVerPlanAlimentacionLayout);
        panelVerPlanAlimentacionLayout.setHorizontalGroup(
            panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlanPropuesto2)
                            .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlimentoIngeridoSeleccionado14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlanPropuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                                        .addComponent(lblAlimentoIngeridoSeleccionado11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNombreDelProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                                        .addComponent(lblAlimentoIngeridoSeleccionado2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblNombreDelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                                        .addComponent(lblAlimentoIngeridoSeleccionado5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTituloDelProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAlimentoIngeridoSeleccionado4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAlimentoIngeridoSeleccionado6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                                                .addComponent(lblAlimentoIngeridoSeleccionado7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlimentoIngeridoSeleccionado8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlimentoIngeridoSeleccionado9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlimentoIngeridoSeleccionado10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVerPlanAlimentacionLayout.setVerticalGroup(
            panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblPlanPropuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlimentoIngeridoSeleccionado2)
                            .addComponent(lblNombreDelPlan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlimentoIngeridoSeleccionado11)
                            .addComponent(lblNombreDelProfesional))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlimentoIngeridoSeleccionado5)
                            .addComponent(lblTituloDelProfesional)))
                    .addGroup(panelVerPlanAlimentacionLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblPlanPropuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlimentoIngeridoSeleccionado14)
                    .addComponent(lblAlimentoIngeridoSeleccionado4)
                    .addComponent(lblAlimentoIngeridoSeleccionado6)
                    .addComponent(lblAlimentoIngeridoSeleccionado7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlimentoIngeridoSeleccionado8)
                    .addComponent(lblAlimentoIngeridoSeleccionado9)
                    .addComponent(lblAlimentoIngeridoSeleccionado10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVerPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        panelDerecho.add(panelVerPlanAlimentacion, "card5");

        panelIngestaRegistradaCorrectamente.setBackground(new java.awt.Color(58, 80, 92));
        panelIngestaRegistradaCorrectamente.setMaximumSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setMinimumSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setPreferredSize(new java.awt.Dimension(800, 800));

        lblNohayConsultas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblNohayConsultasTexto1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto1.setForeground(new java.awt.Color(153, 255, 153));
        lblNohayConsultasTexto1.setText("Ingesta registrada");

        javax.swing.GroupLayout panelIngestaRegistradaCorrectamenteLayout = new javax.swing.GroupLayout(panelIngestaRegistradaCorrectamente);
        panelIngestaRegistradaCorrectamente.setLayout(panelIngestaRegistradaCorrectamenteLayout);
        panelIngestaRegistradaCorrectamenteLayout.setHorizontalGroup(
            panelIngestaRegistradaCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngestaRegistradaCorrectamenteLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(lblNohayConsultas1))
            .addGroup(panelIngestaRegistradaCorrectamenteLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(lblNohayConsultasTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelIngestaRegistradaCorrectamenteLayout.setVerticalGroup(
            panelIngestaRegistradaCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngestaRegistradaCorrectamenteLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lblNohayConsultas1)
                .addGap(36, 36, 36)
                .addComponent(lblNohayConsultasTexto1))
        );

        panelDerecho.add(panelIngestaRegistradaCorrectamente, "card10");

        panelAlimentoIngerido.setBackground(new java.awt.Color(58, 80, 92));
        panelAlimentoIngerido.setMaximumSize(new java.awt.Dimension(800, 800));
        panelAlimentoIngerido.setMinimumSize(new java.awt.Dimension(800, 800));

        fechaIngestaUsuario.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 17));

        lblAlimentoIngerido.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblAlimentoIngerido.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngerido.setText("ingerido");

        lblAlimentoIngerido2.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblAlimentoIngerido2.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngerido2.setText("Datos sobre el alimento");

        lblFechaAlimentoIngerido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblFechaAlimentoIngerido.setForeground(new java.awt.Color(153, 255, 153));
        lblFechaAlimentoIngerido.setText("Ingrese la fecha de ingesta");

        lblAlimentoIngeridoSeleccionado.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblAlimentoIngeridoSeleccionado.setForeground(new java.awt.Color(153, 255, 153));
        lblAlimentoIngeridoSeleccionado.setText("Ingrese el nuevo alimento ");

        comboAlimentosEnSistema.setBackground(new java.awt.Color(86, 107, 119));
        comboAlimentosEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        comboAlimentosEnSistema.setForeground(new java.awt.Color(86, 107, 119));
        comboAlimentosEnSistema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        comboAlimentosEnSistema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAlimentosEnSistemaItemStateChanged(evt);
            }
        });

        lblNuevoAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconbro.png"))); // NOI18N

        btnNuevaIngesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarALaLista.png"))); // NOI18N
        btnNuevaIngesta.setBorderPainted(false);
        btnNuevaIngesta.setContentAreaFilled(false);
        btnNuevaIngesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaIngestaActionPerformed(evt);
            }
        });

        lblValidarNuevoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNuevoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N

        lblNuevoAlimentoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNuevoAlimentoVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNuevoAlimentoVacio.setText("Dato vacio");

        lblDatosIncorrectos2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos2.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos2.setText("Aún quedan datos incorrectos");

        javax.swing.GroupLayout panelAlimentoIngeridoLayout = new javax.swing.GroupLayout(panelAlimentoIngerido);
        panelAlimentoIngerido.setLayout(panelAlimentoIngeridoLayout);
        panelAlimentoIngeridoLayout.setHorizontalGroup(
            panelAlimentoIngeridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblNuevoAlimentoIngerido)
                .addGap(32, 32, 32)
                .addGroup(panelAlimentoIngeridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlimentoIngerido2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblFechaAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(fechaIngestaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlimentoIngeridoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosIncorrectos2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevaIngesta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelAlimentoIngeridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlimentoIngeridoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                        .addComponent(comboAlimentosEnSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lblValidarNuevoAlimento)
                        .addGap(18, 18, 18)
                        .addComponent(lblNuevoAlimentoVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelAlimentoIngeridoLayout.setVerticalGroup(
            panelAlimentoIngeridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelAlimentoIngeridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                        .addComponent(lblAlimentoIngerido2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNuevoAlimentoIngerido))
                .addGap(76, 76, 76)
                .addComponent(lblAlimentoIngeridoSeleccionado)
                .addGap(37, 37, 37)
                .addGroup(panelAlimentoIngeridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlimentoIngeridoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(comboAlimentosEnSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblValidarNuevoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoAlimentoVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(lblFechaAlimentoIngerido)
                .addGap(29, 29, 29)
                .addComponent(fechaIngestaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panelAlimentoIngeridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDatosIncorrectos2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaIngesta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        panelDerecho.add(panelAlimentoIngerido, "card5");

        panelPlanDeAlimentacion.setBackground(new java.awt.Color(58, 80, 92));
        panelPlanDeAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelPlanDeAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));

        lblPlanDeAlimentacion.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblPlanDeAlimentacion.setForeground(new java.awt.Color(153, 255, 153));
        lblPlanDeAlimentacion.setText("Plan de alimentación");

        btnSolicitarNuevoPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVOPLAN.png"))); // NOI18N
        btnSolicitarNuevoPlan.setBorderPainted(false);
        btnSolicitarNuevoPlan.setContentAreaFilled(false);
        btnSolicitarNuevoPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarNuevoPlanActionPerformed(evt);
            }
        });

        panelNoHayPlanesDisponibles.setBackground(new java.awt.Color(58, 80, 92));

        lblNoHayPlanes.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayPlanes.setForeground(new java.awt.Color(153, 255, 153));
        lblNoHayPlanes.setText("disponibles");

        lblPlanSolicitadoCorrectamente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N

        lblNoHayPlanes1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayPlanes1.setForeground(new java.awt.Color(153, 255, 153));
        lblNoHayPlanes1.setText("No hay planes");

        javax.swing.GroupLayout panelNoHayPlanesDisponiblesLayout = new javax.swing.GroupLayout(panelNoHayPlanesDisponibles);
        panelNoHayPlanesDisponibles.setLayout(panelNoHayPlanesDisponiblesLayout);
        panelNoHayPlanesDisponiblesLayout.setHorizontalGroup(
            panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblPlanSolicitadoCorrectamente1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(lblNoHayPlanes)
                .addGap(43, 43, 43))
            .addGroup(panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addComponent(lblNoHayPlanes1)
                    .addContainerGap()))
        );
        panelNoHayPlanesDisponiblesLayout.setVerticalGroup(
            panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblPlanSolicitadoCorrectamente1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(lblNoHayPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(lblNoHayPlanes1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(179, 179, 179)))
        );

        panelPlanSolicitadoCorrectamente.setBackground(new java.awt.Color(58, 80, 92));
        panelPlanSolicitadoCorrectamente.setMaximumSize(new java.awt.Dimension(390, 500));

        lblPlanSolicitadoCorrectamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblPlanSolicitado.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblPlanSolicitado.setForeground(new java.awt.Color(153, 255, 153));
        lblPlanSolicitado.setText("Plan solicitado");

        javax.swing.GroupLayout panelPlanSolicitadoCorrectamenteLayout = new javax.swing.GroupLayout(panelPlanSolicitadoCorrectamente);
        panelPlanSolicitadoCorrectamente.setLayout(panelPlanSolicitadoCorrectamenteLayout);
        panelPlanSolicitadoCorrectamenteLayout.setHorizontalGroup(
            panelPlanSolicitadoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                .addGroup(panelPlanSolicitadoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblPlanSolicitadoCorrectamente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblPlanSolicitado)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelPlanSolicitadoCorrectamenteLayout.setVerticalGroup(
            panelPlanSolicitadoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblPlanSolicitadoCorrectamente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblPlanSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        panelSolicitarNuevoPlan.setBackground(new java.awt.Color(58, 80, 92));

        lblCambiarPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias.setForeground(new java.awt.Color(153, 255, 153));
        lblCambiarPreferencias.setText("personal?");

        comboProfesionalesEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        comboProfesionalesEnSistema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        comboProfesionalesEnSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProfesionalesEnSistemaActionPerformed(evt);
            }
        });

        lblSeleccioneProfesional1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblSeleccioneProfesional1.setForeground(new java.awt.Color(153, 255, 153));
        lblSeleccioneProfesional1.setText("Seleccione el Profesional");

        lblCambiarPreferencias3.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias3.setForeground(new java.awt.Color(153, 255, 153));
        lblCambiarPreferencias3.setText("basará en ella para elaborar el plan");

        lblCambiarPreferencias2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias2.setForeground(new java.awt.Color(153, 255, 153));
        lblCambiarPreferencias2.setText("Recuerde que el profesional se ");

        btnEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarPreferencias.png"))); // NOI18N
        btnEditarPreferencias.setBorderPainted(false);
        btnEditarPreferencias.setContentAreaFilled(false);
        btnEditarPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPreferenciasActionPerformed(evt);
            }
        });

        lblCambiarPreferencias4.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias4.setForeground(new java.awt.Color(153, 255, 153));
        lblCambiarPreferencias4.setText("¿Desea cambiar su información");

        btnEditarRestricciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarRestricciones.png"))); // NOI18N
        btnEditarRestricciones.setBorderPainted(false);
        btnEditarRestricciones.setContentAreaFilled(false);
        btnEditarRestricciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRestriccionesActionPerformed(evt);
            }
        });

        lblCambiarPreferencias5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCambiarPreferencias5.setForeground(new java.awt.Color(153, 255, 153));
        lblCambiarPreferencias5.setText("Restricciones");

        lblCambiarPreferencias6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCambiarPreferencias6.setForeground(new java.awt.Color(153, 255, 153));
        lblCambiarPreferencias6.setText("Preferencias");

        btnAceptarSolicitudPlanAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnAceptarSolicitudPlanAlimentacion.setBorderPainted(false);
        btnAceptarSolicitudPlanAlimentacion.setContentAreaFilled(false);
        btnAceptarSolicitudPlanAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarSolicitudPlanAlimentacionActionPerformed(evt);
            }
        });

        lblValidarProfesionalPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarProfesionalPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        lblValidarProfesionalPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblValidarProfesionalPlanFocusGained(evt);
            }
        });

        lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos.setText("completar");

        lblDatosIncorrectos1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos1.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos1.setText("Quedan datos sin");

        javax.swing.GroupLayout panelSolicitarNuevoPlanLayout = new javax.swing.GroupLayout(panelSolicitarNuevoPlan);
        panelSolicitarNuevoPlan.setLayout(panelSolicitarNuevoPlanLayout);
        panelSolicitarNuevoPlanLayout.setHorizontalGroup(
            panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCambiarPreferencias2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCambiarPreferencias3)
                            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditarPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCambiarPreferencias6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCambiarPreferencias5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditarRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                                        .addComponent(comboProfesionalesEnSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblValidarProfesionalPlan))
                                    .addComponent(lblCambiarPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblDatosIncorrectos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptarSolicitudPlanAlimentacion)
                        .addGap(18, 18, 18))
                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addComponent(lblSeleccioneProfesional1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lblCambiarPreferencias4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lblDatosIncorrectos1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );
        panelSolicitarNuevoPlanLayout.setVerticalGroup(
            panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblSeleccioneProfesional1)
                .addGap(18, 18, 18)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboProfesionalesEnSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidarProfesionalPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarRestricciones)
                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addComponent(lblCambiarPreferencias)
                        .addGap(18, 18, 18)
                        .addComponent(lblCambiarPreferencias2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCambiarPreferencias3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarPreferencias)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCambiarPreferencias5)
                    .addComponent(lblCambiarPreferencias6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addComponent(btnAceptarSolicitudPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addComponent(lblDatosIncorrectos)
                        .addGap(23, 23, 23))))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(lblCambiarPreferencias4)
                    .addContainerGap(391, Short.MAX_VALUE)))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addContainerGap(477, Short.MAX_VALUE)
                    .addComponent(lblDatosIncorrectos1)
                    .addGap(53, 53, 53)))
        );

        panelBuscarPlan.setBackground(new java.awt.Color(58, 80, 92));

        javax.swing.GroupLayout panelBuscarPlanLayout = new javax.swing.GroupLayout(panelBuscarPlan);
        panelBuscarPlan.setLayout(panelBuscarPlanLayout);
        panelBuscarPlanLayout.setHorizontalGroup(
            panelBuscarPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        panelBuscarPlanLayout.setVerticalGroup(
            panelBuscarPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        btnVerPlanesExistentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PLANEXIST.png"))); // NOI18N
        btnVerPlanesExistentes.setBorderPainted(false);
        btnVerPlanesExistentes.setContentAreaFilled(false);
        btnVerPlanesExistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPlanesExistentesActionPerformed(evt);
            }
        });

        lblSeleccioneProfesional2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblSeleccioneProfesional2.setForeground(new java.awt.Color(153, 255, 153));
        lblSeleccioneProfesional2.setText("Seleccione el plan");

        listaPlanesDelUsuario.setBackground(new java.awt.Color(86, 107, 119));
        listaPlanesDelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPlanesDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        listaPlanesDelUsuario.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPlanesDelUsuarioValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaPlanesDelUsuario);

        javax.swing.GroupLayout panelPlanDeAlimentacionLayout = new javax.swing.GroupLayout(panelPlanDeAlimentacion);
        panelPlanDeAlimentacion.setLayout(panelPlanDeAlimentacionLayout);
        panelPlanDeAlimentacionLayout.setHorizontalGroup(
            panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                .addGroup(panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblPlanDeAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                                .addComponent(btnSolicitarNuevoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnVerPlanesExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                                .addGroup(panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelSolicitarNuevoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelPlanSolicitadoCorrectamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeleccioneProfesional2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelBuscarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelNoHayPlanesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(26, 26, 26))
        );
        panelPlanDeAlimentacionLayout.setVerticalGroup(
            panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPlanDeAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerPlanesExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitarNuevoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSolicitarNuevoPlan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanDeAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(panelBuscarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(panelPlanSolicitadoCorrectamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panelNoHayPlanesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPlanDeAlimentacionLayout.createSequentialGroup()
                            .addComponent(lblSeleccioneProfesional2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        panelDerecho.add(panelPlanDeAlimentacion, "card6");

        panelVacio.setBackground(new java.awt.Color(58, 80, 92));
        panelVacio.setMaximumSize(new java.awt.Dimension(800, 800));
        panelVacio.setMinimumSize(new java.awt.Dimension(800, 800));

        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Question_Mark_64px.png"))); // NOI18N
        btnAyuda.setBorder(null);
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setFocusPainted(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/brocco.png"))); // NOI18N

        javax.swing.GroupLayout panelVacioLayout = new javax.swing.GroupLayout(panelVacio);
        panelVacio.setLayout(panelVacioLayout);
        panelVacioLayout.setHorizontalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVacioLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelVacioLayout.setVerticalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVacioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelVacioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        panelDerecho.add(panelVacio, "card7");

        panelNoHayAlimentos.setBackground(new java.awt.Color(58, 80, 92));
        panelNoHayAlimentos.setMaximumSize(new java.awt.Dimension(400, 400));
        panelNoHayAlimentos.setMinimumSize(new java.awt.Dimension(400, 400));
        panelNoHayAlimentos.setName(""); // NOI18N

        lblNohayConsultasTexto.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto.setForeground(new java.awt.Color(153, 255, 153));
        lblNohayConsultasTexto.setText("No hay alimentos registrados");

        javax.swing.GroupLayout panelNoHayAlimentosLayout = new javax.swing.GroupLayout(panelNoHayAlimentos);
        panelNoHayAlimentos.setLayout(panelNoHayAlimentosLayout);
        panelNoHayAlimentosLayout.setHorizontalGroup(
            panelNoHayAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayAlimentosLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblNohayConsultasTexto)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panelNoHayAlimentosLayout.setVerticalGroup(
            panelNoHayAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayAlimentosLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(lblNohayConsultasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        panelDerecho.add(panelNoHayAlimentos, "card2");
        panelNoHayAlimentos.getAccessibleContext().setAccessibleParent(panelNoHayAlimentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo es el boton home.
     * @param evt recibe esto por parametro
     */
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed
    /**
     * Este metodo es el boton de consulta con el profesional.
     * @param evt recibe esto por parametro
     */
    private void btnConsultaConProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaConProfesionalActionPerformed
        ocultarPaneles();
        this.btnConsultaConProfesional.setEnabled(false);
        if (sistema.getListaProfesionales().size() > 0) {
            this.listaConversaciones.setSelectedIndex(0);
            String[] lista = sistema.
            getListaNombresProfesionalesConversaciones(sistema.
            getPersonaLogueada().getNombreCompleto());
            if (lista.length > 0) {
                this.listaConversaciones.setListData(lista);
                this.existeConversacion = true;
                this.panelConsultaConProfesional.setVisible(true);
            } else {
                this.panelNoHayConversacionesCreadas.setVisible(true);
                this.lblNohayProfesionales.setVisible(false);
            }
        } else {
            this.panelNoHayConversacionesCreadas.setVisible(true);
            this.lblNohayProfesionales.setVisible(true);
            this.lblNohayConsultasTexto3.setVisible(false);
            this.btnNuevaConversacion1.setVisible(false);
           // this.lblCrearConv.setVisible(false);
        }


    }//GEN-LAST:event_btnConsultaConProfesionalActionPerformed
    /**
     * Este metodo es el boton de solicitar el plan de alimentacion.
     * @param evt recibe esto por parametro
     */
    private void btnSolicitarPlanAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPlanAlimentacionActionPerformed
        ocultarPaneles();
        this.btnSolicitarPlanAlimentacion.setEnabled(false);
        if (sistema.getListaProfesionales().size() > 0) {
            this.lblValidarProfesionalPlan.setVisible(false);
            this.btnSolicitarPlanAlimentacion.setEnabled(false);
            this.panelPlanDeAlimentacion.setVisible(true);
        } else {
            this.panelNoHayConversacionesCreadas.setVisible(true);
            this.lblNohayProfesionales.setVisible(true);
            this.lblNohayConsultasTexto3.setVisible(false);
            this.btnNuevaConversacion1.setVisible(false);
           // this.lblCrearConv.setVisible(false);
        }

    }//GEN-LAST:event_btnSolicitarPlanAlimentacionActionPerformed
    /**
     * Este metodo es el boton de ingresar alimentos ingeridos.
     * @param evt recibe esto por parametro
     */
    private void btnIngresarAlimentoIngeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngeridoActionPerformed
        ocultarPaneles();
        this.btnIngresarAlimentoIngerido.setEnabled(false);
        if (this.sistema.getListaAlimentos().size() > 0) {
            this.btnIngresarAlimentoIngerido.setEnabled(false);
            this.panelAlimentoIngerido.setVisible(true);
            ArrayList<Alimento> lstAlimentos = this.sistema.getListaAlimentos();
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            this.comboAlimentosEnSistema.setModel(modelo);
            this.comboAlimentosEnSistema.addItem("Seleccione...");
            for (int i = 0; i < lstAlimentos.size(); i++) {
                this.comboAlimentosEnSistema.addItem(lstAlimentos.get(i).
                        toString());
            }
            this.primeraIngesta = false;
        } else {
            this.panelNoHayAlimentos.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresarAlimentoIngeridoActionPerformed
    /**
     * Este metodo es el de elegir los profesionales.
     * @param evt recibe esto por parametro
     */
    private void listaElegirProfesionalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaElegirProfesionalesValueChanged
        this.existeConversacion = true;
        Profesional profesional = (Profesional) this.listaElegirProfesionales.
                getSelectedValue();
        this.sistema.crearConversacion(this.sistema.
                getPersonaLogueada(), profesional, "CONVERSACION:", true);
        ocultarPaneles();
        actualizarConversaciones(profesional.getNombreCompleto());
        this.panelConsultaConProfesional.setVisible(true);
    }//GEN-LAST:event_listaElegirProfesionalesValueChanged
    /**
     * Este metodo es el de la lista de conversacion.
     * @param evt recibe esto por parametro
     */
    private void listaConversacionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConversacionesValueChanged
        if (this.existeConversacion && this.listaConversaciones.
                getSelectedValue() != null) {
            this.panelConversacion.setVisible(true);
            this.profesionalSeleccionado = this.listaConversaciones.
                    getSelectedValue();
            actualizarConversaciones(this.profesionalSeleccionado);
        }
    }//GEN-LAST:event_listaConversacionesValueChanged
    /**
     * Este metodo es el de la nueva conversacion.
     * @param evt recibe esto por parametro
     */
    private void btnNuevaConversacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversacionActionPerformed
        ArrayList listaNombresProfesionalesSinConversacion;
        listaNombresProfesionalesSinConversacion = this.sistema.
        getNombresProfesionalesSinConversacionConUsuario((sistema.
        getPersonaLogueada()));
        if (listaNombresProfesionalesSinConversacion != null && listaNombresProfesionalesSinConversacion.size() > 0) {
            ocultarPaneles();
            this.listaElegirProfesionales.
            setListData(listaNombresProfesionalesSinConversacion.toArray());
            this.panelElegirProfesional.setVisible(true);
        }
    }//GEN-LAST:event_btnNuevaConversacionActionPerformed
    /**
     * Este metodo es el boton de enviar mensaje.
     * @param evt recibe esto por parametro
     */
    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        String mensaje = this.txtMensajeNuevo.getText();
        String profesional = this.profesionalSeleccionado;
        String usuario = this.sistema.getPersonaLogueada().getNombreCompleto();
        this.sistema.
        agregarMensajeConversacion(usuario, profesional, mensaje, false, false);
        this.txtMensajeNuevo.setText("");
        actualizarConversaciones(profesional);
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed
    /**
     * Este metodo es el boton de una nueva ingesta.
     * @param evt recibe esto por parametro
     */
    private void btnNuevaIngestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaIngestaActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().
                getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.
                getUsuarioPorNombre(nombreUsuarioLoguedo);
        ArrayList<Ingesta> listaIngestasDelUsuario = usuarioLogueado.
                getAlimentosIngeridos();
        String fechaIngesta = this.fechaIngestaUsuario.getText();
        String nuevoAlimento = this.comboAlimentosEnSistema.getSelectedItem().
                toString();
        if (nuevoAlimento.equals("Seleccione...")) {
            this.lblDatosIncorrectos2.setVisible(true);
            this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNuevoAlimento.setVisible(true);
            this.lblNuevoAlimentoVacio.setVisible(true);
        } else {
            this.sistema.agregarIngestaAUsuario(listaIngestasDelUsuario,
                    fechaIngesta, nuevoAlimento);
            this.panelIngestaRegistradaCorrectamente.setVisible(true);
            this.lblNuevoAlimentoVacio.setVisible(false);
            this.lblValidarNuevoAlimento.setVisible(false);
            this.btnIngresarAlimentoIngerido.setEnabled(true);
            this.lblDatosIncorrectos2.setVisible(false);
            this.lblValidarNuevoAlimento.setVisible(false);
            this.lblNuevoAlimentoVacio.setVisible(false);
            this.primeraIngesta = true;
            this.comboAlimentosEnSistema.setSelectedIndex(0);
        }
        this.panelAlimentoIngerido.setVisible(false);
    }//GEN-LAST:event_btnNuevaIngestaActionPerformed
    /**
     * Este metodo es el boton de ver los planes existentes.
     * @param evt recibe esto por parametro
     */
    private void btnVerPlanesExistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPlanesExistentesActionPerformed
        this.btnVerPlanesExistentes.setEnabled(false);
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().
                getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.
                getUsuarioPorNombre(nombreUsuarioLoguedo);
        String[] planesDelUsuario = this.sistema.
                planesAtendidosDelUsuario(usuarioLogueado);
        if (planesDelUsuario.length > 0) {
            this.panelBuscarPlan.setVisible(true);
            this.listaPlanesDelUsuario.setListData(planesDelUsuario);
        } else {
            this.panelBuscarPlan.setVisible(true);
            this.panelNoHayPlanesDisponibles.setVisible(true);
        }
    }//GEN-LAST:event_btnVerPlanesExistentesActionPerformed
    /**
     * Este metodo es el de solicitar un nuevo plan.
     * @param evt recibe esto por parametro
     */
    private void btnSolicitarNuevoPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarNuevoPlanActionPerformed
        this.btnSolicitarNuevoPlan.setEnabled(false);
        this.lblValidarProfesionalPlan.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblDatosIncorrectos1.setVisible(false);
        this.panelSolicitarNuevoPlan.setVisible(true);
        ArrayList<Profesional> lstProfesionales = this.sistema.
                getListaProfesionales();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        this.comboProfesionalesEnSistema.setModel(modelo);
        this.comboProfesionalesEnSistema.addItem("Seleccione...");
        for (int i = 0; i < lstProfesionales.size(); i++) {
            this.comboProfesionalesEnSistema.
                    addItem(lstProfesionales.get(i).toString());
        }
        this.primeraVez = false;
    }//GEN-LAST:event_btnSolicitarNuevoPlanActionPerformed
    /**
     * Este metodo es el boton de editar las preferencias.
     * @param evt recibe esto por parametro
     */
    private void btnEditarPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPreferenciasActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().
                getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.
                getUsuarioPorNombre(nombreUsuarioLoguedo);
        VentanaEditarPreferencias editarPreferenciasUsuario;
        editarPreferenciasUsuario = new VentanaEditarPreferencias(sistema,
                usuarioLogueado);
        editarPreferenciasUsuario.setVisible(true);
    }//GEN-LAST:event_btnEditarPreferenciasActionPerformed
    /**
     * Este metodo es el que guarda los datos en el sistema.
     * @param evt recibe esto por parametro
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Este metodo es el boton de editar las restricciones.
     * @param evt recibe esto por parametro
     */
    private void btnEditarRestriccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRestriccionesActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().
                getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.
                getUsuarioPorNombre(nombreUsuarioLoguedo);
        VentanaEditarRestricciones editarRestriccionesUsuario;
        editarRestriccionesUsuario = new
                VentanaEditarRestricciones(sistema, usuarioLogueado);
        editarRestriccionesUsuario.setVisible(true);
    }//GEN-LAST:event_btnEditarRestriccionesActionPerformed
    /**
     * Este metodo es el boton de aceptar la solicitud del plan.
     * @param evt recibe esto por parametro
     */
    private void btnAceptarSolicitudPlanAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarSolicitudPlanAlimentacionActionPerformed
        String nombreProfesionalElegido = (String) this.
                comboProfesionalesEnSistema.getSelectedItem();
        if (nombreProfesionalElegido.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            this.lblDatosIncorrectos1.setVisible(true);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            this.lblDatosIncorrectos1.setVisible(false);
            Profesional profesionalElegido = sistema.
                    getProfesionalPorNombre(nombreProfesionalElegido);
            String nombreUsuarioLoguedo = this.sistema.
                    getPersonaLogueada().getNombreCompleto();
            Usuario usuarioLogueado = this.sistema.
                    getUsuarioPorNombre(nombreUsuarioLoguedo);
            this.sistema.agregarPlanSolicitado(usuarioLogueado,
                    profesionalElegido);
            this.panelSolicitarNuevoPlan.setVisible(false);
            this.panelPlanSolicitadoCorrectamente.setVisible(true);

        }
    }//GEN-LAST:event_btnAceptarSolicitudPlanAlimentacionActionPerformed
    /**
     * Este metodo es el boton de validar el profesional.
     * @param evt recibe esto por parametro
     */
    private void lblValidarProfesionalPlanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarProfesionalPlanFocusGained

    }//GEN-LAST:event_lblValidarProfesionalPlanFocusGained
    /**
     * Este metodo es el combo de profesionales.
     * @param evt recibe esto por parametro
     */
    private void comboProfesionalesEnSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProfesionalesEnSistemaActionPerformed
        if (!this.primeraVez) {
            String profesionalElegido;
            profesionalElegido = (String) this.comboProfesionalesEnSistema.
                    getSelectedItem();
            if (profesionalElegido.equals("Seleccione...")) {
                this.lblValidarProfesionalPlan.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarProfesionalPlan.setVisible(true);
            } else {
                this.lblValidarProfesionalPlan.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarProfesionalPlan.setVisible(true);
            }
        }
    }//GEN-LAST:event_comboProfesionalesEnSistemaActionPerformed
    /**
     * Este metodo es el de la lista de planes del usuario.
     * @param evt recibe esto por parametro
     */
    private void listaPlanesDelUsuarioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPlanesDelUsuarioValueChanged
        ocultarPaneles();
        this.nombreDelPlan = this.listaPlanesDelUsuario.getSelectedValue();
        PlanAlimentacion planSeleccionado = this.sistema.
                devolverPlanDadoNombre(nombreDelPlan);
        this.lblNombreDelPlan.setText(planSeleccionado.getNombreDelPlan());
        this.lblNombreDelProfesional.setText(planSeleccionado.getProfesional().
                getNombreCompleto());
        this.lblTituloDelProfesional.setText(planSeleccionado.getProfesional().
                getTituloProfesional());
        String[][] planDiaADia = planSeleccionado.getPlanDiaADia();
        this.txtComidasLunes.setText(cargarDatosDelPlan(planDiaADia, 0));
        this.txtComidasMartes.setText(cargarDatosDelPlan(planDiaADia, 1));
        this.txtComidasMiercoles.setText(cargarDatosDelPlan(planDiaADia, 2));
        this.txtComidasJueves.setText(cargarDatosDelPlan(planDiaADia, 3));
        this.txtComidasViernes.setText(cargarDatosDelPlan(planDiaADia, 4));
        this.txtComidasSabado.setText(cargarDatosDelPlan(planDiaADia, 5));
        this.txtComidasDomingo.setText(cargarDatosDelPlan(planDiaADia, 6));
        this.panelVerPlanAlimentacion.setVisible(true);
    }//GEN-LAST:event_listaPlanesDelUsuarioValueChanged
    /**
     * Este metodo es el combo de alimentos.
     * @param evt recibe esto por parametro
     */
    private void comboAlimentosEnSistemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAlimentosEnSistemaItemStateChanged
        if (!this.primeraIngesta) {
            String alimentoIngresado = (String) this.comboAlimentosEnSistema.
                    getSelectedItem();
            if (alimentoIngresado.equals("Seleccione...")) {
                this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarNuevoAlimento.setVisible(true);
                this.lblNuevoAlimentoVacio.setVisible(true);
            } else {
                this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarNuevoAlimento.setVisible(true);
                this.lblNuevoAlimentoVacio.setVisible(false);
            }
        }
    }//GEN-LAST:event_comboAlimentosEnSistemaItemStateChanged
    /**
     * Este metodo es el boton de una nueva conversacion.
     * @param evt recibe esto por parametro
     */
    private void btnNuevaConversacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversacion1ActionPerformed
        ArrayList listaNombresProfesionalesSinConversacion;
        listaNombresProfesionalesSinConversacion = this.sistema.
        getNombresProfesionalesSinConversacionConUsuario((sistema.
                getPersonaLogueada()));
        if (listaNombresProfesionalesSinConversacion != null && listaNombresProfesionalesSinConversacion.size() > 0) {
            ocultarPaneles();
            this.listaElegirProfesionales.
             setListData(listaNombresProfesionalesSinConversacion.toArray());
            this.panelElegirProfesional.setVisible(true);
        }
    }//GEN-LAST:event_btnNuevaConversacion1ActionPerformed
    /**
     * Este metodo es el boton de ayuda.
     * @param evt recibe esto por parametro
     */
    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        AyudaUsuario ayuda = new AyudaUsuario(sistema);
        ayuda.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed
    /**
     * Este metodo es el boton de cerrar el sistema.
     * @param evt recibe esto por parametro
     */
    private void btnCerrarSistemaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaUsuariosActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro"
        + " que quieres salir? Perderás la información que no guardaste.",
                "Atención!",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            this.sistema.guardarDatosSistema();
            Runtime.getRuntime().exit(0);
            this.dispose();
        }

        //this.sistema.guardarDatosSistema();
        //Runtime.getRuntime().exit(0);
        //this.dispose();
    }//GEN-LAST:event_btnCerrarSistemaUsuariosActionPerformed
    /**
     * Este metodo es para ocultar los panel.
     */
    private void ocultarPaneles() {
        this.btnConsultaConProfesional.setEnabled(true);
        this.btnIngresarAlimentoIngerido.setEnabled(true);
        this.btnSolicitarPlanAlimentacion.setEnabled(true);
        this.btnSolicitarNuevoPlan.setEnabled(true);
        this.btnVerPlanesExistentes.setEnabled(true);
        this.panelConsultaConProfesional.setVisible(false);
        this.txtMostrarConversacion.setText("");
        this.panelElegirProfesional.setVisible(false);
        this.panelBuscarPlan.setVisible(false);
        this.panelConversacion.setVisible(false);
        this.panelAlimentoIngerido.setVisible(false);
        this.panelPlanDeAlimentacion.setVisible(false);
        this.panelSolicitarNuevoPlan.setVisible(false);
        this.panelNoHayAlimentos.setVisible(false);
        this.panelVacio.setVisible(true);
        this.panelVerPlanAlimentacion.setVisible(false);
        this.panelPlanSolicitadoCorrectamente.setVisible(false);
        this.panelIngestaRegistradaCorrectamente.setVisible(false);
        this.panelNoHayConversacionesCreadas.setVisible(false);
        this.panelNoHayPlanesDisponibles.setVisible(false);
        this.panelVacio.setVisible(false);
    }
    /**
     * Este metodo es para actualizar la conversacion.
     * @param destinatario recibe el destinatario
     */
    private void actualizarConversaciones(String destinatario) {
        if (destinatario != null) {
            String remitente = this.sistema.getPersonaLogueada().
                    getNombreCompleto();
            String conversacion = this.sistema.
                    getConversacion(destinatario, remitente);
            this.txtMostrarConversacion.setText(conversacion);
            this.lblNombreProfesional.setText(this.profesionalSeleccionado);
            Profesional profesional = this.sistema.
                    getProfesionalPorNombre(this.profesionalSeleccionado);
            this.lblFotoProfesional.setIcon(profesional.getFotoDePerfil());
            this.listaConversaciones.setListData(this.sistema.
                    getListaNombresProfesionalesConversaciones(remitente));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarSolicitudPlanAlimentacion;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCerrarSistemaUsuarios;
    private javax.swing.JButton btnConsultaConProfesional;
    private javax.swing.JButton btnEditarPreferencias;
    private javax.swing.JButton btnEditarRestricciones;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarAlimentoIngerido;
    private javax.swing.JButton btnNuevaConversacion;
    private javax.swing.JButton btnNuevaConversacion1;
    private javax.swing.JButton btnNuevaIngesta;
    private javax.swing.JButton btnSolicitarNuevoPlan;
    private javax.swing.JButton btnSolicitarPlanAlimentacion;
    private javax.swing.JButton btnVerPlanesExistentes;
    private javax.swing.JComboBox<String> comboAlimentosEnSistema;
    private javax.swing.JComboBox<String> comboProfesionalesEnSistema;
    private datechooser.beans.DateChooserCombo fechaIngestaUsuario;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAlimentoIngerido;
    private javax.swing.JLabel lblAlimentoIngerido2;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado10;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado11;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado14;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado2;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado4;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado5;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado6;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado7;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado8;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado9;
    private javax.swing.JLabel lblCambiarPreferencias;
    private javax.swing.JLabel lblCambiarPreferencias2;
    private javax.swing.JLabel lblCambiarPreferencias3;
    private javax.swing.JLabel lblCambiarPreferencias4;
    private javax.swing.JLabel lblCambiarPreferencias5;
    private javax.swing.JLabel lblCambiarPreferencias6;
    private javax.swing.JLabel lblConsultaConProfesional;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblDatosIncorrectos1;
    private javax.swing.JLabel lblDatosIncorrectos2;
    private javax.swing.JLabel lblFechaAlimentoIngerido;
    private javax.swing.JLabel lblFotoProfesional;
    private javax.swing.JLabel lblIngresarAlimentoIngerido;
    private javax.swing.JLabel lblNoHayPlanes;
    private javax.swing.JLabel lblNoHayPlanes1;
    private javax.swing.JLabel lblNohayConsultas;
    private javax.swing.JLabel lblNohayConsultas1;
    private javax.swing.JLabel lblNohayConsultasTexto;
    private javax.swing.JLabel lblNohayConsultasTexto1;
    private javax.swing.JLabel lblNohayConsultasTexto3;
    private javax.swing.JLabel lblNohayProfesionales;
    private javax.swing.JLabel lblNombreDelPlan;
    private javax.swing.JLabel lblNombreDelProfesional;
    private javax.swing.JLabel lblNombreProfesional;
    private javax.swing.JLabel lblNuevoAlimentoIngerido;
    private javax.swing.JLabel lblNuevoAlimentoVacio;
    private javax.swing.JLabel lblPlanDeAlimentacion;
    private javax.swing.JLabel lblPlanPropuesto1;
    private javax.swing.JLabel lblPlanPropuesto2;
    private javax.swing.JLabel lblPlanSolicitado;
    private javax.swing.JLabel lblPlanSolicitadoCorrectamente;
    private javax.swing.JLabel lblPlanSolicitadoCorrectamente1;
    private javax.swing.JLabel lblSeleccioneProfesional1;
    private javax.swing.JLabel lblSeleccioneProfesional2;
    private javax.swing.JLabel lblSolicitarPlanAlimentacion;
    private javax.swing.JLabel lblTituloDelProfesional;
    private javax.swing.JLabel lblValidarNuevoAlimento;
    private javax.swing.JLabel lblValidarProfesionalPlan;
    private javax.swing.JList<String> listaConversaciones;
    private javax.swing.JList listaElegirProfesionales;
    private javax.swing.JList<String> listaPlanesDelUsuario;
    private javax.swing.JPanel panelAlimentoIngerido;
    private javax.swing.JPanel panelBuscarPlan;
    private javax.swing.JPanel panelConsultaConProfesional;
    private javax.swing.JPanel panelConversacion;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelElegirProfesional;
    private javax.swing.JPanel panelIngestaRegistradaCorrectamente;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNoHayAlimentos;
    private javax.swing.JPanel panelNoHayConversacionesCreadas;
    private javax.swing.JPanel panelNoHayPlanesDisponibles;
    private javax.swing.JPanel panelPlanDeAlimentacion;
    private javax.swing.JPanel panelPlanSolicitadoCorrectamente;
    private javax.swing.JPanel panelSolicitarNuevoPlan;
    private javax.swing.JPanel panelVacio;
    private javax.swing.JPanel panelVerPlanAlimentacion;
    private javax.swing.JTextArea txtComidasDomingo;
    private javax.swing.JTextArea txtComidasJueves;
    private javax.swing.JTextArea txtComidasLunes;
    private javax.swing.JTextArea txtComidasMartes;
    private javax.swing.JTextArea txtComidasMiercoles;
    private javax.swing.JTextArea txtComidasSabado;
    private javax.swing.JTextArea txtComidasViernes;
    private javax.swing.JTextArea txtMensajeNuevo;
    private javax.swing.JTextPane txtMostrarConversacion;
    // End of variables declaration//GEN-END:variables
    /**
     * Este metodo carga los datos del plan.
     * @param planDiaADia recibe el plan
     * @param indiceDia recibe el indice
     * @return retorna un string
     */
    private String cargarDatosDelPlan(String[][] planDiaADia, int indiceDia) {
        String actual = "DESAYUNO:" + "\n";
        if (planDiaADia[indiceDia][0] == null || planDiaADia[indiceDia][0].
                equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][0];
        }
        actual += "\n" + "\n" + "ALMUERZO:" + "\n";
        if (planDiaADia[indiceDia][1] == null || planDiaADia[indiceDia][1].
                equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][1];
        }
        actual += "\n" + "\n" + "CENA:" + "\n";
        if (planDiaADia[indiceDia][2] == null || planDiaADia[indiceDia][2].
                equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][2];
        }
        return actual;
    }

}
