package interfaz;

import dominio.Persona;
import dominio.Sistema;

public class IngresarContrasena extends javax.swing.JFrame {

    private Sistema sistema;
    private boolean esUsuario;
    
    public IngresarContrasena(Sistema unSistema, boolean tipoUsuario) {
        this.sistema = unSistema;
        this.esUsuario = tipoUsuario;
        initComponents();
        this.setLocationRelativeTo(null);
        lblContrasenaIncorrecta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContrasena = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        passContrasena = new javax.swing.JPasswordField();
        lblContrasenaIncorrecta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblContrasena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContrasena.setText("Contraseña ");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblContrasenaIncorrecta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContrasenaIncorrecta.setForeground(new java.awt.Color(255, 51, 51));
        lblContrasenaIncorrecta.setText("Contraseña incorrecta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfirmar)
                        .addGap(71, 71, 71)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContrasena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContrasenaIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passContrasena)
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContrasenaIncorrecta)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Persona personaLogueada = sistema.getPersonaLogueada();
        if(sistema.ValidarContrasena(personaLogueada, passContrasena.getText())){
            if(esUsuario){
                VentanaMenuPrincipalUsuario ventanaPrincipalUsuarios = new VentanaMenuPrincipalUsuario(sistema);
                this.setVisible(false);
                ventanaPrincipalUsuarios.setVisible(true);
            }
            else
            {
                VentanaMenuPrincipalProfesional ventanaPrincipalProfesional = new VentanaMenuPrincipalProfesional(sistema);
                this.setVisible(false);
                ventanaPrincipalProfesional.setVisible(true);
            }
        }
        else
        {
            lblContrasenaIncorrecta.setVisible(true);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblContrasenaIncorrecta;
    private javax.swing.JPasswordField passContrasena;
    // End of variables declaration//GEN-END:variables
}
