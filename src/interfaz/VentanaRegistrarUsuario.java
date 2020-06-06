package interfaz;

import dominio.Ingesta;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * Esta ventana permite registrar un usuario.
 * @author Usuario
 */
public class VentanaRegistrarUsuario extends javax.swing.JDialog {
    /**
     *  Esta variable hace referencia al sistema.
     */
    private Sistema sistema;
    /**
     *  Esta variable hace referencia a la foto de perfil.
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
    public VentanaRegistrarUsuario(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.fotoDePerfilActual = new ImageIcon(getClass().
                getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        this.primeraVez = true;
        ocultarEtiquetas();
        cargarListaPreferencias();
        cargarListaRestricciones();
        cargarListaPaises();
        Calendar fecha = new GregorianCalendar();
        this.dateChooserFechaNacimiento.setMaxDate(fecha);
        this.primeraVez = false;
    }
    /**
     * Este metodo devuelve el sistema.
     * @return el sistema
     */
    public Sistema getSistema() {
        return sistema;
    }
    /**
     * Este metodo modifica el sistema.
     * @param unSistema es el sistema por el cual se va a cambiar
     */
    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }
    /**
    * Este metodo devuelve la foto de perfil.
    * @return retorna la foto
    */
    public ImageIcon getFotoDePerfilActual() {
        return fotoDePerfilActual;
    }
    /**
     * Este metodo modifica la foto de perfil.
     * @param unaFoto es la foto por la cual se quiere cambiar
     */
    public void setFotoDePerfilActual(ImageIcon unaFoto) {
        this.fotoDePerfilActual = unaFoto;
    }
    /**
     * Este metodo devuelve true si es la primera vez en el sistema.
     * @return retorna un booleano
     */
    public boolean getPrimeraVezEnSistema() {
        return primeraVez;
    }
    /**
     * Este metodo modifica la variable primeravez.
     * @param primera es el booleano por el cual se desea modificar
     */
    public void setPrimeraVezEnSistema(boolean primera) {
        this.primeraVez = primera;
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
        lblNuevoUsuario = new javax.swing.JLabel();
        lblIconoNuevoUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTxtPreferencias = new javax.swing.JLabel();
        rdBtnVerduras = new javax.swing.JRadioButton();
        rdBtnHarinas = new javax.swing.JRadioButton();
        rdBtnFrutas = new javax.swing.JRadioButton();
        rdBtnCarnesRojas = new javax.swing.JRadioButton();
        rdBtnCarnesBlancas = new javax.swing.JRadioButton();
        lblTxtRestricciones = new javax.swing.JLabel();
        rdBtnCeliaco = new javax.swing.JRadioButton();
        rdBtnDiabetes = new javax.swing.JRadioButton();
        rdBtnVegano = new javax.swing.JRadioButton();
        btnIngresarUsuarioASistema = new javax.swing.JButton();
        lblTxtNacionalidad = new javax.swing.JLabel();
        listaNacionalidad = new javax.swing.JComboBox<String>();
        lblTxtFechaNac = new javax.swing.JLabel();
        rdBtnIntoleranteLactosa = new javax.swing.JRadioButton();
        dateChooserFechaNacimiento = new datechooser.beans.DateChooserCombo();
        btnIngresarFotoPerfil = new javax.swing.JButton();
        lblValidarNombre = new javax.swing.JLabel();
        lblValidarApellido = new javax.swing.JLabel();
        lblValidarNacionalidad = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblNombreVacio = new javax.swing.JLabel();
        lblApellidoVacio = new javax.swing.JLabel();
        lblPaisVacio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(58, 80, 92));
        panel1.setMaximumSize(new java.awt.Dimension(270, 800));

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

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 270, 800);

        panel2.setBackground(new java.awt.Color(58, 80, 92));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setMaximumSize(new java.awt.Dimension(800, 800));
        panel2.setMinimumSize(new java.awt.Dimension(800, 800));
        panel2.setPreferredSize(new java.awt.Dimension(800, 800));
        panel2.setLayout(null);

        lblNuevoUsuario.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoUsuario.setForeground(new java.awt.Color(153, 255, 153));
        lblNuevoUsuario.setText("Nuevo Usuario");
        panel2.add(lblNuevoUsuario);
        lblNuevoUsuario.setBounds(203, 36, 475, 91);

        lblIconoNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        panel2.add(lblIconoNuevoUsuario);
        lblIconoNuevoUsuario.setBounds(85, 27, 100, 100);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(153, 255, 153));
        lblNombre.setText("Nombre");
        panel2.add(lblNombre);
        lblNombre.setBounds(31, 182, 181, 38);

        lblApellido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(153, 255, 153));
        lblApellido.setText("Apellido");
        panel2.add(lblApellido);
        lblApellido.setBounds(31, 231, 171, 38);

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        panel2.add(txtNombre);
        txtNombre.setBounds(260, 180, 181, 38);

        txtApellido.setBackground(new java.awt.Color(227, 227, 227));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido.setMaximumSize(new java.awt.Dimension(6, 26));
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        panel2.add(txtApellido);
        txtApellido.setBounds(260, 230, 181, 34);

        lblTxtPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtPreferencias.setForeground(new java.awt.Color(153, 255, 153));
        lblTxtPreferencias.setText("Preferencias");
        panel2.add(lblTxtPreferencias);
        lblTxtPreferencias.setBounds(31, 423, 265, 38);

        rdBtnVerduras.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnVerduras.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnVerduras.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnVerduras.setText("Preferencia 3");
        panel2.add(rdBtnVerduras);
        rdBtnVerduras.setBounds(31, 544, 195, 35);

        rdBtnHarinas.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnHarinas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnHarinas.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnHarinas.setText("Preferencia 5");
        panel2.add(rdBtnHarinas);
        rdBtnHarinas.setBounds(31, 620, 161, 35);

        rdBtnFrutas.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnFrutas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnFrutas.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnFrutas.setText("Preferencia 4");
        panel2.add(rdBtnFrutas);
        rdBtnFrutas.setBounds(31, 582, 161, 35);

        rdBtnCarnesRojas.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnCarnesRojas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesRojas.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnCarnesRojas.setText("Preferencia 1");
        panel2.add(rdBtnCarnesRojas);
        rdBtnCarnesRojas.setBounds(31, 468, 218, 35);

        rdBtnCarnesBlancas.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnCarnesBlancas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesBlancas.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnCarnesBlancas.setText("Preferencia 2");
        panel2.add(rdBtnCarnesBlancas);
        rdBtnCarnesBlancas.setBounds(31, 506, 209, 35);

        lblTxtRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtRestricciones.setForeground(new java.awt.Color(153, 255, 153));
        lblTxtRestricciones.setText("Restricciones");
        panel2.add(lblTxtRestricciones);
        lblTxtRestricciones.setBounds(469, 423, 208, 38);

        rdBtnCeliaco.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnCeliaco.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCeliaco.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnCeliaco.setText("Restriccion 4");
        panel2.add(rdBtnCeliaco);
        rdBtnCeliaco.setBounds(469, 582, 153, 35);

        rdBtnDiabetes.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnDiabetes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnDiabetes.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnDiabetes.setText("Restriccion 1");
        panel2.add(rdBtnDiabetes);
        rdBtnDiabetes.setBounds(469, 468, 175, 35);

        rdBtnVegano.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnVegano.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnVegano.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnVegano.setText("Restriccion 2");
        panel2.add(rdBtnVegano);
        rdBtnVegano.setBounds(469, 506, 153, 35);

        btnIngresarUsuarioASistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnIngresarUsuarioASistema.setBorderPainted(false);
        btnIngresarUsuarioASistema.setContentAreaFilled(false);
        btnIngresarUsuarioASistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUsuarioASistemaActionPerformed(evt);
            }
        });
        panel2.add(btnIngresarUsuarioASistema);
        btnIngresarUsuarioASistema.setBounds(654, 657, 99, 94);

        lblTxtNacionalidad.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtNacionalidad.setForeground(new java.awt.Color(153, 255, 153));
        lblTxtNacionalidad.setText("Nacionalidad");
        panel2.add(lblTxtNacionalidad);
        lblTxtNacionalidad.setBounds(30, 280, 204, 38);

        listaNacionalidad.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaNacionalidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaNacionalidadItemStateChanged(evt);
            }
        });
        panel2.add(listaNacionalidad);
        listaNacionalidad.setBounds(260, 280, 270, 40);

        lblTxtFechaNac.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtFechaNac.setForeground(new java.awt.Color(153, 255, 153));
        lblTxtFechaNac.setText("Fecha de nacimiento");
        panel2.add(lblTxtFechaNac);
        lblTxtFechaNac.setBounds(30, 340, 328, 38);

        rdBtnIntoleranteLactosa.setBackground(new java.awt.Color(58, 80, 92));
        rdBtnIntoleranteLactosa.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnIntoleranteLactosa.setForeground(new java.awt.Color(153, 255, 153));
        rdBtnIntoleranteLactosa.setText("Restriccion 3");
        rdBtnIntoleranteLactosa.setActionCommand("");
        panel2.add(rdBtnIntoleranteLactosa);
        rdBtnIntoleranteLactosa.setBounds(469, 544, 276, 35);

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
    dateChooserFechaNacimiento.setBounds(370, 340, 150, 30);

    btnIngresarFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png"))); // NOI18N
    btnIngresarFotoPerfil.setBorderPainted(false);
    btnIngresarFotoPerfil.setContentAreaFilled(false);
    btnIngresarFotoPerfil.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIngresarFotoPerfilActionPerformed(evt);
        }
    });
    panel2.add(btnIngresarFotoPerfil);
    btnIngresarFotoPerfil.setBounds(640, 160, 124, 117);

    lblValidarNombre.setForeground(new java.awt.Color(255, 255, 255));
    lblValidarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
    panel2.add(lblValidarNombre);
    lblValidarNombre.setBounds(460, 180, 32, 44);

    lblValidarApellido.setForeground(new java.awt.Color(255, 255, 255));
    lblValidarApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
    panel2.add(lblValidarApellido);
    lblValidarApellido.setBounds(460, 230, 32, 44);

    lblValidarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
    lblValidarNacionalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
    panel2.add(lblValidarNacionalidad);
    lblValidarNacionalidad.setBounds(540, 280, 32, 44);

    lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
    lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
    lblDatosIncorrectos.setText("Aún quedan datos incorrectos");
    panel2.add(lblDatosIncorrectos);
    lblDatosIncorrectos.setBounds(309, 683, 341, 26);

    lblNombreVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
    lblNombreVacio.setForeground(new java.awt.Color(240, 128, 128));
    lblNombreVacio.setText("Dato vacío");
    panel2.add(lblNombreVacio);
    lblNombreVacio.setBounds(500, 180, 134, 38);

    lblApellidoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
    lblApellidoVacio.setForeground(new java.awt.Color(240, 128, 128));
    lblApellidoVacio.setText("Dato vacío");
    panel2.add(lblApellidoVacio);
    lblApellidoVacio.setBounds(500, 230, 134, 38);

    lblPaisVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
    lblPaisVacio.setForeground(new java.awt.Color(240, 128, 128));
    lblPaisVacio.setText("Dato vacío");
    panel2.add(lblPaisVacio);
    lblPaisVacio.setBounds(580, 280, 120, 38);

    getContentPane().add(panel2);
    panel2.setBounds(270, 0, 950, 800);

    pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo hace referencia al boton home.
     * @param evt recibe este parametro
     */
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed
    /**
     * Esta metodo es del boton para ingresar un usuario al sistema.
     * @param evt recibe este parametro
     */
    private void btnIngresarUsuarioASistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUsuarioASistemaActionPerformed
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        ArrayList<String> preferencias = new ArrayList<>();
        ArrayList<String> restricciones = new ArrayList<>();
        ArrayList<Ingesta> alimentosIngeridosPorFecha = new ArrayList<>();
        String nacionalidad = (String) this.listaNacionalidad.getSelectedItem();
        String fechaNacimiento = this.dateChooserFechaNacimiento.getText();
        if (nombre.equals("") || apellido.equals("") || nacionalidad.
                equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            mostrarErrores(nombre, apellido, nacionalidad);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            agregarPreferenciasUsuario(preferencias);
            agregarRestriccionesUsuario(restricciones);
            boolean seAgregoUsuario = this.getSistema().crearUsuario(nombre,
            apellido, fechaNacimiento, this.fotoDePerfilActual, nacionalidad,
            preferencias, restricciones, alimentosIngeridosPorFecha);
            if (seAgregoUsuario) {
                this.txtNombre.setText("");
                this.txtApellido.setText("");
                VentanaMenuPrincipal vPrincipal =
                        new VentanaMenuPrincipal(sistema);
                this.setVisible(false);
                vPrincipal.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnIngresarUsuarioASistemaActionPerformed
    /**
     * Este metodo es del boton para ingresar la foto de perfil.
     * @param evt recibe esto por parametro
     */
    private void btnIngresarFotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFotoPerfilActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file =
                new FileNameExtensionFilter("PNG", "png");
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
     * Este metodo es del nombre ingresado.
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
     * Este metodo es del apellido ingresado.
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
     * Este metodo es para guardar los datos al cerrar la ventana.
     * @param evt recibe esto por parametro
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Este metodo es sobre la lista de nacionalidad.
     * @param evt recibe esto por parametro
     */
    private void listaNacionalidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaNacionalidadItemStateChanged
        if (!this.primeraVez) {
            String nacionalidadIngresada = (String) listaNacionalidad.
                    getSelectedItem();
            if (nacionalidadIngresada.equals("Seleccione...")) {
                this.lblValidarNacionalidad.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarNacionalidad.setVisible(true);
                this.lblPaisVacio.setVisible(true);
            } else {
                this.lblValidarNacionalidad.setIcon(new ImageIcon(getClass().
                        getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarNacionalidad.setVisible(true);
                this.lblPaisVacio.setVisible(false);
            }
        }

    }//GEN-LAST:event_listaNacionalidadItemStateChanged
    /**
     * Este metodo es para agregar las restricciones al usuario.
     * @param restricciones recibe las restricciones a agregar
     */
    private void agregarRestriccionesUsuario(ArrayList<String> restricciones) {
        if (this.rdBtnCeliaco.isSelected()) {
            restricciones.add("Celíaco");
        }
        if (this.rdBtnDiabetes.isSelected()) {
            restricciones.add("Diabético");
        }
        if (this.rdBtnVegano.isSelected()) {
            restricciones.add("Veganismo");
        }
        if (this.rdBtnIntoleranteLactosa.isSelected()) {
            restricciones.add("Intolerancia a la lactosa");
        }
    }
    /**
     * Este metodo es para agregar las preferencias al usuario.
     * @param preferencias recibe las preferencias a agregar
     */
    private void agregarPreferenciasUsuario(ArrayList<String> preferencias) {
        if (this.rdBtnCarnesBlancas.isSelected()) {
            preferencias.add("Carnes Blancas");
        }
        if (this.rdBtnCarnesRojas.isSelected()) {
            preferencias.add("Carnes Rojas");
        }
        if (this.rdBtnFrutas.isSelected()) {
            preferencias.add("Frutas");
        }
        if (this.rdBtnVerduras.isSelected()) {
            preferencias.add("Verduras");
        }
        if (this.rdBtnHarinas.isSelected()) {
            preferencias.add("Harinas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarFotoPerfil;
    private javax.swing.JButton btnIngresarUsuarioASistema;
    private datechooser.beans.DateChooserCombo dateChooserFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoVacio;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblIconoNuevoUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreVacio;
    private javax.swing.JLabel lblNuevoUsuario;
    private javax.swing.JLabel lblPaisVacio;
    private javax.swing.JLabel lblTxtFechaNac;
    private javax.swing.JLabel lblTxtNacionalidad;
    private javax.swing.JLabel lblTxtPreferencias;
    private javax.swing.JLabel lblTxtRestricciones;
    private javax.swing.JLabel lblValidarApellido;
    private javax.swing.JLabel lblValidarNacionalidad;
    private javax.swing.JLabel lblValidarNombre;
    private javax.swing.JComboBox<String> listaNacionalidad;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JRadioButton rdBtnCarnesBlancas;
    private javax.swing.JRadioButton rdBtnCarnesRojas;
    private javax.swing.JRadioButton rdBtnCeliaco;
    private javax.swing.JRadioButton rdBtnDiabetes;
    private javax.swing.JRadioButton rdBtnFrutas;
    private javax.swing.JRadioButton rdBtnHarinas;
    private javax.swing.JRadioButton rdBtnIntoleranteLactosa;
    private javax.swing.JRadioButton rdBtnVegano;
    private javax.swing.JRadioButton rdBtnVerduras;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    /**
     * Este metodo es para ocultar etiquetas.
     */
    private void ocultarEtiquetas() {
        this.lblValidarNombre.setVisible(false);
        this.lblValidarApellido.setVisible(false);
        this.lblValidarNacionalidad.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblNombreVacio.setVisible(false);
        this.lblApellidoVacio.setVisible(false);
        this.lblPaisVacio.setVisible(false);
    }
    /**
     * Este metodo es para cargar la lista de preferencias.
     */
    private void cargarListaPreferencias() {
        Sistema.Preferencias[] listaPreferencias = new Sistema.Preferencias[5];
        listaPreferencias[0] = Sistema.Preferencias.CarnesBlancas;
        listaPreferencias[1] = Sistema.Preferencias.CarnesRojas;
        listaPreferencias[2] = Sistema.Preferencias.Frutas;
        listaPreferencias[3] = Sistema.Preferencias.Harinas;
        listaPreferencias[4] = Sistema.Preferencias.Verduras;
        for (int i = 0; i < listaPreferencias.length; i++) {
            if (i == 0) {
                this.rdBtnCarnesRojas.setText("Carnes Rojas");
            }
            if (i == 1) {
                this.rdBtnCarnesBlancas.setText("Carnes Blancas");
            }
            if (i == 2) {
                this.rdBtnFrutas.setText("Frutas");
            }
            if (i == 3) {
                this.rdBtnHarinas.setText("Harinas");
            }
            if (i == 4) {
                this.rdBtnVerduras.setText("Verduras");
            }
        }
    }
    /**
     * Este metodo es para cargar la lista de restricciones.
     */
    private void cargarListaRestricciones() {
        Sistema.Restricciones[] listaRestricciones = new Sistema.
                Restricciones[4];
        listaRestricciones[0] = Sistema.Restricciones.Celiaquia;
        listaRestricciones[1] = Sistema.Restricciones.Diabetes;
        listaRestricciones[2] = Sistema.Restricciones.IntoleranciaLactosa;
        listaRestricciones[3] = Sistema.Restricciones.Veganismo;
        for (int i = 0; i < listaRestricciones.length; i++) {
            if (i == 0) {
                this.rdBtnCeliaco.setText("Celiaquía");
            }
            if (i == 1) {
                this.rdBtnDiabetes.setText("Diabetes");
            }
            if (i == 2) {
                this.rdBtnIntoleranteLactosa.
                        setText("Intolerante a la lactosa");
            }
            if (i == 3) {
                this.rdBtnVegano.setText("Veganismo");
            }
        }
    }
    /**
     * Este metodo es para cargar la lista de paises.
     */
    private void cargarListaPaises() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> nacionalidaesEnSistema = sistema.
                devolverListaPaises();
        this.listaNacionalidad.setModel(modelo);
        this.listaNacionalidad.addItem("Seleccione...");
        for (int i = 0; i < nacionalidaesEnSistema.size(); i++) {
            this.listaNacionalidad.addItem(nacionalidaesEnSistema.get(i));
        }
    }
    /**
     * Este metodo es para mostrar errores.
     * @param nombre recibe el nombre
     * @param apellido su apellido
     * @param nacionalidad y la nacionalidad
     */
    private void mostrarErrores(String nombre, String apellido,
            String nacionalidad) {
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
        if (nacionalidad.equals("Seleccione...")) {
            this.lblValidarNacionalidad.setIcon(new ImageIcon(getClass().
                    getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNacionalidad.setVisible(true);
            this.lblPaisVacio.setVisible(true);
        }
    }

}
