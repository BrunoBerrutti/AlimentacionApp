package interfaz;

import dominio.Persona;
import dominio.Sistema;
import java.awt.Image;
import java.awt.Toolkit;
/**
 * Esta ventana es el menu principal de la aplicacion.
 * @author Usuario
 */
public class VentanaMenuPrincipal extends javax.swing.JDialog {
    /**
     * Esta variable hace referencia al sistema.
     */
    private Sistema sistema;
    /**
     * Este metodo inicializa la ventana principal.
     * @param unSistema recibe el sistema por parametro
     */
    public VentanaMenuPrincipal(Sistema unSistema) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.listaUsuariosVentana.setListData(sistema.
                getListaUsuarios().toArray());
        this.listaProfesionalesVentana.setListData(sistema.
                getListaProfesionales().toArray());
    }
    /**
     * Este metodo retorna el icon image.
     * @return retorna un icono
     */
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.
                getSystemResource("Imagenes/Imagen5.png"));
        return retValue;
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
     * @param unSistema este es el sistema por el cual se cambia el existente
     */
    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }
    /**
     * Este metodo suprime los warnings no chequeados.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblNuevoUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaUsuariosVentana = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProfesionalesVentana = new javax.swing.JList();
        btnAgregarUsuario = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        btnAgregarProfesional1 = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevabrocco.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(262, 800));
        jLabel1.setMinimumSize(new java.awt.Dimension(262, 800));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        getContentPane().add(panel1);
        panel1.setBounds(0, 10, 270, 790);

        panel2.setBackground(new java.awt.Color(58, 80, 92));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(null);

        lblNuevoUsuario.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciosesion.png"))); // NOI18N
        panel2.add(lblNuevoUsuario);
        lblNuevoUsuario.setBounds(70, 50, 530, 91);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(153, 255, 153));
        lblNombre.setText("Profesional");
        panel2.add(lblNombre);
        lblNombre.setBounds(450, 200, 181, 38);

        listaUsuariosVentana.setBackground(new java.awt.Color(86, 107, 119));
        listaUsuariosVentana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaUsuariosVentana.setForeground(new java.awt.Color(255, 255, 255));
        listaUsuariosVentana.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUsuariosVentana.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaUsuariosVentanaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaUsuariosVentana);

        panel2.add(jScrollPane2);
        jScrollPane2.setBounds(80, 250, 230, 330);

        listaProfesionalesVentana.setBackground(new java.awt.Color(86, 107, 119));
        listaProfesionalesVentana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaProfesionalesVentana.setForeground(new java.awt.Color(255, 255, 255));
        listaProfesionalesVentana.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProfesionalesVentanaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaProfesionalesVentana);

        panel2.add(jScrollPane1);
        jScrollPane1.setBounds(430, 250, 230, 330);

        btnAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla (211).png"))); // NOI18N
        btnAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarUsuarioMouseClicked(evt);
            }
        });
        panel2.add(btnAgregarUsuario);
        btnAgregarUsuario.setBounds(10, 610, 320, 90);

        lblNombre1.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(153, 255, 153));
        lblNombre1.setText("Usuario");
        panel2.add(lblNombre1);
        lblNombre1.setBounds(90, 200, 181, 38);

        btnAgregarProfesional1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarprofesional.png"))); // NOI18N
        btnAgregarProfesional1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProfesional1MouseClicked(evt);
            }
        });
        panel2.add(btnAgregarProfesional1);
        btnAgregarProfesional1.setBounds(410, 620, 280, 70);

        btnCerrarSistema.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema.setBorderPainted(false);
        btnCerrarSistema.setContentAreaFilled(false);
        btnCerrarSistema.setFocusPainted(false);
        btnCerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistemaActionPerformed(evt);
            }
        });
        panel2.add(btnCerrarSistema);
        btnCerrarSistema.setBounds(730, 10, 50, 50);

        getContentPane().add(panel2);
        panel2.setBounds(280, 10, 950, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo es para guardar los datos.
     * @param evt recibe esto por parametro
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Este metodo es de la lista de usuarios.
     * @param evt recibe esto por parametro
     */
    private void listaUsuariosVentanaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUsuariosVentanaValueChanged
        this.sistema.setPersonaLogueada((Persona) listaUsuariosVentana.
                getSelectedValue());
        VentanaMenuPrincipalUsuario ventanaPrincipalUsuarios;
        ventanaPrincipalUsuarios = new VentanaMenuPrincipalUsuario(sistema);
        this.setVisible(false);
        ventanaPrincipalUsuarios.setVisible(true);
    }//GEN-LAST:event_listaUsuariosVentanaValueChanged
    /**
     * Este metodo es de la lista de profesionales.
     * @param evt recibe esto por parametro
     */
    private void listaProfesionalesVentanaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProfesionalesVentanaValueChanged
        this.sistema.setPersonaLogueada((Persona) listaProfesionalesVentana.
                getSelectedValue());
        VentanaMenuPrincipalProfesional ventanaPrincipalProfesionales;
        ventanaPrincipalProfesionales = new
         VentanaMenuPrincipalProfesional(sistema);
        this.setVisible(false);
        ventanaPrincipalProfesionales.setVisible(true);
    }//GEN-LAST:event_listaProfesionalesVentanaValueChanged
    /**
     * Este metodo es el boton de agregar usuario.
     * @param evt recibe esto por parametro
     */
    private void btnAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioMouseClicked
        VentanaRegistrarUsuario unA = new VentanaRegistrarUsuario(sistema);
        this.setVisible(false);
        unA.setVisible(true);
    }//GEN-LAST:event_btnAgregarUsuarioMouseClicked

   /**
     * Este es el metodo del boton de agregar profesioanles.
     * @param evt recibe esto por parametro
     */
    private void btnAgregarProfesional1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProfesional1MouseClicked
        VentanaRegistrarProfesional ventanaRegProfesional;
        ventanaRegProfesional = new VentanaRegistrarProfesional(sistema);
        this.setVisible(false);
        ventanaRegProfesional.setVisible(true);
    }//GEN-LAST:event_btnAgregarProfesional1MouseClicked
    /**
     * Este metodo es del boton de cerrar el sistema.
     * @param evt recibe esto por parametro
     */
    private void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaActionPerformed
        this.sistema.guardarDatosSistema();
        this.dispose();
    }//GEN-LAST:event_btnCerrarSistemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarProfesional1;
    private javax.swing.JLabel btnAgregarUsuario;
    private javax.swing.JButton btnCerrarSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNuevoUsuario;
    private javax.swing.JList listaProfesionalesVentana;
    private javax.swing.JList listaUsuariosVentana;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables

}
