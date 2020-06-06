package interfaz;

import dominio.Sistema;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *  Esta ventana permite registrar un profesional.
 * @author Usuario
 */
public class VentanaRegistrarProfesional extends javax.swing.JDialog {
    /**
     *  Esta variable hace referencia al sistema.
     */
    private Sistema sistema;
    /**
     *  Esta variable hace referencia a la foto de perfil actual.
     */
    private ImageIcon fotoDePerfilActual;
    /**
     *  Esta variable hace referencia a si es la primera vez o no.
     */
    private boolean primeraVez;
    /**
     * Este metodo inicializa la ventana.
     * @param unSistema le pasa el sistema por parametro
     */
    public VentanaRegistrarProfesional(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.fotoDePerfilActual = new ImageIcon(getClass().
                getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        ocultarEtiquetas();
        this.primeraVez = true;
        cargarListaPaisesGraduacion();
        Calendar fecha = new GregorianCalendar();
        this.dateChooserFechaNacimiento.setMaxDate(fecha);
        this.dateChooserFechaGraduacion.setMaxDate(fecha);
        this.primeraVez = false;
    }
    /**
     * Este metodo suprime los warnings no chequeados.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblNuevoProfesional = new javax.swing.JLabel();
        lblIconoNuevoProfesional = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTituloProfesional = new javax.swing.JLabel();
        btnIngresarProfesionalASistema = new javax.swing.JButton();
        lblPaisGraduacion = new javax.swing.JLabel();
        listaPaisGraduacion = new javax.swing.JComboBox<String>();
        listaTituloProfesional = new javax.swing.JComboBox<String>();
        lblFechaNac = new javax.swing.JLabel();
        dateChooserFechaNacimiento = new datechooser.beans.DateChooserCombo();
        btnIngresarFotoPerfil = new javax.swing.JButton();
        lblFechaGraduacion = new javax.swing.JLabel();
        dateChooserFechaGraduacion = new datechooser.beans.DateChooserCombo();
        lblValidarNombre = new javax.swing.JLabel();
        lblValidarApellido = new javax.swing.JLabel();
        lblValidarTituloProfesional = new javax.swing.JLabel();
        lblValidarPaisGraduacion = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblNombreVacio = new javax.swing.JLabel();
        lblTituloVacio = new javax.swing.JLabel();
        lblPaisVacio = new javax.swing.JLabel();
        lblApellidoVacio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(58, 80, 92));
        panel1.setMaximumSize(new java.awt.Dimension(270, 800));
        panel1.setMinimumSize(new java.awt.Dimension(270, 800));
        panel1.setPreferredSize(new java.awt.Dimension(270, 800));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevabrocco.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addContainerGap(210, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(58, 80, 92));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setMaximumSize(new java.awt.Dimension(800, 800));
        panel2.setMinimumSize(new java.awt.Dimension(800, 800));
        panel2.setPreferredSize(new java.awt.Dimension(800, 800));
        panel2.setLayout(null);

        lblNuevoProfesional.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoProfesional.setForeground(new java.awt.Color(153, 255, 153));
        lblNuevoProfesional.setText("Nuevo Profesional");
        panel2.add(lblNuevoProfesional);
        lblNuevoProfesional.setBounds(149, 27, 530, 91);

        lblIconoNuevoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        panel2.add(lblIconoNuevoProfesional);
        lblIconoNuevoProfesional.setBounds(31, 27, 100, 100);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(153, 255, 153));
        lblNombre.setText("Nombre");
        panel2.add(lblNombre);
        lblNombre.setBounds(30, 180, 134, 38);

        lblApellido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(153, 255, 153));
        lblApellido.setText("Apellido");
        panel2.add(lblApellido);
        lblApellido.setBounds(31, 223, 151, 38);

        txtNombre.setBackground(new java.awt.Color(86, 107, 119));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        panel2.add(txtNombre);
        txtNombre.setBounds(220, 180, 176, 38);

        txtApellido.setBackground(new java.awt.Color(86, 107, 119));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        panel2.add(txtApellido);
        txtApellido.setBounds(220, 230, 176, 33);

        lblTituloProfesional.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTituloProfesional.setForeground(new java.awt.Color(153, 255, 153));
        lblTituloProfesional.setText("Seleccione el título profesional");
        panel2.add(lblTituloProfesional);
        lblTituloProfesional.setBounds(31, 377, 446, 38);

        btnIngresarProfesionalASistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnIngresarProfesionalASistema.setBorderPainted(false);
        btnIngresarProfesionalASistema.setContentAreaFilled(false);
        btnIngresarProfesionalASistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarProfesionalASistemaActionPerformed(evt);
            }
        });
        panel2.add(btnIngresarProfesionalASistema);
        btnIngresarProfesionalASistema.setBounds(630, 650, 115, 94);

        lblPaisGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblPaisGraduacion.setForeground(new java.awt.Color(153, 255, 153));
        lblPaisGraduacion.setText("Seleccione el pais de graduación");
        panel2.add(lblPaisGraduacion);
        lblPaisGraduacion.setBounds(31, 607, 497, 38);

        listaPaisGraduacion.setBackground(new java.awt.Color(86, 107, 119));
        listaPaisGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPaisGraduacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaPaisGraduacionItemStateChanged(evt);
            }
        });
        panel2.add(listaPaisGraduacion);
        listaPaisGraduacion.setBounds(31, 663, 440, 31);

        listaTituloProfesional.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaTituloProfesional.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Ciencia de los alimentos", "Entrenador físico e instructor aeróbico", "Ingeniería en alimentos", "Licenciatura en nutrición", "Maestro de salud y educación física", "Medicina", "Nutrición Humana y Dietética", "Nutricionista", "Técnicatura en Gestión Gastronómica", "Técnicatura en tecnología de alimentos", "Técnico operador de alimentos", "Otro..." }));
        listaTituloProfesional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaTituloProfesionalItemStateChanged(evt);
            }
        });
        panel2.add(listaTituloProfesional);
        listaTituloProfesional.setBounds(31, 421, 440, 31);

        lblFechaNac.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblFechaNac.setForeground(new java.awt.Color(153, 255, 153));
        lblFechaNac.setText("Fecha de nacimiento");
        panel2.add(lblFechaNac);
        lblFechaNac.setBounds(31, 292, 338, 38);

        dateChooserFechaNacimiento.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserFechaNacimiento.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 19));
    dateChooserFechaNacimiento.setMaxDate(new java.util.GregorianCalendar(2017, 10, 9));
    dateChooserFechaNacimiento.setMinDate(new java.util.GregorianCalendar(1917, 10, 1));
    panel2.add(dateChooserFechaNacimiento);
    dateChooserFechaNacimiento.setBounds(401, 292, 183, 38);

    btnIngresarFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png"))); // NOI18N
    btnIngresarFotoPerfil.setBorderPainted(false);
    btnIngresarFotoPerfil.setContentAreaFilled(false);
    btnIngresarFotoPerfil.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIngresarFotoPerfilActionPerformed(evt);
        }
    });
    panel2.add(btnIngresarFotoPerfil);
    btnIngresarFotoPerfil.setBounds(579, 163, 158, 102);

    lblFechaGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
    lblFechaGraduacion.setForeground(new java.awt.Color(153, 255, 153));
    lblFechaGraduacion.setText("Seleccione la fecha de graduación");
    panel2.add(lblFechaGraduacion);
    lblFechaGraduacion.setBounds(31, 489, 525, 38);

    dateChooserFechaGraduacion.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooserFechaGraduacion.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 19));
dateChooserFechaGraduacion.setMaxDate(new java.util.GregorianCalendar(2017, 10, 9));
dateChooserFechaGraduacion.setMinDate(new java.util.GregorianCalendar(1917, 10, 1));
panel2.add(dateChooserFechaGraduacion);
dateChooserFechaGraduacion.setBounds(31, 552, 183, 37);

lblValidarNombre.setForeground(new java.awt.Color(255, 255, 255));
lblValidarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarNombre);
lblValidarNombre.setBounds(420, 180, 32, 44);

lblValidarApellido.setForeground(new java.awt.Color(255, 255, 255));
lblValidarApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarApellido);
lblValidarApellido.setBounds(420, 220, 32, 44);

lblValidarTituloProfesional.setForeground(new java.awt.Color(255, 255, 255));
lblValidarTituloProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarTituloProfesional);
lblValidarTituloProfesional.setBounds(490, 410, 32, 44);

lblValidarPaisGraduacion.setForeground(new java.awt.Color(255, 255, 255));
lblValidarPaisGraduacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarPaisGraduacion);
lblValidarPaisGraduacion.setBounds(490, 660, 32, 44);

lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
lblDatosIncorrectos.setText("Aún quedan datos incorrectos");
panel2.add(lblDatosIncorrectos);
lblDatosIncorrectos.setBounds(330, 720, 312, 26);

lblNombreVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblNombreVacio.setForeground(new java.awt.Color(240, 128, 128));
lblNombreVacio.setText("Dato vacío");
panel2.add(lblNombreVacio);
lblNombreVacio.setBounds(460, 180, 134, 38);

lblTituloVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblTituloVacio.setForeground(new java.awt.Color(240, 128, 128));
lblTituloVacio.setText("Dato vacío");
panel2.add(lblTituloVacio);
lblTituloVacio.setBounds(530, 410, 134, 38);

lblPaisVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblPaisVacio.setForeground(new java.awt.Color(240, 128, 128));
lblPaisVacio.setText("Dato vacío");
panel2.add(lblPaisVacio);
lblPaisVacio.setBounds(530, 660, 120, 38);

lblApellidoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblApellidoVacio.setForeground(new java.awt.Color(240, 128, 128));
lblApellidoVacio.setText("Dato vacío");
panel2.add(lblApellidoVacio);
lblApellidoVacio.setBounds(460, 220, 134, 38);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo devuelve el sistema.
     * @return retorna el sistema
     */
    public Sistema getSistema() {
        return sistema;
    }
    /**
     * Este metodo modifica el sistema.
     * @param unSistema es el sistema por el cual sera cambiado
     */
    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }
    /**
     * Este metodo devuelve la foto de perfil.
     * @return retorna la foto de perfil
     */
    public ImageIcon getFotoDePerfilActual() {
        return fotoDePerfilActual;
    }
    /**
     * Este metodo modifica la foto de perfil actual.
     * @param unaFoto es la foto por la cual se cambiara la original
     */
    public void setFotoDePerfilActual(ImageIcon unaFoto) {
        this.fotoDePerfilActual = unaFoto;
    }
    /**
     * Este metodo devuelve un true si es la primera vez en el sistema.
     * @return retorna un booleano
     */
    public boolean getPrimeraVezEnSistema() {
        return primeraVez;
    }
    /**
     * Este metodo modifica la variable primeravez.
     * @param primera es la variable por la cual se va a modificar la anterior
     */
    public void setPrimeraVezEnSistema(boolean primera) {
        this.primeraVez = primera;
    }
    /**
     * Este metodo es del boton de ingresar un profesional al sistema.
     * @param evt recibe esto por parametro
     */
    private void btnIngresarProfesionalASistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarProfesionalASistemaActionPerformed
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        String tituloProfesional = (String) this.listaTituloProfesional.
                getSelectedItem();
        String paisGraduacion = (String) this.listaPaisGraduacion.
                getSelectedItem();
        String fechaNacimiento = this.dateChooserFechaNacimiento.getText();
        String fechaGraduacion = this.dateChooserFechaGraduacion.getText();
        if (nombre.equals("") || apellido.equals("") || tituloProfesional.
        equals("Seleccione...") || paisGraduacion.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            mostrarErrores(nombre, apellido, tituloProfesional, paisGraduacion);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            boolean seAgregoProfesional;
            seAgregoProfesional = this.getSistema().
            crearProfesional(nombre, apellido, fechaNacimiento,
            this.fotoDePerfilActual, tituloProfesional, fechaGraduacion, 
            paisGraduacion);
            if (seAgregoProfesional) {
                this.txtNombre.setText("");
                this.txtApellido.setText("");
                VentanaMenuPrincipal vPrincipal;
                vPrincipal = new VentanaMenuPrincipal(sistema);
                this.setVisible(false);
                vPrincipal.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnIngresarProfesionalASistemaActionPerformed
    /**
     * Este metodo es del boton home.
     * @param evt recibe esto por parametro
     */
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed
    /**
     * Este metodo es del boton de ingresar foto de perfil.
     * @param evt recibe esto por parametro
     */
    private void btnIngresarFotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFotoPerfilActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file;
        file = new FileNameExtensionFilter("PNG", "png");
        fileChooser.setFileFilter(file);
        fileChooser.setAcceptAllFileFilterUsed(false);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon iconoPerfil = new ImageIcon(fileChooser.getSelectedFile().
                    getAbsolutePath());
            this.btnIngresarFotoPerfil.setIcon(iconoPerfil);
            this.fotoDePerfilActual = iconoPerfil;
        }
    }//GEN-LAST:event_btnIngresarFotoPerfilActionPerformed
    /**
     * Este metodo es del nombre.
     * @param evt recibe esto por parametro
     */
    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombreIngresado = this.txtNombre.getText();
        if (nombreIngresado.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        } else {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombreFocusLost
    /**
     * Este metodo es del apellido.
     * @param evt recibe esto por parametro
     */
    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        String apellidoIngresado = this.txtApellido.getText();
        if (apellidoIngresado.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        } else {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtApellidoFocusLost
    /**
     * Este metodo es para guardar los datos al sistema.
     * @param evt recibe esto por parametro
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Este metodo es de la lista de los titulos de los profesionales.
     * @param evt recibe esto por parametro
     */
    private void listaTituloProfesionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaTituloProfesionalItemStateChanged
        String tituloIngresado;
        tituloIngresado = (String) this.listaTituloProfesional.
                getSelectedItem();
        if (tituloIngresado.equals("Seleccione...")) {
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
            this.lblTituloVacio.setVisible(true);
        } else {
            this.lblTituloVacio.setVisible(false);
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
        }
    }//GEN-LAST:event_listaTituloProfesionalItemStateChanged
    /**
     * Este metodo es la lista de paises dode se graduaron.
     * @param evt recibe esto por parametro
     */
    private void listaPaisGraduacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaPaisGraduacionItemStateChanged
        if (!this.primeraVez) {
            String paisGraduacionIngresado = (String) this.listaPaisGraduacion.
                    getSelectedItem();
            if (paisGraduacionIngresado.equals("Seleccione...")) {
                this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarPaisGraduacion.setVisible(true);
                this.lblPaisVacio.setVisible(true);
            } else {
                this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarPaisGraduacion.setVisible(true);
                this.lblPaisVacio.setVisible(false);
            }
        }
    }//GEN-LAST:event_listaPaisGraduacionItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarFotoPerfil;
    private javax.swing.JButton btnIngresarProfesionalASistema;
    private datechooser.beans.DateChooserCombo dateChooserFechaGraduacion;
    private datechooser.beans.DateChooserCombo dateChooserFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoVacio;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblFechaGraduacion;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblIconoNuevoProfesional;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreVacio;
    private javax.swing.JLabel lblNuevoProfesional;
    private javax.swing.JLabel lblPaisGraduacion;
    private javax.swing.JLabel lblPaisVacio;
    private javax.swing.JLabel lblTituloProfesional;
    private javax.swing.JLabel lblTituloVacio;
    private javax.swing.JLabel lblValidarApellido;
    private javax.swing.JLabel lblValidarNombre;
    private javax.swing.JLabel lblValidarPaisGraduacion;
    private javax.swing.JLabel lblValidarTituloProfesional;
    private javax.swing.JComboBox<String> listaPaisGraduacion;
    private javax.swing.JComboBox<String> listaTituloProfesional;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    /**
     * Este metodo oculta las etiquetas.
     */
    private void ocultarEtiquetas() {
        this.lblValidarNombre.setVisible(false);
        this.lblValidarApellido.setVisible(false);
        this.lblValidarTituloProfesional.setVisible(false);
        this.lblValidarPaisGraduacion.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblNombreVacio.setVisible(false);
        this.lblApellidoVacio.setVisible(false);
        this.lblTituloVacio.setVisible(false);
        this.lblPaisVacio.setVisible(false);
    }
    /**
     * Este metodo carga la lista de los paises de graduacion.
     */
    private void cargarListaPaisesGraduacion() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> paisesEnSistema = sistema.devolverListaPaises();
        this.listaPaisGraduacion.setModel(modelo);
        this.listaPaisGraduacion.addItem("Seleccione...");
        for (int i = 0; i < paisesEnSistema.size(); i++) {
            this.listaPaisGraduacion.addItem(paisesEnSistema.get(i));
        }
    }
    /**
     * Este metodo muestra los errores.
     * @param nombre recibe el nombre
     * @param apellido el apellido
     * @param tituloProfesional el titulo
     * @param paisGraduacion y el pais donde se graduo
     */
    private void mostrarErrores(String nombre, String apellido,
            String tituloProfesional, String paisGraduacion) {
        if (nombre.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        }
        if (apellido.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        }
        if (tituloProfesional.equals("Seleccione...")) {
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
            this.lblTituloVacio.setVisible(true);
        }
        if (paisGraduacion.equals("Seleccione...")) {
            this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarPaisGraduacion.setVisible(true);
            this.lblPaisVacio.setVisible(true);
        }
    }

}
